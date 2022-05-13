package at.clemens.caesar;

import java.util.Scanner;

/**
 * Caesar
 */
public class Caesar {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String text = scanner.nextLine();

            int offset = 2;

            char[] inputArray = text.toCharArray();
            char[] EncryptedArray = encrypt(offset, inputArray);
            char[] DecryptedArray = decrypt(offset, inputArray);

            System.out.println(EncryptedArray);
            System.out.println(DecryptedArray);
        }
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
