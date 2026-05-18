```
+------------------------------------+               +-------------------+
|             + Customer             |               |       + Bank      |
+------------------------------------+               +-------------------+
| -accountNo : int                   |               |                   |
| -balance : double                  | 0..*        1 +-------------------+
| -name : String                     |---------------| +main() : void    |
| -count : int                       |               +-------------------+
+------------------------------------+                         :
| +Customer()                        |                         :
| +Customer(String, int, double)     |         +---------------+----------------+
| +getName() : String                |         | Create several customers using |
| +setName(String) : void            |         | both the default constructor   |
| +getAccountNo() : int              |         | and overloaded constructors.   |
| +setAccountNo(int) : void          |         | Objects created with the       |
| +getBalance() : double             |         | default constructor, will      |
| +setBalance(double) : void         |         | require subsequent "set"       |
| +getCount() : int                  |         | methods to initialise the      |
| +toString() : String               |         | object state.                  |
+------------------------------------+         | Ensure that your customer      |
                  :                            | count is accurate.             |
                  :                            | Check that the set, get and    |
 +----------------+-----------------+          | toString() methods work as     |
 | toString() should return details |          | expected.                      |
 | of the object state              |          +--------------------------------+
 +----------------------------------+
```
1. Create a customer (with object ref customerOne) using the default constructor.
2. Use the set method to set their details to 123, 1000.00, “James”
3. Use the toString to output the details for customerOne as shown below.
4. Create another customer (with ojject ref customerTwo) using the overloaded constructer (345,2000.00, “Kate”).
5. Use the toString method to output the details for customerTwo
6. Change the details for customerTwo using set methods to (348, 2500.00, Katy) and output again using toString().
7. Output the count of the number of customers created using getCount()

**Console Output:**  
> Customer [accountNo=123, name=James, balance=1000.0]  
> Customer [accountNo=345, name=Kate, balance=2000.0]  
> Customer [accountNo=567, name=Katy, balance=2500.0]  
> 2

---

[Customer.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/CustomerBank/Customer.java)  
[Bank.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk6/UML/CustomerBank/Bank.java)