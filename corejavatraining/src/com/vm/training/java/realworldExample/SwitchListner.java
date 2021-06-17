package com.vm.training.java.realworldExample;

public interface SwitchListner 
{
	void switchOne();
	void switchTwo();
	void switchThree();
	void switchFour();
	
	default void wifiSwitch() {
		System.out.println("dummy implementation");
	}
}
