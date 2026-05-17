## Invoice Application Version 2

1. Create a copy of your InvoiceApplicationV1 class and call it InvoiceApplicationV2
    - ▾ 📂 src
      - ▾ 📦 (default package)
        - > 📄 AreaAndPerimeterApp.java
        - > 📄 GradeConverter.java
        - > 📄 InvoiceApplication.java
        - > 📄 InvoiceApplicationV1.java
        - > 📄 InvoiceApplicationV2.java

2. Modify the code so that it continues to take input from the user y/n to continue or not.
3. The discount is determined based on the value of subtotal (>=500, discount is 0.25, >-200, discount is 0.2, >=100, discount is 0.1). For values less than 100 no discount is applied.
4. When the user is finished (enters ‘n’), calculate the number of invoices, average value and average discount as shown below.

```text title="Console Output"
Welcome to the Invoice Total Calculator  

Enter Subtotal:     200
Discount percent:   0.2
Discount amount:    40.0  
Total:              160.0

Continue? (y/n): y

Enter Subtotal:     600
Discount percent:   0.25
Discount amount:    150.0  
Total:              450.0

Continue? (y/n): y

Enter Subtotal:     100
Discount percent:   0.1
Discount amount:    10.0  
Total:              90.0

Continue? (y/n): y

Enter Subtotal:     50
Discount percent:   0.0
Discount amount:    0.0  
Total:              50.0

Continue? (y/n): n

Number of invoices: 4
Average invlice: 187.5
Average discount: 66.66666666666667
```

---

[InvoiceApplicationV2.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk1/InvoiceApplicationV2.java)