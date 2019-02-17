package com.ait.ex5A;

public class CounterStaticTest {

	public static void main(String[] args) {
		CounterStatic counter1 = new CounterStatic();
		CounterStatic  counter2 = new CounterStatic ();
		CounterStatic  counter3 = new CounterStatic ();
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		System.out.println(counter3.getCount());
		
		System.out.println(CounterStatic.getCounter());

	}

}
