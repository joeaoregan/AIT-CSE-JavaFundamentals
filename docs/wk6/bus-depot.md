```
+------------------------------------+               +-------------------+
|               + Bus                |               |    + BusDepot     |
+------------------------------------+               +-------------------+
| -numberOfSeats : int               |               |                   |
| -busCount : int                    | 1..*        1 +-------------------+
| -driver : Driver                   |---------------| +main() : void    |
| -make : String                     |               +-------------------+
+------------------------------------+                         | 1
| +Bus()                             |                         |
| +Bus(String, int, Driver)          |                         |
| +getDriver() : Driver              |                         | 1..*
| +setDriver(Driver) : void          |          +-----------------------------+
| +getNumberOfSeats() : int          |          |          + Driver           |
| +setNumberOfSeats(int) : void      |          +-----------------------------+
| +getMake() : String                |          | -name : String              |
| +setMake(String) : void            |          | -phoneNumber : int          |
| +getBusCount() : int               |          +-----------------------------+
| +toString() : String               |          | +Driver()                   |
+------------------------------------+          | +Driver(String, int)        |
                                                | +getName() : String         |
                                                | +setName(String): void      |
                                                | +getPhoneNumber(): int      |
                                                | +setPhoneNumber(int) : void |
                                                +-----------------------------+
```

A Bus Depot contains buses and drivers. A bus holds the object reference to its driver  
1. Create a driver (with object ref stored in driverOne) using the default constructor.
2. Use the set methods to set the drivers name to John and phone number to 110.
3. Create a bus (with objectRef stored in busOne) using the default constructor.
4. Use the set methods to set the bus make to Volvo, the number of seats to 45 and the driver to the object with reference stored in driverOne.
5. Use the toString to output the details for busOne (output as shown below). Note: Bus.java should check if a driver has been assigned and if so fetch the name of the driver in the toString method.
6. Create another bus (busTwo) using the default constructor. Use the set methods to set the make to Mercedes and the number of seats to 50. Don’t assign a driver.
7. Use the toString method to output the details for busTwo.
8. Create a second driver (driverTwo) called Tom with phone number 999 using the overloaded constructor.
9. Create another bus (busThree) of make Ford, 20 seats and driverTwo.
10. Output details for busThree  using toString().

**Console Output:**  
> Bus [Make=Volvo, number of seats=45 Driver John ]  
> Bus [Make=Mercedes, number of seats=50 no driver assigned ]  
> Bus [Make=Ford, number of seats=20 Driver Tom ]  

---

[Bus.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/BusDepot/Bus.java)  
[BusDepot.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/BusDepot/BusDepot.java)  
[Driver.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/BusDepot/Driver.java)