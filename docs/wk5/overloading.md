## Learning Outcomes
1.	Method overloading
	- constructors and ordinary methods

---

1. Add a new class called Tree.java

```java title="" linenums="1"
package com.ait.wk5;

public class Tree {
	private String type;

	public Tree() {
		type = "Beech";
	}

	public Tree(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public String getType(String prefix) {
		return prefix + " " + type;
	}
}
```

2. Write class called Overloading.java and run it.

```java title="" linenums="1"
package com.ait.wk5;

public class Overloading {

	public static void main(String[] args) {
		Tree beech = new Tree(); // default constructor
		System.out.println(beech.getType());
		Tree oak = new Tree("Oak");
		System.out.println(oak.getType());
		System.out.println(beech.getType("The tree type is "));
	}
}
```

> Beech  
> Oak  
> The tree type is Beech

---

[Tree.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/constuctors/Tree.java)  
[Overloading.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/constuctors/Overloading.java)