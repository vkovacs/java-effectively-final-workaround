package hu.crs.effectivelyfinal;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        var ref = new Ref();

        list.forEach(i -> {
            if (i % 2 == 0) {
                ref.inc();
            }
        });

        System.out.println(ref.getCount());
    }

    static class Ref {
        int count = 0;

        public void inc() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }
}
