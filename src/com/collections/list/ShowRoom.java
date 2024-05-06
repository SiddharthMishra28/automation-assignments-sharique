package com.collections.list;

import java.util.ArrayList;
import java.util.List;

import com.corejava.encapsulation.BMW;
import com.corejava.encapsulation.Chassis;
import com.corejava.encapsulation.Engine;
import com.corejava.encapsulation.Transmission;

public class ShowRoom {
	public static void main(String[] args) {
		Engine e = new Engine();
		e.setMake("Fiat");
		e.setEngineCapacity(2500);
		e.setModel("350L");
		e.setNumCylinders(6);
		
		Chassis c = new Chassis();
		c.setChassisMetal("Aluminium");
		c.setChassisType("Monocoque");
		
		Transmission t = new Transmission();
		t.setNumGears(7);
		t.setTransmissionMake("Volkswagen DCT13");
		t.setTransmissionType("DCT Automatic");
		
		Engine e2 = new Engine();
		e2.setMake("Fiat");
		e2.setEngineCapacity(2500);
		e2.setModel("350L");
		e2.setNumCylinders(6);
		
		Chassis c2 = new Chassis();
		c2.setChassisMetal("Aluminium");
		c2.setChassisType("Monocoque");
		
		Transmission t2 = new Transmission();
		t2.setNumGears(7);
		t2.setTransmissionMake("Volkswagen DCT13");
		t2.setTransmissionType("DCT Automatic");
		
		
		BMW i8 = new BMW(e, c, t, "ashok bmw");
		BMW m2 = new BMW(e2, c2, t2, "ashok bmw");
		
		List<BMW> bmws = new ArrayList<>();
		bmws.add(i8);
		bmws.add(m2);
		
		System.out.println(bmws.get(0).getTransmission().getNumGears());
	}
}
