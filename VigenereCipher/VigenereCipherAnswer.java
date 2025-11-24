public class VigenereCipherAnswer {
    // Encrypt the text using Vigenere cipher
    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Encrypt only alphabetic characters
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base + (key.charAt(j % key.length()) - 'a')) % 26 + base);
                j++; // Only increment key index if it's a letter
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Decrypt the text using Vigenere cipher
    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Decrypt only alphabetic characters
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base - (key.charAt(j % key.length()) - 'a') + 26) % 26 + base);
                j++; // Only increment key index if it's a letter
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String text = "Hello World!";
        String key = "key";
        String encryptedText = encrypt(text, key);
        System.out.println("Encrypted Text: " + encryptedText);
        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
