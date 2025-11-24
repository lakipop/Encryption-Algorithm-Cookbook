package CaesarCipher;

import java.util.Scanner;

public class CaesarCipher {

    // Encrypts text using a shift of 3
    public static String encrypt(String text) {
        return encrypt(text, 3);
    }

    // Decrypts text using a shift of 3
    public static String decrypt(String text) {
        return decrypt(text, 3);
    }

    // Encrypts text using the specified shift (key)
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Encrypt uppercase characters
            if (Character.isUpperCase(ch)) {
                char c = (char) (((ch - 'A' + shift) % 26) + 'A');
                result.append(c);
            }
            // Encrypt lowercase characters
            else if (Character.isLowerCase(ch)) {
                char c = (char) (((ch - 'a' + shift) % 26) + 'a');
                result.append(c);
            }
            // If it's not a letter, just append it as it is
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Decrypts text using the specified shift (key)
    public static String decrypt(String text, int shift) {
        // To decrypt, we encrypt with the inverse shift
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to encrypt:");
        String text = scanner.nextLine();

        String encryptedText = encrypt(text);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);

        scanner.close();
    }
}