package com.epam.workWithElectrics;

import com.epam.electrics.StructureForElectricsClass;

public abstract class Search implements StructureForElectricsClass {

	// search parameter variable
	protected String valueSearch;

	// variable for cycle
	protected int i;

	// array to work with line items
	protected String[] result;

	// the method iterates over the elements of the string and search for matches
	// with "valueSearch"
	protected String resultSearch() {
		try {
			arrayByElement( allAppliancesList.get(i));
			boolean search = allAppliancesList.get(i).contains(valueSearch);
			if (search == true) {
				return allAppliancesList.get(i);
			} else {
				return null;
			}
		} catch (NegativeArraySizeException ex) {
			ex.printStackTrace();
			return null;
		} catch (NullPointerException ex1) {
			ex1.printStackTrace();
			return null;
		}
	}

	// the method add values from allAppliancesList in String[] result
	public void arrayByElement(String line) {
		result = line.split(" ");
	}
}
