package at.clemens.caesar;

import java.util.Scanner;

/**
 * Caesar
 */
public class Caesar {

    public static void main(String[] args) {
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1 für Encrypten");
            System.out.println("2 für Decrypten");
            System.out.println("3 für Beenden");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Gib den zu Verschlüsselnden Text ein");
                String text = scanner.next();
                int offset = 2;
                char[] inputArray = text.toCharArray();
                char[] EncryptedArray = encrypt(offset, inputArray);
                System.out.println("");
                System.out.println(EncryptedArray);
                System.out.println("");
            }

            if (input == 2) {
                System.out.println("Gib den zu Entschlüsselnden Text ein");
                String text = scanner.next();
                int offset = -2;
                char[] inputArray = text.toCharArray();
                char[] DecryptedArray = encrypt(offset, inputArray);
                System.out.println("");
                System.out.println(DecryptedArray);
                System.out.println("");
            }

            if (input == 3) {
                break;
            }
        }
        // String text = scanner.nextLine();

        // int offset = 2;

        // char[] inputArray = text.toCharArray();
        // char[] EncryptedArray = encrypt(offset, inputArray);
        // char[] DecryptedArray = decrypt(offset, inputArray);

        // System.out.println(EncryptedArray);
        // System.out.println(DecryptedArray);
    }

    public static char[] encrypt(int offset, char[] inputArray) {
        char[] EncryptedArray = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {

            int offsetting = (inputArray[i] + offset);

            EncryptedArray[i] = (char) (offsetting);

        }
        return EncryptedArray;
    }

    public static char[] decrypt(int offset, char[] inputArray) {
        char[] DecryptedArray = new char[inputArray.length];
        int offsetting;
        for (int i = 0; i < inputArray.length; i++) {

            offsetting = (inputArray[i] - offset);

            DecryptedArray[i] = (char) (offsetting);

        }
        return DecryptedArray;
    }
}
