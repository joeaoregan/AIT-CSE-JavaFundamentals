## Java Fundamentals exercises
### Wk2 – Ex B5

Examine the following Java code:

```java
int x=0, w=0, y=0, z=0;

x=4;

System.out.println(++x);
System.out.println(x++);
System.out.println(x);
System.out.println(--x);
System.out.println(x--);
System.out.println(x);

w=20;x=10;y=-5;z=0;
System.out.println(w == x && y != z);
System.out.println(w == x || y |= z);
System.out.println(|(w == (x + z)));
```

What is the output of the program - write it down? Now, code the program; call it Operators. Do you understand why the output is the way it is – explain it on paper?

---

[Operators.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk2/solutions-b/Operators.java)