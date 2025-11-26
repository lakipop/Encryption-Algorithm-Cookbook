package VigenereCipher;

import java.util.Scanner;

public class VigenereCipher_Alt {
    public static String vigenereEncrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        int keyLength = key.length();
        int keyIndex = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (Character.isLetter(ch)) {
                // Get shift from current key character
                int shift = key.charAt(keyIndex) - 'A';
                
                if (Character.isUpperCase(ch)) {
                    result.append((char) ((ch - 'A' + shift) % 26 + 'A'));
                } else {
                    result.append((char) ((ch - 'a' + shift) % 26 + 'a'));
                }
                
                // Move to next key character
                keyIndex = (keyIndex + 1) % keyLength;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    
    public static String vigenereDecrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        int keyLength = key.length();
        int keyIndex = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (Character.isLetter(ch)) {
                // Get shift from current key character (use subtraction for decrypt)
                int shift = key.charAt(keyIndex) - 'A';
                
                if (Character.isUpperCase(ch)) {
                    result.append((char) ((ch - 'A' - shift + 26) % 26 + 'A'));
                } else {
                    result.append((char) ((ch - 'a' - shift + 26) % 26 + 'a'));
                }
                
                // Move to next key character
                keyIndex = (keyIndex + 1) % keyLength;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        System.out.print("Enter key: ");
        String key = sc.nextLine();
        
        String encrypted = vigenereEncrypt(text, key);
        String decrypted = vigenereDecrypt(encrypted, key);
        
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        
        sc.close();
    }
}
