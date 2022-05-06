package at.clemens.atm;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double balance = 0;
            while (true) {
                System.out.println("Wählen sie: ");
                System.out.println("1 für Einzahlen");
                System.out.println("2 für Abheben");
                System.out.println("3 für Kontostand");
                System.out.println("4 für Beenden");

                int input = scanner.nextInt();

                if (input == 1) {
                    System.out.println("Wieviel möchten sie einzahlen?");
                    double cashinput = scanner.nextDouble();
                    balance += cashinput;
                    System.out.println("Sie haben " + cashinput + "€ eingezahlt. Neuer Kontostand " + balance + "€");
                }
                if (input == 2) {
                    System.out.println("Wieviel möchten sie abheben?");
                    double cashoutput = scanner.nextDouble();
                    balance -= cashoutput;
                    System.out.println("Sie haben " + cashoutput + "€ abgehoben Neuer Kontostand" + balance + "€");
                }
                if (input == 3) {
                    System.out.println("Sie haben momentan " + balance + "€ auf dem Konto.");
                }
                if (input == 4) {
                    System.out.println("Programm wird heruntergefahren.");
                    break;
                }
            }
        }
    }
}
