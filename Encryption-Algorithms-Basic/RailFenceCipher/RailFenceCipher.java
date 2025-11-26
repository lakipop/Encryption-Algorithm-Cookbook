package RailFenceCipher;

import java.util.Scanner;

public class RailFenceCipher {

    // Encrypt text using the Rail Fence Cipher
    public static String encrypt(String text, int key) {
        char[][] rail = new char[key][text.length()];
        boolean down = false;
        int row = 0, col = 0;

        // Build the rail fence
        for (int i = 0; i < text.length(); i++) {
            if (row == 0 || row == key - 1) {
                down = !down; // Change direction at top or bottom rail
            }
            rail[row][col++] = text.charAt(i); // Place character
            row += down ? 1 : -1;
        }

        // Collect characters from the rail
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < text.length(); j++) {
                if (rail[i][j] != 0) {
                    result.append(rail[i][j]);
                }
            }
        }
        return result.toString();
    }
    
    // Decrypt text using the Rail Fence Cipher
    public static String decrypt(String cipher, int key) {
        char[][] rail = new char[key][cipher.length()];
        boolean down = false;
        int row = 0, col = 0;

        for (int i = 0; i < cipher.length(); i++) {
            if (row == 0 || row == key - 1) {
                down = !down;
            }
            rail[row][col++] = '*';
            row += down ? 1 : -1;
        }

        int index = 0;
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < cipher.length(); j++) {
                if (rail[i][j] == '*' && index < cipher.length()) {
                    rail[i][j] = cipher.charAt(index++);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        row = 0;
        col = 0;
        down = false;

        for (int i = 0; i < cipher.length(); i++) {
            if (row == 0 || row == key - 1) {
                down = !down;
            }
            if (rail[row][col] != '*') {
                result.append(rail[row][col++]);
            }
            row += down ? 1 : -1;
        }

        return result.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to encrypt:");
        String text = scanner.nextLine();

        System.out.println("Enter the number of rails:");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted Text: " + decryptedText);
        
        scanner.close();
    }
}
