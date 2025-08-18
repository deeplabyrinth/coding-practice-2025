### Generate a Bingo card
A Bingo card is a 5x5 grid used in the game of Bingo, where each column is labeled with the letters B, I, N, G, and O. Each column contains 5 unique numbers within a specific range.

#### Task
Create a bingo card that contains integer arrays for each column. The arrays should be the appropriate size and contain the valid range of numbers for its columns.

#### Parameters
None

#### Result
BingoCard: A BingoCard object that contains arrays of integers for each column

#### Constraints
- The B column contains **5** numbers between **1 and 15**
- The I column contains **5** numbers between **16 and 30**
- The N column contains **5** numbers between **31 and 45**
- The G column contains **5** numbers between **46 and 60**
- The O column contains **5** numbers between **61 and 75**

#### Example
Input: None
Result:
```
B   I   N   G   O
3   18  32  46  62
10  19  34  47  63
11  22  38  50  69
12  25  43  51  73
13  30  45  54  74
``` 

#### Challenges I faced
- Got ```cannot find symbol: class BingoCard``` because I only compiled ```Main.java``` while BingoCard was inside ```Answer.java.``` Fixed by compiling both together (```javac Main.java Answer.java```) or by moving ```BingoCard``` into its own file.

- Later hit ```Could not find or load main class arrays_lab.Main``` due to the ```package arrays_lab;``` declaration. Learned that I must run from the parent directory (```java arrays_lab.Main```) or use ```-cd ..``` if inside the folder or remove the package declaration altogether (better for smaller projects anyway).

A more detailed explanation below
---
* While working on my BingoCard program, I ran into an issue where Java couldn’t find or load the ```arrays_lab.Main``` class. The problem was caused by the ```package arrays_lab;``` declaration — when running inside the ```arrays_lab``` folder, the JVM was looking in the wrong place (```arrays_lab/arrays_lab/Main.class```).

I learned that with packages, Java expects you to compile and run from the parent directory, using:

```javac arrays_lab/Main.java arrays_lab/Answer.java
java arrays_lab.Main```


Alternatively, removing the ```package``` line lets everything sit in the default package, making it simpler (```java Main```), but less realistic for larger projects.

* Initially, I got a ```cannot find symbol: class BingoCard``` error when compiling. This happened because the BingoCard class was defined inside ```Answer.java``` but I only tried to compile ```Main.java```.

I learned that Java only knows about classes that have been compiled, so if a class depends on another file, I need to compile both together:

```javac Main.java Answer.java```


Alternatively, I could move ```BingoCard``` into its own file (```BingoCard.java```) and make it ```public```, which is the more standard approach.
