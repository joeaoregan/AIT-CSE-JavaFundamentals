## Learning Outcomes

1.	File name is the same as the public class (not Rock.java)
2.	Constructor has :
    - same name as class name
	- no return type at all (not even void)
3.	Constructor is called when object instantiated/created i.e. when "new" executed
4.	Methods which happen to have the same name as the constructor
	are not called when an object of the class is instantiated
5.  How to call an ordinary (non-static) method in the class

---

1. Modify the class Rock as shown to add a constructor and a method that has the same name as the constructor.

```java title="Rock.java" linenums="1"
package com.ait.wk5;

public class Rock {
	
	public Rock() {
		System.out.println("Creating Rock...");
	}
	
	public int Rock() {
		System.out.println("Just a method");
		return 9;
	}
}
```

2. Create the class SimpleConstructor. Run it and observe the output.

```java title="SimpleConstructor.java" linenums="1"
package com.ait.wk5;

public class SimpleConstructor {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Creating instance " + i + " of Rock");
			Rock rock = new Rock();
		}
		
		Rock rock = new Rock();
		rock.Rock(); // method names should start with lowercase
	}
}
```

> Creating instance 1 of Rock  
> Creating Rock...  
> Creating instance 2 of Rock  
> Creating Rock...  
> Creating instance 3 of Rock  
> Creating Rock...  
> Creating instance 4 of Rock  
> Creating Rock...  
> Creating instance 5 of Rock  
> Creating Rock...  
> Creating Rock...  
> Just a method

---

[Rock.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/constuctors/Rock.java)  
[SimpleConstructor.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/constuctors/SimpleConstructor.java)