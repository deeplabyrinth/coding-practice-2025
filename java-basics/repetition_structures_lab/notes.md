### Roll the Die Game
In this challenge, you'll exercise your knowledge of loops by creating a Roll the Die game. The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls. Note that a die has 6 sides, and each side contains a number between 1 and 6.

#### Task
* Your program will automatically roll the die and advance the player that number of spaces on the game board.
* Repeat this up to 4 additional times, for 5 rolls in total.
* After 5 rolls, if they are greater than or less than 20 spaces exactly, they lose. Otherwise they win.
* If the player gets to exactly 20 before five rolls, end the game. They've won.

#### Challenges I faced
* I couldn't figure out how to implement a decision structure within the loop to determine the end state of the player position without the loop ending first
* Resorted to using a if-else statement after the loop to check whether the player undershot or overshot position 20
* To keep the controls structure inside the loop, use a logical operator and check if the maximum rolls matches the current iteration as condition
