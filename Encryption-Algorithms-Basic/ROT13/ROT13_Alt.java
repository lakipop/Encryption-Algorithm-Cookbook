package ROT13;

import java.util.Scanner;

public class ROT13_Alt {
    public static String rot13(String input) {
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                output.append((char) ((ch - 'A' + 13) % 26 + 'A'));
            }
            else if (Character.isLowerCase(ch)) {
                output.append((char) ((ch - 'a' + 13) % 26 + 'a'));
            } else {
                output.append(ch);
            }
        }
        return output.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be rotated: ");
        String input = sc.nextLine();
        String output = rot13(input);
        System.out.println(output);
        sc.close();
    }
}
