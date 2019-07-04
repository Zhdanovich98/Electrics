package com.epam.WorkWithElectrics;

import com.epam.Electrics.*;
import java.util.ArrayList;

public class StateAndSummPower extends Search {

	//collection for storing power values
	ArrayList<Integer> powerList = new ArrayList<Integer>();
	
	
	//method of searching for active electrical appliances by the value "on"
	public void StateNow() {
		try {
		electricsRoom = new ElectricsRoomAppliances();
		valueSearch = "on";
    	System.out.println("now works:" );
    	for(i=0; i < electricsRoom.electricsRoomList.size(); i++ ) {
		if(resultSearch() == true) {
			System.out.println(result[0]);
			powerList.add(Integer.parseInt(result[3]));
			}
    	}
    	System.out.println("power consumption: " + PowerConsumption());	
	}
	 catch(NumberFormatException  ex) {
		ex.printStackTrace();
	}
	 catch(NullPointerException  ex1) {
		ex1.printStackTrace();
		}
	}
	
    //summation method of active electics
	private int PowerConsumption() {
		try {
	     int sum = 0; 
	     for (int i : powerList)
	         sum = sum + i;
	     return sum;
		} catch (ArithmeticException  ex) {
			ex.printStackTrace();
			return 0;
		}
	}	
}
	

