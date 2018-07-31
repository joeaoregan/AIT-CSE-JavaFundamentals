/*
 * Joe O'Regan
 * A00258304
 * 31/07/2018
 * Java Testing - 3. Unit Testing
 */
package ait.sdt.wk6;

public class Cat {
	private String name;
	private int age;
	private String colour;

	public Cat(String name) {
		this.name = name;
	}
	
	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
