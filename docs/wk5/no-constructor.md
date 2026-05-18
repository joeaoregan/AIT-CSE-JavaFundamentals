##	Learning Outcomes

If you provide no constructor then Java provides a default one for you with no args. You can create instances of “Rock” even though it has not explicit constructor.

1. Create a class called Rock.java

```java title="Rock.java" linenums="1"
package com.ait.wk5;

public class Rock {
    
}
```

2. Add the class SimpleConstructor.java and run it.


```java title="SimpleConstructor.java" linenums="1"
package com.ait.wk5;

public class SimpleConstructor {

    public static void main(String[] args) {
        for (int i=1; i<=5;i++) {
            System.out.println("Creating instance "+i+" of Rock");
            Rock rock = new Rock();
        }
    }    
}
```

> Creating instance 1 of Rock  
> Creating instance 2 of Rock  
> Creating instance 3 of Rock  
> Creating instance 4 of Rock  
> Creating instance 5 of Rock  

---

[Rock.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/constuctors/Rock.java)  
[SimpleConstructor.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/constuctors/SimpleConstructor.java)