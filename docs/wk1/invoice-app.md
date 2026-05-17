## Invoice Application

1. Create a new class called InvoiceApplication
    - ▾ 📂 src
      - ▾ 📦 (default package)
        - > 📄 InvoiceApplication.java

2. Add the code below

```java title="InvoiceApplication" linenums="1"
import java.util.Scanner;

public class InvoiceApplication
{
	public static void main(String[] args)
    {
		double subtotal = 100;
		double discountPercent = 0.2;
		double discountAmount = subtotal * discountPercent;
		double total = subtotal - discountAmount;
        // welcome the user to the program
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println(); // print a blank line
		// display the discount amount and total
		System.out.println("Subtotal:           " + subtotal);
		System.out.println("Discount percent:   " + discountPercent);
		System.out.println("Discount amount:    " + discountAmount);
		System.out.println("Total:              " + total);
	}
}
```

3. Run the program and you should see the following output.

```text title="Console Output"
Welcome to the Invoice Total Calculator  
 
Subtotal:           100.0  
Discount percent:   0.2  
Discount amount:    20.0  
Total:              80.0
```

---

[InvoiceApplication.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk1/InvoiceApplication.java)