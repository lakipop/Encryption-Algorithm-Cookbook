# Encryption Algorithm & Cybersecurity Cookbook

This repository serves as a practical cookbook for basic encryption algorithms and notes on common cybersecurity tools, based on a series of lab sheets.

## 1. Basic Encryption Algorithms

This section contains simple Java implementations of several fundamental encryption algorithms. The goal is to provide a clear, hands-on understanding of how these ciphers work at a code level.

Each algorithm is located in the `Encryption-Algorithms-Basic` directory, with its own subfolder containing:
- A `README.md` file explaining the theory behind the algorithm with an example.
- A primary `.java` file with a simple, commented implementation that accepts user input.
- An `Answer.java` file containing the sample solution from the lab sheet.
- An `_Alt.java` file demonstrating an alternative way to implement the same algorithm.

### Algorithms Included
- **Caesar Cipher**: A simple substitution cipher where each letter is shifted by a fixed number of positions.
- **ROT13**: A special case of the Caesar cipher where the shift is always 13 places.
- **Atbash Cipher**: A substitution cipher where the alphabet is reversed (A becomes Z, B becomes Y, etc.).
- **Vigenère Cipher**: A polyalphabetic substitution cipher that uses a keyword to shift letters.
- **Rail Fence Cipher**: A transposition cipher that writes plaintext in a zigzag pattern.

## 2. Cybersecurity Lab Notes

This repository also contains markdown notes and guides for various cybersecurity tools and concepts, as covered in the lab sheets.

### Topics Included
- **Zenmap**: Notes on using the Zenmap GUI for Nmap, including commands for intense scans, ping scans, and network topology mapping.
- **Regshot**: A guide to using Regshot for monitoring changes in the Windows Registry and file system, a key tool for malware analysis and system troubleshooting.
- **Steganography (SNOW)**: An introduction to steganography using the SNOW (Steganographic Nature Of Whitespace) tool to hide messages in text files by manipulating whitespace.

## Author
L S R Vidanaarchchi