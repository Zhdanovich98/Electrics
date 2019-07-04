package com.epam.WorkWithElectrics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.epam.Electrics.ElectricsRoomAppliances;

public class SortingElectrics extends ElectricsRoomAppliances { 

//LinkedList to work with sordirovka	
private List sortList = new LinkedList();

//reference serialization class variable
private Serializator serializator;

//reference Deserialization class variable
private Deserializator deserializator  = new Deserializator();

//method of adding collection ElectricsRoomList to the list sortList
private void addValueArrayInLinkedList() {
         for(int i = 0; i < electricsRoomList.size(); i++) {
      	 Object p =  electricsRoomList.get(i);
      	sortList.add(p);
      }
}

//sorting method 
public void Sort() {
	        addValueArrayInLinkedList();
	        serializator = new Serializator();
	        Collections.sort(sortList);
            serializator.Seriliz(sortList);
	        deserializator.Deseriliz();
	        for(int i = 0; i<deserializator.FinalSortingList.size(); i++) {
	        System.out.println(deserializator.FinalSortingList.get(i));
	        }
	}

	
}
