package com.spring.carwheelexample.model;

import java.util.Iterator;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TravellerMain {
	public static void main(String[] args) {

		// using File System Application Context
		System.out.println("Using File System Application Context");
		ApplicationContext fileApplicationContext = new FileSystemXmlApplicationContext(
				"conf/application-context.xml");

		Car car = (Car) fileApplicationContext.getBean("car");
		System.out.println("Car name:" + car.getName());
		System.out.println("Car Purchase Date:" + car.getPurchasedDate());

		int i = 0;
		System.out.println("Car Drivers:");
		Iterator<Driver> drivers = car.getCarDrivers().iterator();
		while (drivers.hasNext()) {
			Driver driver = drivers.next();
			System.out.println(driver.getName());
		}

		i = 0;
		System.out.println("Car Mirrors:");
		List<Mirror> mirrors = car.getMirrors();
		for (i = 0; i < mirrors.size(); i++) {
			System.out.println(mirrors.get(i).getType());
		}

		i = 0;
		System.out.println("Car Driver Contacts:");
		Map<String, Driver> driverContacts = car.getDriverContacts();
		Iterator<String> contactIterator = driverContacts.keySet().iterator();
		while (contactIterator.hasNext()) {
			String contact = contactIterator.next();
			Driver driver = driverContacts.get(contact);
			System.out.println("Driver Name: " + driver.getName() + ","
					+ "Contact: " + contact);
		}

		System.out.println("Car Type (using autowire): "
				+ car.getCarType().getType());
		car.move();

		// using Class Path Application Context
		System.out.println("Now, using Class Path Application Context");
		ApplicationContext classPathAppContext = new ClassPathXmlApplicationContext(
				"foo.xml");

		Owner o = (Owner) classPathAppContext.getBean("owner");
		System.out.println("Owner name: " + o.getName());
	}
}
