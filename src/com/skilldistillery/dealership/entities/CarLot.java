package com.skilldistillery.dealership.entities;

import java.util.Arrays;

/**
 * This class represent a parking lot.
 */
public class CarLot {

	private Car[] parkingLot;
	private int parkedCar = 0; // How many cars currently parked
	private int desiredParkingLotSize;
	public static int PARKING_LOT_SIZE = 10;

	/**
	 * Constructs a new car lot with 10 parking spots
	 */
	public CarLot() {
		parkingLot = new Car[PARKING_LOT_SIZE]; // hold 10 cars
	}
	
	/**
	 * Constructs a new car lot with variable parking spots.
	 * @param desiredParkingLotSize The desired parking spot for the car lot
	 */
	public CarLot(int desiredParkingLotSize) {
		this.desiredParkingLotSize = desiredParkingLotSize;
		parkingLot = new Car[desiredParkingLotSize];
	}
	
	/**
	 * This method finds the spot number (0-based) of the 1st spot in the 
	 * car lot that has the desired make and model of car or -1 if 
	 * there is no such car (yet).
	 * @param desiredMake 
	 * @param desiredModel
	 * @return The spot number of the car or -1 if no car found
	 */
	private int findSpecificModelCarInLot(String desiredMake, 
			String desiredModel) { 
		for (int i = 0; i < desiredParkingLotSize; i++) {
			if (parkingLot[i] != null 
					&& parkingLot[i].getMake().equals(desiredMake) 
					&& parkingLot[i].getModel().equals(desiredModel)) {
				return i;
			}
		} return -1;
	}
	
	/**
	 * This method returns a collection of all cars matching the 
	 * customer's request or null if none of the cars in the lot match their 
	 * needs.
	 * @param desiredMake
	 * @param desiredModel
	 * @param color 
	 * @return A collection of all cars
	 */
	public Car[] findMakeAndModelAndColor(String desiredMake, 
			String desiredModel, String color) {
		Car [] foundCars = new Car[2];
		return foundCars;
		// FIX ME
	}
	
	/**
	 * This method uses findSpecificModelCarInLot() to see if a requested make 
	 * and model of a car is parked in the lot. If found, then consider it 
	 * sold.
	 * @param desiredMake 
	 * @param desiredModel
	 * @return The requested Car to the purchaser for them to show off, if car 
	 * found. Otherwise, return null as an indicator that the desired Car is 
	 * not currently in the carLot.
	 */
	public Car purchaseCar(String desiredMake, String desiredModel) {
		// Does the car exist at i position? if so copy that car to a local 
		// variable and replace found at i position to null
		int carPosition = findSpecificModelCarInLot(desiredMake, desiredModel);
		if (carPosition > -1) {
			Car found = parkingLot[carPosition];
			parkingLot[carPosition] = null;
			parkedCar--; // decrement when a customer purchase a car
			return found;
		} else return null;
	}
	
	/**
	 * This method allows a Car to be added to the lot.
	 * @param car The car we want to add
	 */
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

	/**
	 * This method Produces a list of all the cars currently in inventory 
	 * (i.e: all the parked Cars).
	 */
	public void getListOfCarsInInventory() {
		System.out.println("================================================="
				+ "===================================");
		System.out.println("\t\t\t\tParking Inventory");
		System.out.println("================================================="
				+ "===================================");
		System.out.println("\t\tNumber of parked car: " + parkedCar + " | Free"
				+ " space available: " + (parkingLot.length - parkedCar));
		System.out.println("================================================="
				+ "===================================");
		
		for (Car each : parkingLot) {
			if (each != null) {
				System.out.println(each);
				System.out.println("========================================"
						+ "============================================");
			}
		}

	}

}
