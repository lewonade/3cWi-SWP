package at.clemens.tests;

import java.util.Scanner;

public class washingmachine {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            boolean a = false;
            String c = "";

            while (true) {
                System.out.println("");
                System.out.println("Um die Maschiene hochzufahren drücken sie '1'");
                System.out.println("Um Waschmittel nachzufüllen drücken sie '2'");
                System.out.println("");
                int input = scanner.nextInt();

                boolean detergent = a;
                int speed = 0;
                String mode = c;

                if (input == 1) {
                    System.out.println("");
                    System.out.println("Welchen Modus würden sie gerne benutzen");
                    System.out.println("Schnell - '1'");
                    System.out.println("Mittel - '2'");
                    System.out.println("Langsam - '3'");
                    System.out.println("");

                    int input2 = scanner.nextInt();

                    if (input2 == 1) {
                        speed += 40;
                        mode = "Schnell";
                        if (detergent == true) {
                            System.out.println("Die Waschmaschine läuft nun mit dem Programm " + mode
                                    + ". Voruassichtliche Dauer: "
                                    + speed + " Minuten ");
                            break;
                        }
                        System.out.println((""));
                        System.out.println("Sie haben nicht genug Waschmittel, füllen sie es nach!");
                        System.out.println("");

                    }
                    if (input2 == 2) {
                        speed += 60;
                        mode = "Mittel";
                        if (detergent == true) {
                            System.out.println("Die Waschmaschine läuft nun mit dem Programm " + mode
                                    + ". Voruassichtliche Dauer: "
                                    + speed + " Minuten ");
                            break;
                        }
                        System.out.println((""));
                        System.out.println("Sie haben nicht genug Waschmittel, füllen sie es nach!");
                        System.out.println("");
                    }
                    if (input2 == 3) {
                        speed += 120;
                        mode = "Langsam";
                        if (detergent == true) {
                            System.out.println("Die Waschmaschine läuft nun mit dem Programm " + mode
                                    + ". Voruassichtliche Dauer: "
                                    + speed + " Minuten ");
                            break;
                        }
                        System.out.println((""));
                        System.out.println("Sie haben nicht genug Waschmittel, füllen sie es nach!");
                        System.out.println("");
                    }

                }
                if (input == 2) {
                    a = true;
                }

            }

        }

    }
}