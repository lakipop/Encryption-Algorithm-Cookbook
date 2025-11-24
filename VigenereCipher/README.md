# Vigenère Cipher

The Vigenère Cipher is a polyalphabetic substitution cipher, which means it uses multiple Caesar
ciphers based on the letters of a key. Each letter in the plaintext is shifted by a number of positions
that depends on the corresponding letter in the key. This cipher is more secure than simple
substitution ciphers like the Caesar cipher, as it uses different shifts for different positions in the
plaintext.

## How it works

The Vigenère cipher uses a key (a string of letters) to determine the shift for each letter in the
plaintext. Each letter in the key corresponds to a number representing its position in the alphabet
(e.g., 'A' = 0, 'B' = 1, ..., 'Z' = 25). The letters in the plaintext are shifted by the amount specified
by the corresponding letter in the key, which repeats if necessary.

### Example

If the key is "LEMON" and the plaintext is "HELLO", the Vigenère cipher shifts each letter in
the plaintext by the number of positions corresponding to the letters in the key:

Plaintext: H E L L O
Key:       L E M O N
Shift:     11 4 12 14 13 (corresponding to L, E, M, O, N)
Ciphertext:S I X Z B

## Vigenère cipher algorithm

1.  **Input**:
    -   A plaintext message to be encrypted.
    -   A key (a word or phrase used for shifting the letters of the plaintext).
2.  **Process**:
    -   **Prepare the Key**:
        -   If the key is shorter than the plaintext, repeat the key until it matches the length of the
            plaintext.
        -   Example: If the key is "LEMON" and the plaintext is "ATTACKATDAWN", the key becomes "LEMONLEMONLE".
    -   **Shift Each Letter**:
        -   For each letter in the plaintext, convert it into a number (A = 0, B = 1, ..., Z = 25).
        -   Do the same for each letter in the key.
        -   Shift the plaintext letter by adding the corresponding key letter's value (mod 26, as there are 26
            letters in the alphabet).
    -   **Construct the Ciphertext**:
        -   Convert the shifted numbers back into letters.
        -   If the plaintext contains non-alphabetic characters (like spaces or punctuation), leave them
            unchanged.
3.  **Output**:
    -   The resulting ciphertext after applying the Vigenère cipher.

## How the code works

The Java implementation of the Vigenère cipher uses a key to encrypt the plaintext. The `encrypt` method iterates through the plaintext and the key. For each letter in the plaintext, it calculates the shift based on the corresponding letter in the key. The key is repeated if it is shorter than the plaintext. The `decrypt` method reverses this process by subtracting the key's shift from the ciphertext letters.