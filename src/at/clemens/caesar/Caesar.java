package at.clemens.caesar;

import java.util.Scanner;

/**
 * Caesar
 */
public class Caesar {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Gib den zu verschlüsselden Text ein:");

            String text = scanner.nextLine();

            int offset = 2;

            char[] inputArray = text.toCharArray();
            char[] EncryptedArray = encrypt(offset, inputArray);

            System.out.println(EncryptedArray);
        }
    }

    public static char[] encrypt(int offset, char[] inputArray) {
        char[] EncryptedArray = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {

            int offsetting = (inputArray[i] + offset) % 128;

            EncryptedArray[i] = (char) (offsetting);

        }
        return EncryptedArray;
    }

}
