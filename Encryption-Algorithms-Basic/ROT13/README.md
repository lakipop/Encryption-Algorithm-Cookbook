# ROT13 (Rotate by 13 Places)

ROT13 is a specific case of the additive Cipher, where the shift key is fixed at 13. This means each
letter is shifted by exactly 13 positions in the alphabet, making it a simple but effective form of
obfuscation.

## How it works

-   Each letter of the alphabet is replaced by the letter 13 positions after it.
-   Since the alphabet has 26 letters, applying ROT13 twice will return the
    original text. Thus, ROT13 is its own inverse, meaning encryption and
    decryption use the same algorithm.

## Steps

-   Take a letter from the plaintext.
-   If the letter is between A and M (or a and m for lowercase), shift it forward by
    13 positions.
-   If the letter is between N and Z (or n and z), wrap around and shift it
    backward to the beginning of the alphabet.
-   Non-alphabetic characters (such as numbers, punctuation, or spaces) remain
    unchanged.

## ROT13 algorithm steps

1.  **Input**:
    -   A string of plaintext (the message to encode).
2.  **Process**:
    -   For each character in the input string:
        -   If it's a letter (either uppercase or lowercase):
            -   Shift it 13 places forward in the alphabet.
            -   If this shift exceeds 'Z' for uppercase or 'z' for lowercase, wrap
                around to the beginning of the alphabet.
        -   If it's not a letter (such as punctuation or numbers), leave it unchanged.
3.  **Output**:
    -   The resulting ciphertext (the encoded message after applying ROT13).

## How the code works

The Java code for ROT13 implements a simple substitution cipher. The `rot13` method takes a string as input and iterates through each character. If the character is a letter, it shifts it by 13 places. Since the alphabet has 26 letters, applying the same ROT13 function twice restores the original text, so the same method is used for both encryption and decryption.