package com.skilldistillery.dealership.entities;

public class Car {
	private String make;
	private String model;
	private String color;
	private double purchasePrice;
	
	public Car(String make, String model, String color, double purchasePrice) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.purchasePrice = purchasePrice;
	}
	
	public Car() {}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [make=").append(make).append(", model=").append(model).append(", color=").append(color)
				.append(", purchasePrice=").append(purchasePrice).append("]");
		return builder.toString();
	}
	

	public void displayCar() { // FIX ME: Question C.6
		// String carData = getCarData();
		Car carData = new Car();
		System.out.println(carData);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	

}