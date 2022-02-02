package com.learning.adi.java.JavaRefresher.interfaces;

public class Car implements Vehicle, Alarm {

	public Car(String brand) {
		this.brand = brand;
	}

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "The car is speeding up.";
	}

	@Override
	public String slowDown() {
		return "The car is slowing down.";
	}

	@Override
	public String turnAlarmOn() {
		return Vehicle.super.turnAlarmOn();
	}

	@Override
	public String turnAlarmOff() {
		return Vehicle.super.turnAlarmOff();
	}
}
