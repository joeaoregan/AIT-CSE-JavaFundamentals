```
+------------------------------------+               +-------------------+
|             + Biscuit              |               |  + BiscuitFactory |
+------------------------------------+               +-------------------+
| -getNumberOfBiscuits : int         |               |                   |
| -weight : int                      | 0..*        1 +-------------------+
| -brand : String                    |---------------| +main() : void    |
| -maker : String                    |               +-------------------+
+------------------------------------+
| +Biscuit()                         |
| +Biscuit(String, String, int)      |
| +getBrand() : String               |
| +setBrand(String) : void           |
| +getNumberOfBiscuits() : int       |
| +getWeight() : int                 |
| +setWeight(int) : void             |
| +getMaker() : String               |
| +setMaker(String) : void           |
| +toString() : String               |
| +isOutOfDate() : boolean           |
+------------------------------------+
```

1. Create a biscuit (with object ref biscuitOne) using the default constructor.
2. Use the set methods to set their details to Kimberly, Jacobs (maker), 15
3. Use the toString to output the details for biscuitOne (output as shown below).
4. Create another biscuit (with object ref biscuitTwo) using the overloaded constructer (McVities, Digestive, 20).
5. Use the toString method to output the details for biscuitTwo
6. Change the details for biscuitTwo using set methods to (Cadburys, Wholewheat, 25) and output again using toString().
7. Output the count of the number of biscuits created using getNumberOfBiscuits

**Console Output:**  
> Biscuit [Maker=Jacobs, brand=Kimberly, weight=15]  
> Biscuit [Maker=McVities, brand=Digestive, weight=20]  
> Biscuit [Maker=Cadburys, brand=Wholewheat, weight=25]  
> 2

---

[Biscuit.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/BiscuitFactory/Biscuit.java)  
[BiscuitFactory.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/BiscuitFactory/BiscuitFactory.java)