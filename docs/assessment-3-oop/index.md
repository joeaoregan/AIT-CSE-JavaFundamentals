# Assessment #3 (Object Oriented Programming) – (13/8/2018)

**Weighting 30%**

## Instructions

**Time Allowed:** 2 hours

Upload a `.zip` of your Java files (`Game.java` and `Player.java`) to moodle. You have been provided with files `DiceRollerApp.java`, `PairOfDice.java` and `Die.java`. No changes are allowed to these files. They must be used as they are. Make certain that the code you submit compiles. Code containing compilation errors may attract zero marks. NB Make certain you upload the correct file. This assessment is open book.

Code should be well formatted – i.e. correct indentation, placing of curly brackets...

1. Make a new package called `com.ait.game`.
2. Add a classes called `DiceRollerApp.java`, `Die.java`, `PairOfDice.java` (provided), `Game.java`, and `Player.java` to the newly created package.

```
└── 📁 com.ait.game
    ├── 📄 DiceRollerApp.java
    ├── 📄 Die.java
    ├── 📄 Game.java
    ├── 📄 PairOfDice.java
    └── 📄 Player.java
```

---

## UML Diagram

```
+-----------------------------------+             +----------------------------------+
|         + DiceRollerApp           |             |            + Player              |
+-----------------------------------+             +----------------------------------+
|                                   |             | -name : String                   |
+-----------------------------------+             | -totalScore : int                |
|                                   |             +----------------------------------+
+-----------------------------------+             | +getName() : String              |
                  | 1                             | +getTotalScore() : int           |
                  |                               | +setTotalScore(score: int) : void|
                  | 1                             | +toString() : String             |
+-----------------------------------+             | +Player(name : String)           |
|             + Game                |             +----------------------------------+
+-----------------------------------+                              ^
| -sc : Scanner                     |                              | 2
| -numDiceRolls : int               |                              |
| -SCORE_TO_WIN : int               | 1                            | 
+-----------------------------------+------------------------------+
| +start() : void                   |
+-----------------------------------+
                  | 1
                  |
                  |
                  |                            1  +----------------------------------+            +----------------------------------+
                  +------------------------------ |          + PairOfDice            |            |             + Die                |
                                                  +----------------------------------+ 1        2 +----------------------------------+
                                                  |                                  |------------| -value : int                     |
                                                  +----------------------------------+            | -SIDES : int                     |
                                                  | +roll()                          |            +----------------------------------+
                                                  | +getValue1() : int               |            | +roll()                          |
                                                  | +getValue2() : int               |            | +getValue() : int                |
                                                  | +getSum() : int                  |            +----------------------------------+
                                                  +----------------------------------+
```

---

## Application

The application works as follows:

1. When the application starts, it outputs a welcome slogan and asks the user to enter names for "player one" and "player two".
2. When both names have been input, it asks if you want to roll the dice.

> **Console Output:**  
> Welcome to the Dice Roller application  
> Please enter player one name:  
> John  
> Please enter player two name:  
> Tom  
> Roll the dice? (y/n):  

3. If the user enters 'n', then the "Good bye!" is output and the game ends.

> **Console Output:**  
> Welcome to the Dice Roller application  
> Please enter player one name:  
> John  
> Please enter player two name:  
> Tom  
> Roll the dice? (y/n):  
> n  
> Good bye!  

4. If the user enters 'y', then a pair of dice are rolled for each player. The program outputs the scores for each player as shown. The player to reach 20 (`SCORE_TO_WIN`) first is the winner. If no player reaches 20, the user is given the option of rolling the dice again.
5. If the user selects 'n' at this point, then "Good bye!" is output and the game ends.

> **Console Output:**  
> Die 2 is 3  
> Rolling dice for player two  
> Die 1 is 1  
> Die 2 is 3  
> Current score for John is 7  
> Current score for Tom is 4  
> No winner yet  
> Roll the dice again? (y/n):  
> n  
> Good bye!  

6. If there is no winner after the first round and the user enters 'y' to roll the dice again, the dice is rolled again and the scores output as shown.

