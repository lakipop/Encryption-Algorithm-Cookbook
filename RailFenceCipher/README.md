# Rail Fence Cipher

The Rail Fence Cipher is a form of transposition cipher, where the letters of the plaintext are written
in a zigzag pattern across multiple "rails" (rows). After writing out the message in this zigzag
pattern, the cipher text is obtained by reading the letters row by row.

## How it works

In the Rail Fence Cipher, the plaintext is written in a diagonal pattern across multiple rows or
"rails," and then read row by row to get the ciphertext.

### Example

Let's consider encrypting the message "HELLOWORLD" using a Rail Fence Cipher with 3
rails.

1.  Write the message in a zigzag across the rails:
H . . . O . . .  . L . . . 
. E . L . W . R . . .D
. . L . . .. O . .
2.  Read the letters row by row:
    -   First row: HOL
    -   Second row: ELWRD
    -   Third row: LO

So, the ciphertext would be: HOLELWRDLO

## Encryption Algorithm

1.  **Input**:
    -   A plaintext message.
    -   The number of rails.
2.  **Process**:
    1.  Write the message in a zigzag pattern across the rails.
    2.  Read the characters from each rail sequentially to form the ciphertext.
3.  **Output**:
    -   The resulting ciphertext.

## Decryption Algorithm

To decrypt a Rail Fence Cipher, the reverse process is used:

1.  **Input**:
    -   The ciphertext.
    -   The number of rails.
2.  **Process**:
    1.  Determine the zigzag pattern and where each letter should be placed in the rails.
    2.  Fill the rails row by row with the ciphertext.
    3.  Read the message in the zigzag pattern to recover the original plaintext.

## How the code works

The Java code for the Rail Fence cipher creates a 2D array (the "rails"). It then writes the plaintext characters into this array in a zigzag pattern. The ciphertext is constructed by reading the characters from the array row by row. The decryption process is more complex, as it involves reconstructing the zigzag pattern to read the plaintext correctly.