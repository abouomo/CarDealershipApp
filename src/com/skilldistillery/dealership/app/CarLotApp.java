package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entities.Car;
import com.skilldistillery.dealership.entities.CarLot;

public class CarLotApp {
	
	public static void main(String [] args) {
		CarLotApp app = new CarLotApp();
		
		app.run();
	}
	
	public void run() {
		CarLot carLot = new CarLot(20);
		
		Car bernCar = new Car("Toyota", "4Runner", "Blue", 47995);

		
		Car abCar = new Car("Cybertruck", "Cyberbeast", " Aluminium", 115000);
		Car edCar = new Car("Toyota", "Corolla", "White", 18000);
		Car maryCar = new Car("Ford", "Escape", " Black", 24999);
		
		Car jerCar = new Car("Toyota", "4Runner", "Blue", 47995);
		Car testCar = new Car("Toyota", "4Runner", "Blue", 47995);
		
		carLot.addCar(abCar);
		carLot.addCar(edCar);
		carLot.addCar(maryCar);
		carLot.addCar(bernCar);
		carLot.addCar(jerCar);
		carLot.addCar(testCar);
		
		carLot.getListOfCarsInInventory();
		
//		System.out.println(carLot.findSpecificModelCarInLot("Toyota", "4Runner"));
		System.out.println("NEW CAR");
		Car found = carLot.purchaseCar("Ford", "Escape");
		System.out.println("We found your car! Here's your new car:\n" + found);
		carLot.getListOfCarsInInventory();
		
		Car notFound = carLot.purchaseCar("Honda", "Civic");
		System.out.println("Sorry! We don't have the requested car\n" + notFound);
		carLot.getListOfCarsInInventory();
	}
	

}
