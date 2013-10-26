package com.spring.carwheelexample.model;

import com.spring.carwheelexample.service.Wheel;

public class BridgeStone implements Wheel{

	@Override
	public void rotate() {
		System.out.println("BridgeStone is rotating....");
	}

}
