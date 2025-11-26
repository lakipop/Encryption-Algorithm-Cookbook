# Atbash Cipher

The Atbash cipher is a very simple substitution cipher where the alphabet is reversed. This means
that each letter of the alphabet is mapped to its reverse counterpart. In other words, 'A' becomes
'Z', 'B' becomes 'Y', 'C' becomes 'X', and so on.

It is an ancient cipher, believed to have been used in Hebrew and other early languages.

## How it works

Plaintext Alphabet: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Cipher Alphabet:  Z Y X W V U T S R Q P O N M L K J I H G F E D C B A

In the Atbash cipher, each letter of the plaintext is substituted with the letter from the cipher
alphabet that corresponds to its position when counting from the end of the alphabet.

## Atbash algorithm steps

1.  **Input**:
    -   A string of plaintext (message to be encoded or decoded).
2.  **Process**:
    -   For each letter in the input string:
        -   If the letter is an uppercase letter ('A' to 'Z'):
            -   Replace it with the corresponding letter from the end of
                the alphabet.
            -   For example, 'A' becomes 'Z', 'B' becomes 'Y', 'C'
                becomes 'X', and so on.
        -   If the letter is a lowercase letter ('a' to 'z'):
            -   Replace it with the corresponding letter from the end of
                the alphabet.
            -   For example, 'a' becomes 'z', 'b' becomes 'y', 'c' becomes
                'x', and so on.
        -   If the character is not a letter (like spaces or punctuation), leave
            it unchanged.
3.  **Output**:
    -   The resulting ciphertext after the letter substitutions.

## How the code works

The Java code for the Atbash cipher is straightforward. The `atbash` method iterates through each character of the input string. If the character is a letter, it replaces it with its reverse counterpart. For example, 'A' is replaced with 'Z', 'B' with 'Y', and so on. Non-alphabetic characters are not changed. Since the cipher is its own inverse, the same method is used for both encryption and decryption.