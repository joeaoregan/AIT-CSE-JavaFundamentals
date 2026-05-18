## Phone class

1.	Code the Phone class according to the UML diagram. Test it with the class PhoneTester which is given and check that you get correct output.

```
+-------------------------------------------------------------------+
|                            ~ Phone                                |
+-------------------------------------------------------------------+
| -phoneNumber : String                                             |
| -ownersName : String                                              |
| -price : double                                                   |
+-------------------------------------------------------------------+
| +Phone()                                                          |
| +Phone(phoneNumber : String, ownersName : String, price : double) |
| +getPhoneNumber() : String                                        |
| +getOwnersName() : String                                         |
| +getPrice() : double                                              |
| +setPhoneNumber(aNumber : String)                                 |
| +setOwnersName(aOwnersName : String)                              |
| +setPrice(aPrice : double)                                        |
+-------------------------------------------------------------------+
```
 
```java title="" linenums="1"
package com.ait.ex5B;

public class PhoneTester {

	public static void main(String[] args) {
		Phone samsung = new Phone();
		System.out.println("Details for samsung - defaults");
		System.out.println(samsung.getPhoneNumber());
		System.out.println(samsung.getOwnersName());
		System.out.println(samsung.getPrice());
		Phone iPhone = new Phone("999", "John", 88.50);
		System.out.println("Details for iPhone");
		System.out.println(iPhone.getPhoneNumber());
		System.out.println(iPhone.getOwnersName());
		System.out.println(iPhone.getPrice());
		iPhone.setOwnersName("Tom");
		iPhone.setPhoneNumber("110");
		iPhone.setPrice(110.50);
		System.out.println("Updated details for iPhone");
		System.out.println(iPhone.getPhoneNumber());
		System.out.println(iPhone.getOwnersName());
		System.out.println(iPhone.getPrice());
	}
}
```

**Console Output:**  
> Details for samsung - defaults  
> 123456  
> Tom  
> 59.99  
> Details for iPhone  
> 999  
> John  
> 88.5  
> Updated details for iPhone  
> 110  
> Tom  
> 110.5

---

[Phone.java+++-](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/ex5B/Phone.java)  
[PhoneTester.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/ex5B/PhoneTester.java)