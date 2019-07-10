package com.epam.workWithElectrics;

import com.epam.userException.NullAllAppliancesList;
import com.epam.userException.NullResult;

import java.util.ArrayList;

public class StateAndSummPower extends Search{

	// collection for storing power values
	ArrayList<Integer> powerList = new ArrayList<Integer>();

	//class instance creation
	TxtWriter writer = new TxtWriter();

	// method of searching for active electrical appliances by the value "on"
	public void state() throws NullResult, NullAllAppliancesList {
		try {
			valueSearch = "on";
			System.out.println("now works: ");
			if (allAppliancesList.size() == 0)
				throw new NullAllAppliancesList("collection does not matter");
			for (i = 0; i < allAppliancesList.size(); i++) {
				if (resultSearch() != null) {
					System.out.println(result[0]);
					powerList.add(Integer.parseInt(result[3]));
				}
			}
			System.out.println("power consumption: " + powerConsumption());
				
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex1) {
			ex1.printStackTrace();
		}
	}

	// summation method of active electics
	private int powerConsumption() {
		try {
			int sum = 0;
			for (int i : powerList)
				sum = sum + i;
			return sum;
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			return 0;
		}
	}

	@Override
	public void reedAndAddInList() {
		// TODO Auto-generated method stub
		
	}


}
