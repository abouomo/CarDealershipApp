package com.skilldistillery.dealership.entities;

import java.util.Arrays;

public class CarLot {
	private Car[] parkingLot = new Car[10]; // hold 10 cars
	private int parkedCar = 0; // How many cars currently parked

	public CarLot() {
	}

	public void addCar(Car car) {
		// Fix me
		for (int i = 0; i < parkingLot.length; i++) {
			if (parkingLot[i] != null && parkingLot[i].equals(car)) {
				System.out.println(car + " is already in parking lot: ");
				break;
			}

			if (parkingLot[i] == null) {
				parkingLot[i] = car; // space is free -> park the car
				parkedCar++; // increment when we add car to parking lot
				break;
			}
		}
	}

	public void getListOfCarsInInventory() {
		System.out.println("====================================================================================");
		System.out.println("\t\t\t\tParking Inventory");
		System.out.println("====================================================================================");

		// Fix me
		for (Car each : parkingLot) {
			if (each != null) {
				System.out.println(each);
				System.out.println("====================================================================================");
			}
		}

	}

}
