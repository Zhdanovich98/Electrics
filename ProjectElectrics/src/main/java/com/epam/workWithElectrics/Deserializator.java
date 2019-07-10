package com.epam.workWithElectrics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializator {

	//method for serialization
	protected Object deseriliz() {
		try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream("src/main/resources/resultSort.ser"))) {
			return reader.readObject();		
		}
		catch(FileNotFoundException ex1) {
			ex1.printStackTrace();
			return null; 
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return null; 
		} 
		catch(ClassNotFoundException ex1) {
			ex1.printStackTrace();
			return null; 
		} 
		
	}
	
}
