package CaesarCipher;

public class CaesarCipherAnswer {
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
        return encrypt(text, 26 - shift); // Inverse of encryption
    }

    public static void main(String[] args) {
        String text = "Hello World!";
        int shift = 4;
        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}