package com.vm.training.java.realworldExample;

public class GEAppliances implements SwitchListner {
	@Override
	public void switchOne() {
		System.out.println("GE fan is running");
	}

	@Override
	public void switchTwo() {
		System.out.println("GE light is running");

	}

	@Override
	public void switchThree() {
		System.out.println("GE bulb is running");

	}

	@Override
	public void switchFour() {
		System.out.println("GE bell is running");

	}

}