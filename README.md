```
# Draw and Guess (Java Swing)
```
Draw and Guess is a local multiplayer drawing-and-guessing game built with **Java** and **Swing**. One player draws a secret word while the others try to guess it. The game includes curated word categories and also allows players to add their own custom words. All data is stored only in memory, with no files or database usage.

---

## Features
```
- Local multiplayer on a single computer  
- Players enter their names and number of players  
- Ten curated word categories (≈50 words each)  
- Custom words added during setup  
- Difficulty modes: Easy, Intermediate, Advanced, Random  
- Swing drawing canvas with color selection and clear button  
- Configurable round timer and scheduled hints  
- Scoring system based on difficulty and hints  
- Drawer receives half the points of the successful guesser  
- Supports English and Amharic (Unicode-safe)  
- No saving to disk — all session data resets on exit  

---

## Tools and Technologies Used
- **Java 11 or later**  
- **Swing** for the GUI  
- **IntelliJ IDEA** or **VS Code** for development  
- **Git** for version control  

---
```
## Project Structure (Short Overview)

```

game.players     → Player class (name, score)
game.words       → WordManager (categories, custom words)
game.ui          → MainFrame, GameController, DrawPanel
game.timer       → RoundTimer (timer + hint events)
game.utils       → Helpers, fonts, constants

````

---

## How to Set Up the Project

### 1. Install Java
You must have **Java 11+** installed.

Check your version:
```sh
java -version
````

### 2. Clone the Repository

```sh
git clone <your-repository-link>
cd DrawAndGuess
```

### 3. Open in Your IDE

Use:

* IntelliJ IDEA (recommended)
* VS Code (with Java extensions)

Open the folder as a Java project.

### 4. Build the Project

Your IDE will build automatically.

To build manually:

```sh
javac MainApp.java
```

### 5. Run the Application

Run the main class:

```sh
java MainApp
```

Or press **Run** in your IDE.

---

## What the Program Does

When you launch the game:

1. You enter the number of players and each player’s name.
2. You choose categories and (optionally) add custom words.
3. You select a difficulty mode.
4. The game picks a random drawer and a random word.
5. The drawer draws on a Swing canvas.
6. Guessers type their guesses into a dialog or field.
7. Timed hints appear and reduce available points.
8. Scores update immediately on the UI.
9. The next round begins with a new drawer.

The session ends whenever players decide to stop.
All data is temporary — nothing is saved.

---

## License

This project is for educational and personal use.
```
