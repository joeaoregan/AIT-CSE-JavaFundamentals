package com.ait.cars;

import java.util.HashMap;
import java.util.Map;

public class CarDB {
	
	private final Map<String,Car> carList;
	
	public CarDB(){
		
		carList=new HashMap<String,Car>();
		
		
	Car carOne=new Car("12MO1234","VW","Passat","Silver");
	Car carTwo=new Car("131WH3485", "Ford", "Galaxy", "Red");
	addCar(carOne);
	addCar(carTwo);
	}


public void addCar(Car car){
	carList.put(car.getRegistration(),car);
}

public Car findCarByReg(String registration){
	return carList.get(registration);
}
}