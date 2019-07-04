package com.epam.WorkWithElectrics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserializator {

	 //collection for storing data from a Sereliz.ser
	protected ArrayList<Object> FinalSortingList = new ArrayList<Object>();
			
	
	//method for serialization
	protected void Deseriliz() {
		try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream("src/main/resources/resultSort.ser"))) {
			FinalSortingList.add(reader.readObject());
		
		}
		catch(FileNotFoundException ex1) {
			ex1.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		} 
		catch(ClassNotFoundException ex1) {
			ex1.printStackTrace();
		} 
		
	}
	
}
