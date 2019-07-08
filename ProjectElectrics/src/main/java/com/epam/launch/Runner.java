package com.epam.launch;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.epam.Electrics.ElectricsBathroomAppliances;
import com.epam.Electrics.ElectricsKitchenAppliances;
import com.epam.Electrics.ElectricsRoomAppliances;
import com.epam.UserException.NullAllAppliancesList;
import com.epam.UserException.NullFinalSortingList;
import com.epam.UserException.NullResult;
import com.epam.UserException.NullSortList;
import com.epam.WorkWithElectrics.SortingElectrics;
import com.epam.WorkWithElectrics.StateAndSummPower;

public class Runner {
	public static void main(String[] args)
			throws IOException, NullResult, NullAllAppliancesList, NullSortList, NullFinalSortingList, ParserConfigurationException, SAXException {
	
		ElectricsRoomAppliances electricsRoomAppliances = new ElectricsRoomAppliances();
		electricsRoomAppliances.reedAndAddInList();
		ElectricsKitchenAppliances electricsKitchenAppliances = new ElectricsKitchenAppliances();
		electricsKitchenAppliances.reedAndAddInList();
		StateAndSummPower stateAndSummPower = new StateAndSummPower();
		stateAndSummPower.stateNow();
		SortingElectrics sortingElectrics = new SortingElectrics();
		sortingElectrics.sort();
		ElectricsBathroomAppliances electricsBathroomAppliances = new ElectricsBathroomAppliances();
		electricsBathroomAppliances.reedAndAddInList();

	}
}
