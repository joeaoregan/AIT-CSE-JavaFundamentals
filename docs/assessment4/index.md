## Assessment #4 (Arrays and ArrayLists) – (20/8/2018)

**Weighting 35%**

### Instructions

**Time Allowed:** 2 hours

Upload your completed **CardGame.java** and **Player.java** file to moodle. You have been provided with start files. No changes should be made to `Card.java`. `Player.java` should only be changed to complete the `toString` and the `checkForAceOfHearts` methods. Make certain that the code you submit compiles. Code containing compilation errors may attract zero marks. NB Make certain you upload the correct files. This assessment is open book.

Code should be well formatted – i.e correct indentation, placing of curly brackets...

1. Make a new package called `com.ait.cards`.
2. Add classes `Card.java`, `CardGame.java` and `Player.java` to the newly created package. Start files provided.

```
└── 📁 com.ait.cards
    ├── 📄 Card.java
    ├── 📄 CardGame.java
    └── 📄 Player.java

```

### CardGame.java Outline

```
└── 📁 CardGame.java
    └── 🏢 CardGame
        ├── 🔹 cards
        ├── 🔹 players
        ├── 🔹 rank
        ├── 🔹 suit
        ├── ⚙️ addPlayers() : void
        ├── ⚙️ checkForWinner() : void
        ├── ⚙️ dealHands() : void
        ├── ⚙️ loadCardArray() : void
        ├── ⚙️ main(String[]) : void
        ├── ⚙️ printCardArray() : void
        ├── ⚙️ showHands() : void
        └── ⚙️ shuffleArray() : void

```

---

### Application

A "standard" deck of playing cards consists of 52 cards in each of the 4 suits Spades (S), Hearts (H), Diamonds (D) and Clubs (C). Each suit contains 13 cards: Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen and King.

1. Complete the method `loadCardArray` so that it uses *for loops* and the suit and rank arrays to initialise the cards array, one suit at a time, by creating card objects for all 52 cards. Each card has a rank and suit corresponding to the values in the suit and rank arrays. (Ace-H, 2-H, .....King-H, Ace-C, 2-C, ......King-C, Ace-S, 2-S, ....King-S, Ace-D, 2-D, ......King-D). Call the `loadCardArray` method from `main()`.
2. Complete the method `printCardArray` to print the cards in the array. Print each suit on a separate line by processing the cards array in 4 groups of 13 cards each. Separate the cards in each suit by a space and a comma as shown. Call the `printCardArray` method from `main()`.

> **Console Output:**  
> Loading Card Array...  
> Printing the initialised Card Array.....  
> Ace-H, 2-H, 3-H, 4-H, 5-H, 6-H, 7-H, 8-H, 9-H, 10-H, Jack-H, Queen-H, King-H  
> Ace-C, 2-C, 3-C, 4-C, 5-C, 6-C, 7-C, 8-C, 9-C, 10-C, Jack-C, Queen-C, King-C  
> Ace-S, 2-S, 3-S, 4-S, 5-S, 6-S, 7-S, 8-S, 9-S, 10-S, Jack-S, Queen-S, King-S  
> Ace-D, 2-D, 3-D, 4-D, 5-D, 6-D, 7-D, 8-D, 9-D, 10-D, Jack-D, Queen-D, King-D
> ....
> *Printing Card Array after initialisation*

3. Complete the method `addPlayers` that allows the user to add an arbitrary number of players by entering the players' names. For each player added, create a Player object and add it to the *players* ArrayList. When the user has finished adding players, print out a list of the players that have been added as shown. Call the `addPlayers` method from `main()`. You can make the assumption that there will never be more than 10 players, but no need to check this in the code.

> **Console Output:**  
> Adding players  
> Who wants to play?  
> Enter name for player 1 :  
> John  
> Add another player? (y/n):  
> y  
> Enter name for player 2 :  
> Tom  
> Add another player? (y/n):  
> y  
> Enter name for player 3 :  
> Patricia  
> Add another player? (y/n):  
> n  
> The following players have been added  
> Player1 John  
> Player2 Tom  
> Player3 Patricia

4. The method `shuffleCards()` shuffles the deck of cards. This method has been provided. Call the `shuffleCards` method from `main()`. Print out the shuffled card array using the `printCardArray` method.
5. Complete the method `dealHands()`. A hand is an array of five cards. Initialise a hand of cards for each player in turn by giving them the first 5 cards from the shuffled deck. That is, the first player gets the first five cards, the next player gets the next five and so on. Use the method `setHand` to pass the hand of cards to the player object.
6. Complete the `showHands()` method. The method should loop through the players ArrayList and call the `toString` method on each Player that shows the hand for each player. `toString` method needs to be completed in `Player.java`.

> **Console Output:**  
> Dealing Cards...  
> Showing hands of cards for each player  
> Hand of cards for John is 10-C 3-C 9-D Queen-S 7-S  
> Hand of cards for Tom is 4-C 8-D King-H 5-D 7-C  
> Hand of cards for Patricia is Jack-S 9-S 2-C 6-C 7-D

7. Complete the `checkForWinner()` method and call it from `main()`. The winner is the player that has the "Ace of Hearts". The method `checkForAceOfHearts` (to be completed) can be used to check if a player has the "Ace of Hearts". If no player has the "Ace of Hearts", there is no winner.

> **Console Output (Example 1):**  
> Dealing Cards...  
> Showing hands of cards for each player  
> Hand of cards for John is 10-C 3-C 9-D Queen-S 7-S  
> Hand of cards for Tom is 4-C 8-D King-H 5-D 7-C  
> Hand of cards for Patricia is Jack-S 9-S 2-C 6-C 7-D  
> Has anybody got the Ace of Hearts?  
> No winner

> **Console Output (Example 2):**  
> Dealing Cards...  
> Showing hands of cards for each player  
> Hand of cards for A is 9-H Jack-C 6-H 7-D 2-S  
> Hand of cards for B is 8-C 10-C Jack-D 10-D 8-H  
> Hand of cards for C is Ace-S 6-C 4-H 5-C Jack-H  
> Hand of cards for D is Queen-S 6-S 8-S 7-C 2-C  
> Hand of cards for E is King-H Ace-C 4-D 4-C 4-S  
> Hand of cards for F is Queen-H 10-H 2-H 10-S King-C  
> Hand of cards for G is 9-D 8-D Queen-C Queen-D Ace-H  
> Hand of cards for H is 9-S Jack-S King-S 7-H 3-C  
> Has anybody got the Ace of Hearts?  
> Winner is G

---

[CardGame.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/assessment4/CardGame.java)  
[Player.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/assessment4/Player.java)