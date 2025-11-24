```bash
How to hide 

C:\Users\lakin\Desktop\Snow>snow -C -m "These are the hide text. If you find this you successfully reveal. 'LakiPop' " -p "Laki" Test-Note.txt Test-Note-Hide.txt
Compressed by 39.77%
Message exceeded available space by approximately 627.45%.
An extra 11 lines were added.

How to reveal

C:\Users\lakin\Desktop\Snow>snow -C -p "Laki" Test-Note-Hide.txt
These are the hide text. If you find this you successfully reveal. 'LakiPop'
```

## Part 2

```bash
snow -C -l 80 -m "ICE encryption (CFB mode) supports keys up to 1024 bytes. Snow conceals messages from a string or file, writing to an outfile or standard output.`n" -p "Lakipop" Test2-NoteWithLine.txt Test2-NoteWithLine-Hide.txt
Compressed by 39.71%
Message exceeded available space by approximately 1717.95%.
An extra 23 lines were added.


snow -C -p "Lakipop" Test2-NoteWithLine-Hide.txt
ICE encryption (CFB mode) supports keys up to 1024 bytes. Snow conceals messages from a string or file, writing to an outfile or standard output.`n
```
