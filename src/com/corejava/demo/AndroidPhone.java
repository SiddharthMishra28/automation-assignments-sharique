package com.corejava.demo;
// INHERITANCE
// PARENT CHILD RELATIONSHIP
// IS-A RELATIONSHIP
public class AndroidPhone extends Phone{
	String os;
	float cameraResolution;
	boolean isPhoneSwitchedOn;
	
	public void switchPhoneOn() {
		if(isPhoneSwitchedOn) {
			System.out.println("Switching on Phone");
		}
	}
	
	public void callNumber(String numberToDial) {
		if(isPhoneSwitchedOn) {
			System.out.println("Calling Number "+numberToDial);
		}else {
			System.out.println("Switch on phone first");
		}
	}
	
	public static void main(String[] args) {
		AndroidPhone galaxyPhone = new AndroidPhone();
		galaxyPhone.make = "Samsung";
		galaxyPhone.model = "S22";
		galaxyPhone.ramCapacity = 8;
		galaxyPhone.os = "ANDROID";
		galaxyPhone.cameraResolution = 12.5f;
		galaxyPhone.screenSize = 6.5f;
		galaxyPhone.isPhoneSwitchedOn = true;
//		galaxyPhone.switchOnPhone();
		galaxyPhone.callNumber("49732943432");
	}
}
