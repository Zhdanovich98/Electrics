package com.epam.launch;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import com.epam.electrics.ElectricsBathroomAppliances;
import com.epam.electrics.ElectricsKitchenAppliances;
import com.epam.electrics.ElectricsRoomAppliances;
import com.epam.userException.NullAllAppliancesList;
import com.epam.userException.NullResult;
import com.epam.workWithElectrics.SortingElectrics;
import com.epam.workWithElectrics.StateAndSummPower;

public class Runner {
	public static void main(String[] args)
			throws IOException, NullResult, NullAllAppliancesList, ParserConfigurationException {
	
		ElectricsRoomAppliances electricsRoomAppliances = new ElectricsRoomAppliances();
		electricsRoomAppliances.reedAndAddInList();
		ElectricsKitchenAppliances electricsKitchenAppliances = new ElectricsKitchenAppliances();
		electricsKitchenAppliances.reedAndAddInList();
		ElectricsBathroomAppliances electricsBathroomAppliances = new ElectricsBathroomAppliances();
		electricsBathroomAppliances.reedAndAddInList();
	    SortingElectrics sortingElectrics = new SortingElectrics();
		sortingElectrics.sort();
		StateAndSummPower stateAndSummPower = new StateAndSummPower();
		stateAndSummPower.state();
	

	}
}
