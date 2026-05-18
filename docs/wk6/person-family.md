
Code the classes Person and Family according to the UML diagram to give the output shown.

```
+------------------------------------+               +-------------------+
|              + Person              |               |     + Family      |
+------------------------------------+               +-------------------+
| -age : int                         |               |                   |
| -name : String                     |0..*         1 +-------------------+
| -address : String                  |---------------| +main() : void    |
| -count : int                       |               +-------------------+
+------------------------------------+                         :
| +Person(int, String, String)       |                         :
| +getName() : String                |            +------------+-------------------------------------------.
| +setName(String) : void            |            | Create 2 people: John who is 22 and from Dublin       |_\
| +getAge() : int                    |            | and Ann, who is 25 from Galway.                          |
| +setAge(int) : void                |            | Use getters and print out data for John and Ann          |
| +getAddress() : String             |            | Output the count                                         |
| +setAddress(String) : void         |            | Ensure the count of people created is accurate (static). |
| +getCount() : int                  |            | Change John's name to Jack,                              |
+------------------------------------+            | his address to Cork and his age to 23...                 |
                                                  +----------------------------------------------------------+
```

```text
Details for John
Name John
Address Dublin
Age 22
Details for Ann
Name Ann
Address Galway
Age 25
Number of people 2
Updated details for John
Name Jack
Address Cork
Age 23
```

---

[Person.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/PersonFamily/Person.java)  
[Family.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/PersonFamily/Family.java)