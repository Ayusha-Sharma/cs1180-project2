# CS1180 – Project 2  
## Simon Says – Java Console Memory Game

This project was created for **CS1180 – Computer Science I** at **Wright State University**.  
It is a Java console recreation of the classic **Simon Says** memory game, where the player must memorize and repeat increasingly difficult sequences of colors or digits.

---

## Overview
The game allows the player to select a difficulty mode and then attempts to repeat the sequence shown by “Simon.”  
Each correct round increases the player’s score and generates a longer sequence.  
The game ends when the player enters the wrong sequence, and the user may choose to play again.

---

##  Game Features

### 🔹 Difficulty Selection
Players can choose between:
- **Easy Mode** – Color sequences  
  *(red, blue, green, yellow)*
- **Hard Mode** – Digit sequences  
  *(0–9)*

### 🔹 Dynamic Sequence Growth
With every correct round:
- A new random color is added in **Easy Mode**
- A new random number is added in **Hard Mode**
- Sequence length grows based on score

### 🔹 Scoring System
- +1 point per correct round  
- Score increases as the game becomes more challenging  
- Final score is displayed after an incorrect response

### 🔹 Replay Option
After the game ends, the player can choose to:
- **Play another round**, or  
- **Exit the program**  

Invalid inputs are rejected until the user gives a valid answer.

---

##  How the Game Works
1. Player chooses difficulty.  
2. Simon generates a random sequence.  
3. A countdown is displayed before the screen clears.  
4. Player must type the sequence exactly as shown.  
5. If correct → score increases and the next round begins.  
6. If incorrect → game ends and score is shown.  
7. Player chooses to restart or quit.

---

## Program Structure

### Key Methods:
- `startGame()` – Difficulty selection  
- `easyMode()` / `hardMode()` – Main gameplay loops  
- `repeatEasyMode()` / `repeatHardMode()` – Repeats rounds  
- `cleanInput()` – Normalizes user input  
- `getRandomValue()` – Generates random values from a CSV list  
- `pauseClear()` – Countdown and screen clear simulation  
- `main()` – Launches the game

These methods work together to handle sequence generation, input validation, scoring, and repetition.

---

##  How to Run the Program

```bash
javac SimonSays.java
java SimonSays
