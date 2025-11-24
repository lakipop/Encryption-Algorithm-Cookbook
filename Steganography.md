# LAB 02: SNOW WHITE SPACE

## Lab title: Snow white space
## Lab goal / objective: Hide and reveal data in text file
## Technical information
**Category**: Steganography > White space

---

### 1.1. Lab brief introduction
Steganography, simply can be defined as “covered-writing” which was derived from Greek vocabulary. It hides the data and information with seamlessly innocent data. Johannes T. has used the “Steganography” term in 1499, in his book “Steganographia”.

#### Uses of Steganography
*   Send information in secured manner
*   Store information in secured manner
*   As an extended implementation of water marking
*   As an extended implementation of copyright protection

#### Types of Steganography
*   **Technical Steganography**
*   **Linguistic Steganography**
    *   **Semagrams**
        *   Text semagrams
        *   Visual semagrams
    *   **Open codes**
        *   Jargon code
        *   Covered ciphers
            *   Null cipher
            *   Grille cipher

#### Techniques of Steganography
*   Network Steganography
*   Audio Steganography
*   Video Steganography
*   Text Steganography
*   Image Steganography

### Impact of the Steganography
With the wrong intention, Steganography is a great threat to the security. It can be used to carry to conduct terrorist communication, illegal actions, crimes etc. Also, Steganography can be used as a medium to Trojans, to carry the malwares.

#### Risk mitigation / recommendation
*   Use trusted sources to download resources
*   Use well-secured and encrypted communication methods
*   Do not click or download or open suspicious text/audio/image files from untrusted or unknown origins
*   Use anti-malware tools to scan the resources
*   Use sandboxing
*   Be aware and be secured from phishing and social engineering

---

### 1.2. Lab setup

Following software are used.

| Software | Description |
| :--- | :--- |
| Windows 10 | The normal PC is used. |
| SNOW version 1.1 | |

---

### 1.3. Used tools
**Snow - Version 1.1**
This tool, “SNOW” aka “Steganographic Nature Of Whitespace” allows users to hide the messages in ASCII format by simply extending the “whitespace” to the end-of-lines. SNOW utilize the Information Concealment Engine (ICE) encryption algorithm, a symmetric-key block cipher which was developed in 1997 by Mathew Kwan. The encryption and decryption is done through a password.

**Command syntax:**
`snow [ -CQS ] [ -p passwd ] [ -l line-len ] [ -f file | -m message ] [ infile [ outfile ]]`

---

### 1.4. Lab implementation mapping and steps

#### 1.4.1. Lab task flow
1.  Create innocent data
2.  Conceal the confidential data
3.  Verify the data is concealed
4.  Reveal the concealed data

#### 1.4.2. Lab implementation mapping with process flow

| Task | Steps |
| :--- | :--- |
| Create innocent data | 1 - 2 |
| Conceal the confidential data | 3 - 4 |
| Verify the data is concealed | 5 |
| Reveal the concealed data | 6 |

1.  **Navigate to the folder of the SNOW software and create the text file, the “innocent” data. Here it is `serverport.txt`**

2.  **Open the `serverport.txt` file and check the whitespaces are not available.**
    *   `Edit -> Select All` can reveal the added whitespaces.

3.  **Open the command line in the folder where `SNOW.exe` is available**

4.  **Conceal the data by following command.**
    *   **Confidential data**: `Confidential: The Zero-Day-Attack for SLCERT will be taken place in after 14:07 at Rose Day. Exploit the target without any MERCY`
    *   **Password**: `rose`
    *   **Input file**: `serverport.txt`
    *   **Output file**: `readme.txt`

    ```bash
    snow -C -m "Confidential: The Zero-Day-Attack for SLCERT will be taken place in after 14:07 at Rose Day. Exploit the target without any MERCY" -p "rose" serverport.txt readme.txt
    ```

5.  **Open the `readme.txt` file and check the whitespaces are available.**
    *   `Edit -> Select All` will reveal the added whitespaces at the end of the lines.

6.  **Reveal the concealed data by following command.**

    ```bash
    snow -C -p "rose" readme.txt
    ```
