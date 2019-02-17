package com.ait.ex5A;

public class SimpleConstructor {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Creating instance " + i + " of Rock");
			Rock rock = new Rock();
		}
		Rock rock = new Rock();
		rock.Rock(); // method names should start with lowercase

	}

}
