package com.epam.workWithElectrics;

import java.util.Collections;

import com.epam.userException.NullAllAppliancesList;

public class SortingElectrics {

//reference serialization class variable
	private Serializator serializator = new Serializator();

//reference Deserialization class variable
	private Deserializator deserializator = new Deserializator();

//reference TxtWriter class variable
	private TxtWriter txtWriter = new TxtWriter();

//sorting method 
	public void sort() throws NullAllAppliancesList {
		if (Search.allAppliancesList.size() == 0)
			throw new NullAllAppliancesList("collection does not matter");
		printAllAppliancesListBeforeSorting();
		Collections.sort(Search.allAppliancesList);
		writeResultSortTxt();
		serializResultSort();
		checkSerialization();
	}

//method of writing the result of the sort to a resultSort.txt file
	private void writeResultSortTxt() {
		txtWriter.writer(Search.allAppliancesList, Search.allAppliancesList.size());
	}

	
//method of writing the result of the sort to a resultSort.ser file
	private void serializResultSort() {
		serializator.seriliz(Search.allAppliancesList);
	}

//method of reading the result of the sort to a resultSort.ser file
	private void checkSerialization() {
		System.out.println(deserializator.deseriliz());
	}

	
	private void printAllAppliancesListBeforeSorting() {
		for (int i = 0; i < Search.allAppliancesList.size(); i++) {
			System.out.println(Search.allAppliancesList.get(i));
		}
	}
	
}
