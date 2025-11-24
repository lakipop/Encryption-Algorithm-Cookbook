package AtbashCipher;

public class AtbashCipherAnswer {
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
        String text = "Hello World!";
        String encryptedText = atbash(text);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
