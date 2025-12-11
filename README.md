# cs1180-project2 Simon Says – Java Console Game
Project 2 – Simon Says Game (CS1180)

This project is a Java console program that recreates the classic Simon Says memory game. The game allows the player to choose between two difficulty levels and tests their ability to remember and repeat sequences.


Features:

Difficulty Selection:
The player chooses easy or hard mode at the start.

Easy Mode (Colors):
Simon generates a sequence using the colors:
red, blue, green, yellow
The sequence grows as the player scores points.

Hard Mode (Numbers):
Simon generates a sequence using digits:
0–9
Sequence length increases based on the player’s score.

Scoring System:
The player earns a point for each correct sequence.

Replay Option:
After a wrong answer, the player can choose to play again.


How It Works:

The game prompts the user to select a difficulty.

A random sequence of colors or numbers is generated.

The sequence is displayed, followed by a countdown.

The screen is cleared and the player must repeat the sequence.

If the input matches, the game continues with a longer sequence.

If incorrect, the game ends and shows the final score.


Topics Used:

•	Methods

•	Loops

•	Conditionals

•	String manipulation

•	Random number generation

•	User input with Scanner

•	Recursion (for repeating rounds)


How to Run:

Compile and execute the program using:
          
javac SimonSays.java

java SimonSays
