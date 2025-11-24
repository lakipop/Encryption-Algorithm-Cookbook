public class RailFenceCipherAnswer {
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

    public static void main(String[] args) {
        String text = "HelloWorld";
        int key = 3;
        String encryptedText = encrypt(text, key);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
