# Lab 03: Reg Shot software usage

Regshot is an open-source, lightweight tool primarily used for monitoring and comparing changes made to the Windows registry over time. It is useful for determining what alterations software installations or system processes make to the system's registry, aiding in software troubleshooting, malware detection, and system analysis.

## Key Features

1.  **Registry Snapshot**: Regshot takes a "snapshot" of the registry before and after an event, such as software installation or system modification.
2.  **Comparison of Snapshots**: After taking the second snapshot, the tool compares both snapshots and generates a detailed report outlining the changes, additions, and deletions in the registry.
3.  **File System Monitoring**: In addition to registry changes, Regshot can also monitor and log changes made to files and directories, allowing users to track file-level modifications alongside registry changes.
4.  **Detailed Report**: The tool provides a comprehensive report, often in plain text or HTML, summarizing the differences between the two snapshots, including changes in registry keys and file structures.

## Usage Scenarios

*   **Software Installation**: Understanding the registry and file modifications caused by installing or uninstalling software.
*   **System Troubleshooting**: Identifying registry changes associated with problematic software or processes.
*   **Security Analysis**: Detecting malicious software by tracking unauthorized registry and file changes.

## How It Works

1.  **Initial Snapshot**: The user takes the first snapshot of the registry before performing any changes on the system.
2.  **System Event**: The user performs an action, such as installing a program or modifying system settings.
3.  **Final Snapshot**: After the event, a second snapshot is taken.
4.  **Comparison and Report**: Regshot compares the two snapshots and outputs a report detailing all registry and file system changes.

## Benefits

*   Lightweight and easy to use.
*   Comprehensive for registry monitoring and file system changes.
*   Open-source and regularly updated.

---

## Regshot usage in Cybersecurity

In cybersecurity, Regshot serves as a crucial tool for monitoring system integrity, detecting unauthorized changes, and supporting incident response efforts. Its main purpose revolves around tracking and analyzing registry and file system changes that occur due to various system activities, making it an invaluable tool for identifying suspicious or malicious behavior on Windows systems.

Below are some key cybersecurity purposes of Regshot:

### Malware Detection and Analysis

*   **Identifying Malicious Changes**: Regshot helps cybersecurity analysts detect modifications made to the Windows registry and file system by malware. By comparing snapshots taken before and after suspected malware execution, analysts can identify new or altered registry keys that may indicate malware persistence, command-and-control mechanisms, or system compromise.
*   **Understanding Malware Behavior**: By capturing the system changes made during the execution of suspicious files, Regshot helps researchers study the behavior of malware and understand how it affects the system. This insight can be used to develop signatures or detection techniques for antivirus and endpoint detection systems.

### Forensic Investigations

*   **Registry Changes as Evidence**: During digital forensics investigations, Regshot can be used to capture and compare registry snapshots to determine if unauthorized changes were made to the system. These changes can serve as valuable evidence when investigating security breaches, especially when trying to trace back actions that an attacker performed.
*   **Incident Response**: Regshot is useful for incident responders to quickly identify changes made by an attacker after they gain access to a system, allowing them to pinpoint what modifications occurred during the attack (e.g., registry changes for persistence or privilege escalation).

### Detecting Unauthorized Software Installation

*   **Tracking Unwanted Software**: Cybersecurity teams can use Regshot to monitor for unauthorized software installations. By taking snapshots before and after system events, it can reveal hidden software installations that may not be visible through traditional monitoring tools, thus preventing potential insider threats or external breaches.
*   **Monitoring Potentially Unwanted Programs (PUPs)**: Some programs, although not outright malware, can alter system configurations in ways that degrade security or system performance. Regshot helps detect these changes to ensure security policies are not violated.

### System Hardening and Configuration Audits

*   **Ensuring Compliance**: In secure environments where system configurations must adhere to specific security baselines, Regshot helps administrators verify that no unauthorized changes have been made to the registry or file system, ensuring compliance with security policies.
*   **Post-Patching Audits**: When security patches or updates are applied to a system, Regshot can be used to audit changes, ensuring that only legitimate modifications were made and that no unexpected alterations occurred.

### Change Detection for Vulnerability Assessments

*   **Testing Impact of System Modifications**: During vulnerability assessments or penetration tests, Regshot can be used to monitor changes that occur as a result of system tweaks or software installation, enabling security professionals to assess whether the changes introduce new vulnerabilities or weaken security.

### Tracking Persistence Mechanisms

*   **Persistence Techniques Detection**: Malware and advanced persistent threats (APTs) often employ persistence mechanisms to maintain access to compromised systems across reboots. Regshot is an effective tool for detecting such persistence techniques by revealing modifications to registry keys commonly used by attackers (e.g., run keys, startup folders).

In summary, Regshot plays a key role in malware analysis, digital forensics, system monitoring, and security audits within cybersecurity. By tracking registry and file system changes, it helps uncover unauthorized activity and supports the detection and remediation of security incidents.

---

## Lab work

*   Install the Regshot (Use the shared software)
*   Follow the given video tutorial and get familiar with the reg shot software.
    <https://www.youtube.com/watch?v=ySmkHsRr1DI>