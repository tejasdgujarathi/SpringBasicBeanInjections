package com.spring.carwheelexample.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.spring.carwheelexample.service.Wheel;

public class Car {
	private String name;
	private String purchasedDate;
	private Wheel wheel;
	private Set<Driver> carDrivers;
	private List<Mirror> mirrors;
	private Map<String, Driver> driverContacts;
	private CarType carType;
	
	// Initialise from spring configuration file
	public Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mirror> getMirrors() {
		return mirrors;
	}

	public void setMirrors(List<Mirror> mirrors) {
		this.mirrors = mirrors;
	}

	public String getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(String purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	public Map<String, Driver> getDriverContacts() {
		return driverContacts;
	}

	public void setDriverContacts(Map<String, Driver> driverContacts) {
		this.driverContacts = driverContacts;
	}

	public Set<Driver> getCarDrivers() {
		return carDrivers;
	}

	public void setCarDrivers(Set<Driver> drivers) {
		this.carDrivers = drivers;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public void move() {
		this.getWheel().rotate();
		System.out.println("Car is moving...");
	}
}
