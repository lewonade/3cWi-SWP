package at.clemens.tests;

import java.util.Scanner;

public class coffee {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Um die Maschiene hochzufahren drücken sie '1' ");
            int input = scanner.nextInt();

            // Wasser startet mit 100 ml
            int x = 100;
            // Bohnen startet mit 5 g
            int c = 5;

            int f = 0;
            int g = 0;

            while (true) {
                if (input == 1) {

                    // Ich habe es leider nicht ganz hingekriegt, Falls sich die Bohnen oder das
                    // Wasser sich auffüllen machen sie es um fixe mengen. Nicht das sie sich bis zu
                    // ihrem Limit auffüllen.
                    // Die Kaffeemaschiene started auch schon mit einer vorgegebenen Menge

                    int water = x;
                    int beans = c;
                    int amount = f;
                    int strenght = g;

                    System.out.println(" ");
                    System.out.println("1 für Kaffee-Menge anpassen");
                    System.out.println("2 für Stärke auswählen");
                    System.out.println("3 für Wasser nachfüllen");
                    System.out.println("4 für Bohnen nachfüllen");
                    System.out.println("5 für Kaffee rauslassen");
                    System.out.println("6 zum Herunterfahren");
                    System.out.println(" ");
                    System.out.println("Es sind noch " + water + " ml Wasser in dem Wassertank übrig");
                    System.out.println("Es sind noch " + beans + " g Bohnen in dem Bohnenbehälter übrig");
                    System.out.println(" ");

                    int selection = scanner.nextInt();

                    if (selection == 1) {
                        System.out.println("Wie viel Kaffee hätten sie gerne?");
                        System.out.println(" '40' ml - '200' ml sind möglich.");
                        f += scanner.nextInt();
                    }

                    if (selection == 2) {
                        System.out.println("Wie stark hätten sie gerne Ihren Kaffee");
                        System.out.println("von '1 - 10' ");
                        g += scanner.nextInt();
                    }

                    if (selection == 3) {
                        System.out.println("Wasser wird nachgefüllt...");
                        x += 1000;

                    }

                    if (selection == 4) {
                        System.out.println("Bohnen werden nachgefüllt...");
                        c += 100;
                    }

                    if (selection == 5) {
                        System.out.println("Wollen sie den Kaffee rauslassen?");
                        System.out.println("    1 = Ja");
                        System.out.println("    2 = Nein");
                        int choosing = scanner.nextInt();

                        if (choosing == 1) {
                            if (water < amount) {
                                System.out.println("Du hast nicht genug Wasser im Tank!");
                            } else {
                                x -= amount;
                            }

                            if (strenght > beans) {
                                System.out.println("Du hast nicht genug Bohnen im Tank!");
                            } else {
                                c -= strenght;
                            }
                        }

                        if (choosing == 2) {
                        }

                        System.out.println(
                                "Hier haben sie ihren Kaffee mit Stärke " + strenght + " und " + amount + " ml Wasser");

                    }

                    if (selection == 6) {
                        System.out.println("Die Maschiene fährt sich nun Herunter");
                        break;
                    }

                }

            }
        }
    }
}