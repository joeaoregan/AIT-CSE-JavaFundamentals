## GradeConverter Application

1. Create a class and call it GradeConverter
    - ▾ 📂 src
      - ▾ 📦 (default package)
        - > 📄 AreaAndPerimeterApp.java
        - > 📄 GradeConverter.java
        - > 📄 InvoiceApplication.java
        - > 📄 InvoiceApplicationV1.java

2. The user is asked to enter a grade (numerical value). If the value entered is not between 0 and 100, and error message is output.
3. Otherwise the grade is converted to a String (>=85 is A, >=70 is B, >=55 is C, >=40 is D, <40 is “Failed”)
4. The result is printed.
5. The user is asked to enter y or n to continue to enter another grade or to quit.

**Console Output:**  
> Welcome to the Letter Grade Converter  
>  
> Enter numerical grade: -1  
> Error in grade input: -1  
> Continue? (y/n):  

Less than 0 entered

> Continue? (y/n): y  
>  
> Enter numerical grade: 102  
> Error in grade input: 102  
> Continue? (y/n):  

Greater than 100 entered.

> Continue? (y/n): y  
>  
> Enter numerical grade: 90  
> Letter grade: A  
>    
> Continue? (y/n):  

Grade A

> Enter numerical grade: 50  
> Letter grade: D
>    
> Continue? (y/n):  

Grade D

> Enter numerical grade: 20  
> Letter grade: Failed
>    
> Continue? (y/n):  

Grade “Failed”

>  
> Continue? (y/n): n  
>    

Enter “n”

---

[GradeConverter.java](https://github.com/joeaoregan/AIT-CSE-JavaFundamentals/blob/master/src/ait/java/wk1/GradeConverter.java)