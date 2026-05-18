## Learning Outcome. A static variable is shared across many instances.

1. Write classes call CounterStatic.java and CounterStaticTest.java. Run and observe the outcome.

```java title="CounterStatic" linenums="1"
package com.ait.ex5A;

public class CounterStatic {
	private static int count;

	public CounterStatic() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public static int getCounter() {
		return count;
	}
}
```

```java title="CounterStaticTest" linenums="1"
package com.ait.ex5A;

public class CounterStaticTest {

	public static void main(String[] args) {
		CounterStatic counter1 = new CounterStatic();
		CounterStatic counter2 = new CounterStatic();
		CounterStatic counter3 = new CounterStatic();
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		System.out.println(counter3.getCount());

		System.out.println(CounterStatic.getCounter());
	}
}
```

**Console Output:**  
> 3  
> 3  
> 3  
> 3  

---

[CounterStatic.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/e5A/CounterStatic.java)  
[CounterStaticTest.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/e5A/CounterStaticTest.java)