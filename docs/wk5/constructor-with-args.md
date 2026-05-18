## Learning Outcomes
1.	Can pass an argument to a constructor

---

1. Create a new class called RockWithArgs

```java title="RockWithArgs" linenums="1"
package com.ait.wk5;

public class RockWithArgs {
	public RockWithArgs(int i) {
		System.out.println("Creating Rock number " + i);
	}
}
```

2. Add a new class called ConstructorWithArgs

```java title="ConstructorWithArgs" linenums="1"
package com.ait.wk5;

public class ConstructorWithArgs {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			RockWithArgs rock = new RockWithArgs(i);
		}
	}
}
```

> Creating Rock number 1  
> Creating Rock number 2  
> Creating Rock number 3  
> Creating Rock number 4  
> Creating Rock number 5  

---

[RockWithArgs.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/constuctors/RockWithArgs.java)  
[ConstructorWithArgs.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/constuctors/ConstructorWithArgs.java)