```
+------------------------------------+            +-----------------------+
|               + Car                |            |     + CarFactory      |
+------------------------------------+            +-----------------------+
| -registration : String             |            |                       |
| -numberOfCars : int                | 1..*     1 +-----------------------+
| -model : String                    |------------| +main() : void        |
| -make : String                     |            | +getCarRegistration() |
| -color : String                    |            +-----------------------+
| -kilometers : int                  |                        | 1
+------------------------------------+                        |
| +Car(String,String,String,String)  |                        | 
| +getRegistration() : String        |                        | 1
| +getKilometers() : int             |         +-----------------------------+
| +getColor() : String               |         |           + CarDB           |
| +setColor() : String               |         +-----------------------------+
| +setKilometers(int) : void         |         |                             |
| +getNumberOfCars() : int           |         +-----------------------------+
| +toString() : String               |         | +CarDB()                    |
+------------------------------------+         | +addCar(Car)                |
                                               | +findCarByReg(String) : Car |
                                               +-----------------------------+
```

## Instructions:
1.	Implement the UML diagram including the functionality as described.
2.	You are given a file called CarDB.java that contains a constructor and 2 methods that is used to store Car objects. Two cars are already stored in CarDB with registrations 12MO1234 and 131WH3485.
3.	Method getCarRegistration in CarFactory, takes in the car registration from the user using scanner.
4.	In the main method in CarFactory  
    a.	 first create an instance of CarDB  
    b.	Using a while loop output the menu

    ```java
    public static void main(String[] args) {
        CarDB carDB = new CarDB();
        sc = new Scanner(System.in);
    ```

    ---
    
    ```
    Welcome to the car Application  
    ------------------------------------------------------  
    What do you want to do?  
    Enter 'a' to add a new car  
    Enter 'f' to fetch a cars details by its registration  
    Enter 'c' to change car colour  
    Enter 'k' to update no. of kilometers  
    Enter 'q' to quit  
    ```

## User enters “a”:

When a user types “a”, a Car constructor will be used to build an additional car  
The user will be required to input the following:   

1.	Car Registration (STRING)
2.	Car Make (STRING)
3.	Car Model (STRING)
4.	Car Color (STRING)
5.	Kilometers defaults to 0

An Example has been provided below:

```
a  
Enter car registration  
181D2345  
Enter car make  
Mercedes  
Enter car model  
C-class  
Enter car colour  
Black  
Car has been added  
------------------------------------------------------  
What do you want to do?  
Enter 'a' to add a new car  
Enter 'f' to fetch a cars details by its registration  
Enter 'c' to change car colour  
Enter 'k' to update no. of kilometers  
Enter 'q' to quit  
```

## If the user enters ‘f’
When the users types “f” – A find method will be called allowing the user to look up a car which already exists within the DB.  

1.	Use the method findCarByReg() from the CarDB.class
    - NB: Use an overridden toString method in Car.java to output the details.
    - NB: If a car with the registration is not in the list, a null pointer is returned from CarDB. Check for this

    ```
    f  
    Enter car registration  
    181D2345  
    Car Details [Reg=181D2345, make=Mercedes, model=C-class, colour=Black, kilometers=0]  
    ------------------------------------------------------  
    What do you want to do?  
    Enter 'a' to add a new car  
    Enter 'f' to fetch a cars details by its registration  
    Enter 'c' to change car colour  
    Enter 'k' to update no. of kilometers  
    Enter 'q' to quit  
    ```

    ```
    Enter car registration   
    12D3456  
    Car not found  
    ------------------------------------------------------  
    What do you want to do?  
    Enter 'a' to add a new car  
    Enter 'f' to fetch a cars details by its registration  
    Enter 'c' to change car colour  
    Enter 'k' to update no. of kilometers  
    Enter 'q' to quit  
    ```

## If the user enters ‘c’
1.	Ask the user for the car registration
2.	Display the current car colour – getColor()
3.	Update the car colour - setColor()
Example output:

```
Enter 'q' to quit  
c  
Enter car registration  
12MO1234  
The car is currently Silver  
Enter new colour  
Red  
Colour for 12MO1234 changed from Silver to Red  
------------------------------------------------------  
What do you want to do?  
Enter 'a' to add a new car  
Enter 'f' to fetch a cars details by its registration  
Enter 'c' to change car colour  
Enter 'k' to update no. of kilometers  
Enter 'q' to quit  
```

## If the user enters ‘k’, 
1.	Ask the user for the car registration
2.	Take input of the number of kilometres – setKilometers()
3.	Ensure the input does not clock the car! (i.e. reverse the kilometres)

```
Enter car registration  
12MO1234  
Enter no. of kilometers  
200  
Kilometers is now 200  
------------------------------------------------------  
What do you want to do?  
Enter 'a' to add a new car  
Enter 'f' to fetch a cars details by its registration  
Enter 'c' to change car colour  
Enter 'k' to update no. of kilometers  
Enter 'q' to quit  
```

```
Enter car registration  
12MO1234  
Enter no. of kilometers  
100  
Sorry you put back the odometer  
------------------------------------------------------  
What do you want to do?  
Enter 'a' to add a new car  
Enter 'f' to fetch a cars details by its registration  
Enter 'c' to change car colour  
Enter 'k' to update no. of kilometers  
Enter 'q' to quit  
f  
Enter car registration  
12MO1234  
Car Details [Reg=> 12MO1234, make=VW, model=Passat, colour=Red, kilometers=200]  
```

## If the user enters ‘q’, 
1.	The number of car objects created is output using the static variable ‘numberOfCars’ 
2.	The program should also end. (break the loop)
 
```
Enter 'q' to quit  
q  
3 cars have been created
Goo bye!! 
```

---

[Car.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/CarFactory/Car.java)  
[CarFactory.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/CarFactory/CarFactory.java)  
[CarDB.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/CarFactory/CarDB.java)  