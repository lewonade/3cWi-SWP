package at.clemens.loops2;

public class Loops_zwei {
    public static void main(String[] args) {
        int zwischenergebnis = 0;
        for (int i = 0; i < 1000 + 1; i++) {
            zwischenergebnis += i;
        }
        System.out.println(zwischenergebnis);
    }
}
