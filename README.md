 CS1180 – Project 2
Simon Says – Java Console Memory Game

This project is a Java console application that recreates the classic Simon Says memory challenge. The goal of the game is simple: watch the sequence, remember it, and repeat it correctly. As the sequence grows longer, the challenge increases.

Overview

The program allows the player to choose their preferred difficulty level and then generates sequences of colors or digits based on that choice. Each round, the sequence becomes longer, and the player earns points by repeating it correctly. The game continues until the player makes a mistake, after which they can choose to play again.

 Game Features
🔹 Difficulty Selection

The player begins by choosing:

Easy Mode – sequence made of colors (red, blue, green, yellow)

Hard Mode – sequence made of digits (0–9)

🔹 Dynamic Sequence Growth

Each correct answer adds a new random item to the sequence:

Easy mode: random color added

Hard mode: random number added

🔹 Scoring System

+1 point for every correct round

Score increases as the sequence gets longer

Final score displayed when the user makes a mistake

🔹 Replay Option

After losing, the user is asked whether they want to:

Play again, or

Exit the program

 How the Game Works

The user chooses difficulty.

Simon generates and displays a random sequence.

A countdown gives the user time to memorize it.

The screen clears, prompting the user to re-enter the sequence.

If the user matches the sequence:

They score a point

A new round begins with a longer sequence

If the user enters the wrong sequence:

The game ends

Final score is shown

Replay option appears

 Concepts & Java Topics Used

This project demonstrates key programming concepts from CS1180:

Methods (modular design)

Loops (sequence repetition & rounds)

Conditionals (checking difficulty and correctness)

String Manipulation (comparing user input)

Random Number Generation (Random class)

User Input (Scanner)

Recursion (optional: replaying the game)

 How to Run the Program

Compile the program:

javac SimonSays.java


Run the program:

java SimonSays
