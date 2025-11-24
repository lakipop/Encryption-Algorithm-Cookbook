# Zenmap UI Notes

## Introduction – Find the answers and create a word file with your index

1.  **What is Zenmap?**
    Zenmap is the official graphical user interface (GUI) for the Nmap Security Scanner. It is a multi-platform (Linux, Windows, Mac OS X, BSD, etc.) free and open source application which aims to make Nmap easy for beginners to use while providing advanced features for experienced Nmap users.

2.  **What is its purpose?**
    Its main purpose is to provide a user-friendly interface for Nmap, allowing users to:
    *   Easily create and manage Nmap scans.
    *   Save scan profiles to make them easy to run repeatedly.
    *   View scan results in a graphical format.
    *   Compare scan results to see what has changed.
    *   Visualize network topology.

3.  **What is the difference between Zenmap and Nmap?**
    *   **Nmap** is a command-line tool for network discovery and security auditing.
    *   **Zenmap** is a graphical front-end for Nmap. It provides a user-friendly interface to Nmap's powerful features, making it more accessible to users who are not comfortable with the command line. Zenmap uses Nmap in the background to perform the scans.

4.  **Find what each component for in Zenmap UI are?**
    *   **Main Window**: This is where you enter the target IP address or hostname and select the scan profile.
    *   **Command Profile**: A dropdown menu with pre-configured Nmap commands for common scans (e.g., Intense scan, Ping scan).
    *   **Command Field**: Shows the actual Nmap command that will be executed. You can also type your own custom commands here.
    *   **Scan Button**: Starts the scan.
    *   **Nmap Output Tab**: Displays the raw output from the Nmap command as it runs.
    *   **Ports / Hosts Tab**: Shows a summary of the open ports and services found on the target hosts.
    *   **Topology Tab**: Provides a graphical representation of the network paths to the targets.
    *   **Host Details Tab**: Gives detailed information about a selected host, including its status, IP address, hostname, and operating system.
    *   **Scans Tab**: Keeps a history of your scans.

---

## Work 01 : Intense scan (Single PC)

1.  **Get the IP address of the PC (ipconfig)**
    *   Open a command prompt or terminal on your PC.
    *   Type `ipconfig` (on Windows) or `ifconfig` (on Linux/macOS) and press Enter.
    *   Look for the "IPv4 Address" - this is your local IP address.

2.  **Do an intense scan for the obtained IP address**
    *   Open Zenmap.
    *   In the "Target" field, enter the IP address you found.
    *   From the "Profile" dropdown, select "Intense scan".
    *   Click the "Scan" button.

3.  **Find following information**
    *   After the scan completes, look at the "Nmap Output" or "Ports / Hosts" tab.
    *   **a. Open ports**: The list of ports that are open on your PC.
    *   **b. Running services**: The services associated with the open ports (e.g., HTTP, FTP, SSH).
    *   **c. Public key type, bits, signature and validity period**: If you are scanning a service that uses SSL/TLS (like HTTPS on port 443), the scan may retrieve details about its SSL certificate.
    *   **d. HTTP server header**: If a web server is running, the scan will show the HTTP server header, which often includes the server software and version (e.g., Apache/2.4.18 (Ubuntu)).

4.  **Save the scan report as W1**
    *   In Zenmap, go to the "Scan" menu and select "Save Scan".
    *   Save the file with the name `W1.xml` or another desired format.

---

## Work 02 : Comparison of scan reports

1.  **Conduct the intense scan again**
    *   Follow the same steps as in Work 01 to run another intense scan on your IP address.

2.  **Save the report as W2**
    *   Save this new scan report as `W2`.

3.  **Compare and contrast**
    *   In Zenmap, go to the "Tools" menu and select "Compare Results".
    *   Open the two saved scan files (`W1` and `W2`).
    *   Zenmap will highlight the differences between the two scans, showing you if any ports have opened or closed, or if service versions have changed.

---

## Works 03 : Ping scan (Network)

1.  **Do a ping scan for the obtained IP address (Take your friend’s IP)**
    *   In Zenmap, enter your friend's IP address in the "Target" field.
    *   From the "Profile" dropdown, select "Ping scan". This will identify which hosts are online in the network.
    *   Click "Scan".

2.  **Find IP and MAC address**
    *   The scan results will show the hosts that responded to the ping. It will list their IP addresses.
    *   The MAC address is also typically discovered for hosts on the same local network.

3.  **Generate the “Fisheye” topology**
    *   Go to the "Topology" tab.
    *   You will see a graphical map of the network. You can use the controls to change the view, and one of the views is "Fisheye".

4.  **Save the topology image with name “W3_Fisheye”**
    *   In the "Topology" tab, there is an option to "Save Graphic".
    *   Save the image as `W3_Fisheye.png`.

5.  **Save the scan report as W3**
    *   Save the scan results via the "Scan" menu -> "Save Scan" as `W3`.

---

## Work 04: Intense scan (Network)

1.  **Get the IP address of the network (Take your friend’s IP)**
    *   Use the same IP address from Work 03.

2.  **Do an intense scan for the obtained IP address**
    *   In Zenmap, select the "Intense scan" profile for the target IP.

3.  **Find following information**
    *   Examine the scan output for:
        *   **a. Open ports**
        *   **b. Running services**
        *   **c. Public key type, bits, signature and validity period**
        *   **d. HTTP server header**

4.  **Save the scan report as W4**
    *   Save the scan results as `W4`.

---

## Work 04 (bis): Quick scan plus

1.  **Get the IP address of the network (Take your friend’s IP)**
    *   Use the same IP address.

2.  **Do a Quick scan plus for the obtained IP address**
    *   In the "Profile" dropdown, select "Quick scan plus".

3.  **Examine what information can be founded**
    *   A Quick scan plus is faster than an intense scan. It typically scans the most common ports and tries to identify the operating system and services. Compare the results with the "Intense scan" to see what information might be missing.

---

## Work 05: Custom commands

In Zenmap, you can create custom commands. The command field allows you to type any valid Nmap command.

1.  **`nmap -F -n -Pn`**
    *   **-F**: Fast scan (scans fewer ports than the default scan).
    *   **-n**: No DNS resolution (can speed up the scan).
    *   **-Pn**: Treat all hosts as online -- skip host discovery.
    *   To run this, type `nmap -F -n -Pn <target_IP>` directly into the "Command" field in Zenmap and click "Scan".

**And more..**
You can create and save your own command profiles for scans you run frequently.
