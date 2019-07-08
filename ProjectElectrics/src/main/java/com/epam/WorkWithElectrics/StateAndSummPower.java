package com.epam.WorkWithElectrics;

import com.epam.Electrics.*;
import com.epam.UserException.NullAllAppliancesList;
import com.epam.UserException.NullResult;
import com.epam.UserException.NullSortList;

import java.util.ArrayList;

public class StateAndSummPower extends Search {

	// collection for storing power values
	ArrayList<Integer> powerList = new ArrayList<Integer>();

	TxtWriter writer = new TxtWriter();

	// method of searching for active electrical appliances by the value "on"
	public void stateNow() throws NullResult, NullAllAppliancesList {
		try {
			electricsRoom = new ElectricsRoomAppliances();
			valueSearch = "on";
			System.out.println("now works: ");
			if (allAppliancesList.size() == 0)
				throw new NullAllAppliancesList("collection does not matter");
			for (i = 0; i < allAppliancesList.size(); i++) {
				if (resultSearch() == true) {
					if (result[0] == null)
						throw new NullResult("arrays does not matter");
					if (result[3] == null)
						throw new NullResult("arrays does not matter");
					System.out.println(result[0]);
					powerList.add(Integer.parseInt(result[3]));
				}
			}
			System.out.println("power consumption: " + PowerConsumption());
			writer.writer("power consumption: " + PowerConsumption());
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex1) {
			ex1.printStackTrace();
		}
	}

	// summation method of active electics
	private int PowerConsumption() {
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
