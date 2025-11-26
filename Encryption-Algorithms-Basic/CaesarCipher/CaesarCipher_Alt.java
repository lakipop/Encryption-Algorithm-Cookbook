package CaesarCipher;

import java.util.Scanner;

public class CaesarCipher_Alt {

    public static String caesarCipher(String text, int shift) {
        final String ALPHABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String ALPHABET_LOWER = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String alphabet;
            
            if (Character.isUpperCase(ch)) {
                alphabet = ALPHABET_UPPER;
            } else if (Character.isLowerCase(ch)) {
                alphabet = ALPHABET_LOWER;
            } else {
                result.append(ch);
                continue;
            }
            
            int originalPos = alphabet.indexOf(ch);
            if (originalPos == -1) {
                result.append(ch);
                continue;
            }
            
            int newPos = (originalPos + shift) % 26;
            result.append(alphabet.charAt(newPos));
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to encrypt:");
        String text = scanner.nextLine();
        
        System.out.println("Enter the shift value:");
        int shift = scanner.nextInt();

        String encryptedText = caesarCipher(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);
        
        // Decrypt by shifting in the opposite direction
        String decryptedText = caesarCipher(encryptedText, 26 - (shift % 26));
        System.out.println("Decrypted Text: " + decryptedText);

        scanner.close();
    }
}
