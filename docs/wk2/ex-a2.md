## Java Fundamentals exercises
### Wk2 – ExA2

1. Write a program called AlgebraicExpression. This program is based on the
expression y=ax3 + 7. Initialise x to 2 and a to 3. Using parentheses where needed ensure y evaluates to the following: 31 (the normal evaluation).  Show also that by changing the position of the brackets a result of 108 and 66 can be achieved.
2. Look up the Math.pow function and use it to evaluate the above expression.

```text title="Console Output"
Evaluating "y = ax3 + 7" where x == 2 and a == 3

y = a * x * x * x + 7" sets y to       : 31
y = a * x * x * (x + 7) sets y to      : 108
y = (a * x) * x * (x + 7) sets y to    : 108
y = (a * x) * x * x + 7 sets y to      : 31
y = a * (x * x * x) + 7 sets y to      : 31
y = a * x * (x * x + 7) sets y to      : 66
y = a * x^3 + 7 (using Math.pow) sets y to      : 31
```
---

[AlgebraicExpression.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk2/AlgebraicExpression.java)