> **Console Output:**  
> Round 1:  
> Rolling dice for player one  
> Die 1 is 5  
> Die 2 is 4  
> Rolling dice for player two  
> Die 1 is 6  
> Die 2 is 2  
> Current score for John is 9  
> Current score for Tom is 8  
> No winner yet  
> Roll the dice again? (y/n):  
> y  
> Round 2:  
> Rolling dice for player one  
> Die 1 is 2  
> Die 2 is 4  
> Rolling dice for player two  
> Die 1 is 6  
> Die 2 is 1  
> Current score for John is 15  
> Current score for Tom is 15  
> No winner yet  
> Roll the dice again? (y/n):  

7. The game continues until one or both players reaches `SCORE_TO_WIN` (set to 20). The first player to reach 20 is the winner. If both players reach 20 or more in the same round, then the result is a "DRAW". The game ends when a result is reached.

> **Console Output:**  
> Round 3:  
> Rolling dice for player one  
> Die 1 is 4  
> Die 2 is 3  
> Rolling dice for player two  
> Die 1 is 2  
> Die 2 is 3  
> Current score for John is 22  
> Current score for Tom is 20  
> DRAW  
> Good bye!  

8. Another sample is show here.

> **Console Output:**  
> Welcome to the Dice Roller application  
> Please enter player one name:  
> John  
> Please enter player two name:  
> Tom  
> Roll the dice? (y/n):  
> y  
> Round 1:  
> Rolling dice for player one  
> Die 1 is 6  
> Die 2 is 1  
> Rolling dice for player two  
> Die 1 is 1  
> Die 2 is 3  
> Current score for John is 7  
> Current score for Tom is 4  
> No winner yet  
> Roll the dice again? (y/n):  
> y  
> Round 2:  
> Rolling dice for player one  
> Die 1 is 3  
> Die 2 is 3  
> Rolling dice for player two  
> Die 1 is 6  
> Die 2 is 6  
> Current score for John is 13  
> Current score for Tom is 16  
> No winner yet  
> Roll the dice again? (y/n):  
> y  
> Round 3:  
> Rolling dice for player one  
> Die 1 is 2  
> Die 2 is 3  
> Rolling dice for player two  
> Die 1 is 2  
> Die 2 is 4  
> Current score for John is 18  
> Current score for Tom is 22  
> Tom wins  
> Good bye!  

---

## Coding

`DiceRollerApp.java` is a class with a main method that creates an instance of the Game class and calls the `start()` method in the game class.

```java title="DiceRollerApp" linenums="1"
package com.ait.game;

public class DiceRollerApp 
{
    public static void main(String args[])
    {
        Game game=new Game();
        game.start();
    }
}
```

You are also given the classes `Die.java` and `PairOfDice.java` to represent a single die and a pair of dice respectively.

Code the `start()` method of `Game.java` to,

* Output the welcome slogan
* Use Scanner to input the names for two players as shown.
* Create 2 Player objects, and save their references in variables called `player1` and `player2`. `Player.java` has a constructor that takes in the player's name as an argument.

```
+-----------------------------------+
|              Player               |
+-----------------------------------+
| -name : String                    |
| -totalScore : int                 |
+-----------------------------------+
| +getName() : String               |
| +getTotalScore() : int            |
| +setTotalScore(score: int) : void |
| +toString() : String              |
| +Player(name : String)            |
+-----------------------------------+
```

* Create a `PairOfDice` object and store in a variable call `dice`.
* Ask the user to enter y or n to roll the dice.
* If the user enters 'n', output the slogan "Good bye!" and the programme ends.
* If the user enters 'y', the roll method is called on the `PairOfDice` object. The values are retrieved using `.getValue1` and `getValue2` methods and `getSum` is used to get the overall score.
* Update the score for each player using `setTotalScore` method. In `Player.java`, the `setTotalScore` method adds the score received to the existing `totalScore`. It stores the accumulated score.

```java title="setTotalScore()" linenums="10"
public void setTotalScore(int score) {
    totalScore += score;
}
```

* The total score for each player can be fetched using `getTotalScore`.
* Use an overridden `toString` method in the Player class to print the data below for each player.

> **Console Output:**  
> Current score for John is 18  
> Current score for Tom is 22  

* In `Game.java`, after the dice roll, check and output the result, draw, player one wins, player two wins or no winner yet. If there was no winner, ask the user to enter y or n to roll the dice again or not.