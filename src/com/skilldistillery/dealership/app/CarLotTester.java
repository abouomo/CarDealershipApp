package com.skilldistillery.dealership.app;

import com.skilldistillery.dealership.entities.Car;
import com.skilldistillery.dealership.entities.CarLot;

public class CarLotTester {

	public static void main(String[] args) {
		
		CarLot carLot = new CarLot();
		
		Car fredsCar = new Car("Kia", "Sportage", "Hot Pink", 28565);
		Car bernicesCar = new Car("Toyota", "Prius", "Neon", 32199);
		carLot.addCar(bernicesCar);
		carLot.addCar(fredsCar);
		carLot.getListOfCarsInInventory();
		
		Car abCar = new Car("Cybertruck", "Cyberbeast", " Aluminium", 115000);
		Car edCar = new Car("Toyota", "Corolla", "White", 18000);
		Car maryCar = new Car("Ford", "Escape", " Black", 24999);
		Car bernCar = new Car("Toyota", "4Runner", "Blue", 47995);
		carLot.addCar(abCar);
		carLot.addCar(edCar);
		carLot.addCar(maryCar);
		carLot.addCar(bernCar);
		carLot.getListOfCarsInInventory();
		
		

	}

}
