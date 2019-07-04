package com.epam.WorkWithElectrics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.epam.Electrics.ElectricsRoomAppliances;
import com.epam.UserException.NullElectricsRoomList;
import com.epam.UserException.NullFinalSortingList;
import com.epam.UserException.NullSortList;

public class SortingElectrics extends ElectricsRoomAppliances {

//LinkedList to work with sordirovka	
	private List sortList = new LinkedList();

//reference serialization class variable
	private Serializator serializator;

//reference Deserialization class variable
	private Deserializator deserializator = new Deserializator();

//method of adding collection ElectricsRoomList to the list sortList
	private void addValueArrayInLinkedList() throws NullElectricsRoomList {
		if (electricsRoomList.size() == 0)
			throw new NullElectricsRoomList("collection does not matter");
		for (int i = 0; i < electricsRoomList.size(); i++) {
			Object p = electricsRoomList.get(i);
			sortList.add(p);
		}
	}

//sorting method 
	public void Sort() throws NullElectricsRoomList, NullSortList, NullFinalSortingList {
		addValueArrayInLinkedList();
		serializator = new Serializator();
		if (sortList == null)
			throw new NullSortList("collection does not matter");
		Collections.sort(sortList);
		serializator.Seriliz(sortList);
		deserializator.Deseriliz(); 
		if (deserializator.FinalSortingList.size() == 0)
			throw new NullFinalSortingList("collection does not matter");
		for (int i = 0; i < deserializator.FinalSortingList.size(); i++) {
			System.out.println(deserializator.FinalSortingList.get(i));

		}
	}
}
