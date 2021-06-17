package com.vm.training.java.realworldExample;

public class HavellsAppliances implements SwitchListner{

	@Override
	public void switchOne() {
		System.out.println("havells fan is running");
	}

	@Override
	public void switchTwo() {
		System.out.println("havells light is running");

	}

	@Override
	public void switchThree() {
		System.out.println("havells bulb is running");

	}

	@Override
	public void switchFour() {
		System.out.println("havells bell is running");

	}

}
