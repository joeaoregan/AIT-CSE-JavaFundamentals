# Write a program called MethodExercises

The exercise are the following:

1. Method didOswaldActAlone() : call from main(). Input true/false as to whether you think Oswald acted alone; do not store in a variable but return the user input back to main(). In main() use the response as part of an if statement that states whether he did/did not act alone.
2. Method filmRating() : Call from main(). Input a film and it's rating (for the moment, assume only 12 and 18 will be entered); store in variables of appropriate type and echo variables to the screen. Cater for exceptions (try-catch).
3. Method swimmerRating() : Call from main(). Input a swimmers name (input Ryan Lochte) and his dive rating (input 9.4); store in variables of appropriate type and echo variables to the screen. Make sure no exceptions occur.
4. Method getSwimmersCountry(String) : Ask the user for the swimmers country (input USA) and return it without storing it in a local variable. Call from end of **swimmerRating()** passing down the swimmers name (the swimmers name is inserted into the user prompt in getSwimmersCountry). Output the swimmers country in main(). Note that the call to getSwimmersCountry should not be called if an exception occurs in swimmerRating i.e. if an exception occurs with the swimmers rating, do NOT call getSwimmersCountry.

```text title="Sample Output"
Sample Output

Please enter the swimmers name: Ryan Lochte
Please enter the swimmers rating: 9.4
Swimmer is: Ryan Lochte
Swimmer rating is: 9.4
Please enter Ryan Lochte country: USA
main::swimmersCountry is USA
```

---

[MethodExercises.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk4/MethodExercises.java)