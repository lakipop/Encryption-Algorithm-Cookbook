package ROT13;

import java.util.Scanner;

public class ROT13 {
    // Encrypt/Decrypt text using ROT13
    public static String rot13(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if it's a letter
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (((ch - 'a' + 13) % 26) + 'a'));
            } else if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (((ch - 'A' + 13) % 26) + 'A'));
            } else {
                result.append(ch); // Non-alphabet characters remain the same
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to apply ROT13 on:");
        String text = scanner.nextLine();

        String encryptedText = rot13(text);
        System.out.println("Encrypted/Decrypted Text: " + encryptedText);
        
        scanner.close();
    }
}