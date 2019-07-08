package com.epam.WorkWithElectrics;

import com.epam.Electrics.ElectricsRoomAppliances;
import com.epam.Electrics.StructureForElectricsClass;

public abstract class Search implements StructureForElectricsClass{

	// reference variable for working with the collection of parameters from
	// roomElectrics.txt
	protected ElectricsRoomAppliances electricsRoom;

	// search parameter variable
	protected String valueSearch;

	// variable for cycle
	protected int i;

	// array to work with line items
	protected String[] result;

	// the method iterates over the elements of the string and search for matches
	// with "valueSearch"
	protected boolean resultSearch() {
		try {
			result = allAppliancesList.get(i).split(" ");
			boolean search = allAppliancesList.get(i).contains(valueSearch);
			return search;
		} catch (NegativeArraySizeException ex) {
			ex.printStackTrace();
			return false;
		} catch (NullPointerException ex1) {
			ex1.printStackTrace();
			return false;
		}
	}
}
