import java.util.Scanner;

public class AtbashCipher {
    // Encrypt/Decrypt text using Atbash cipher
    public static String atbash(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append((char) ('Z' - (ch - 'A')));
            } else if (Character.isLowerCase(ch)) {
                result.append((char) ('z' - (ch - 'a')));
            } else {
                result.append(ch); // Non-alphabet characters remain unchanged
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to apply Atbash cipher on:");
        String text = scanner.nextLine();

        String encryptedText = atbash(text);
        System.out.println("Encrypted/Decrypted Text: " + encryptedText);

        scanner.close();
    }
}