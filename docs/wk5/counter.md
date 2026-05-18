Learning Outcome. Each instance of a class has its own instance variables

Write classes call Counter.java and counterTest.java. run and observe the outcome.

```java title="Counter" linenums="1"
package com.ait.ex5A;

public class Counter {
	private int count;

	public Counter() {
		count++;
	}

	public int getCount() {
		return count;
	}
}
```

```java title="CounterTest" linenums="1"
package com.ait.ex5A;

public class CounterTest {

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		System.out.println(counter3.getCount());
	}
}
```

**Console Output:**  
> 1  
> 1  
> 1

---

[Counter.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/e5A/Counter.java)  
[CounterTest.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk5/e5A/CounterTest.java)