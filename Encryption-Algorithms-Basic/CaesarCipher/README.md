# Caesar Cipher

The Caesar Cipher is one of the simplest and most well-known encryption techniques. It is a type
of substitution cipher where each letter in the plaintext is shifted by a fixed number of positions in
the alphabet. The cipher is named after Julius Caesar, who reportedly used it to communicate
securely with his generals.

## How it works

-   **Shift**: Each letter in the plaintext is shifted by a fixed number of positions down
    (or up) the alphabet. This fixed number is called the "key." In this Caesar cipher
    key is always 03.
-   **Wrapping**: If the shift moves past the last letter of the alphabet, it wraps around
    to the beginning (e.g., shifting "Z" by 1 becomes "A").

### Example

-   **Key is 3**. This means each letter is shifted by 3 positions in the alphabet.

    Plaintext: HELLO

| Letter | Shifted by 3 positions |
| :--- | :--- |
| H | K |
| E | H |
| L | O |
| L | O |
| O | R |

Ciphertext: KHOOR

So, the Caesar Cipher has transformed "HELLO" into "KHOOR" using a shift of 3.

## Steps

For each letter in the plaintext, locate it in the alphabet.
Shift it forward by the key number of positions (in this case, 3).
If the shift moves beyond "Z", wrap around to the start of the alphabet.
Repeat the process for all letters in the plaintext.

## Decryption process

To decrypt the message, the process is simply reversed by shifting each letter by the same
key, but in the opposite direction (backward).

For the ciphertext KHOOR (with key = 3):

-   K becomes H
-   H becomes E
-   O becomes L
-   O becomes L
-   R becomes O

The original plaintext HELLO is recovered.

## Caesar cipher algorithm

1.  **Input**:
    -   A plaintext message (the original message to encrypt).
    -   A key (an integer value representing the number of positions to shift the
        letters).
2.  **Process**:
    -   For each letter in the plaintext:
        -   If the letter is an uppercase letter:
            -   Shift it by the key number of positions down the alphabet
                (mod 26).
            -   Wrap around if it goes past "Z".
        -   If the letter is a lowercase letter:
            -   Shift it by the key number of positions down the alphabet
                (mod 26).
            -   Wrap around if it goes past "z".
        -   If it is not a letter (e.g., space, punctuation), leave it unchanged.
3.  **Output**:
    -   The ciphertext (the encrypted message after applying the shifts).

## How the code works

The Java code implements the Caesar cipher algorithm. The `encrypt` method takes a plaintext string and a shift key as input. It iterates through each character of the plaintext. If the character is a letter, it shifts it by the key value, wrapping around the alphabet if necessary. Non-alphabetic characters are left unchanged. The `decrypt` method works by calling the `encrypt` method with a key that is the inverse of the original encryption key.