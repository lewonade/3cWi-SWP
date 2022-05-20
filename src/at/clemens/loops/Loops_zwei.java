package at.clemens.loops;

public class Loops_zwei {
    private static int test(int bisZahl) {

        int zwischenergebnis = 0;
        for (int i = 1; i <= 1000; i++) {
            zwischenergebnis += i;
            System.out.println(zwischenergebnis);
        }
        return zwischenergebnis;

    }
}