package AtbashCipher;

import java.util.Scanner;

public class AtbashCipher_Alt {

    public static String atbashCipher(String text) {
        final String ALPHABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String REVERSED_UPPER = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        final String ALPHABET_LOWER = "abcdefghijklmnopqrstuvwxyz";
        final String REVERSED_LOWER = "zyxwvutsrqponmlkjihgfedcba";
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            int index = ALPHABET_UPPER.indexOf(ch);
            if (index != -1) {
                result.append(REVERSED_UPPER.charAt(index));
                continue;
            }
            
            index = ALPHABET_LOWER.indexOf(ch);
            if (index != -1) {
                result.append(REVERSED_LOWER.charAt(index));
                continue;
            }
            
            // If not a letter, append as is
            result.append(ch);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text for Atbash cipher:");
        String text = scanner.nextLine();
        
        // The same function works for encrypting and decrypting
        String transformedText = atbashCipher(text);
        System.out.println("Transformed Text: " + transformedText);
        
        scanner.close();
    }
}
