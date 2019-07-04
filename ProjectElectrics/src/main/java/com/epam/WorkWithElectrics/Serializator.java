package com.epam.WorkWithElectrics;

import java.io.*;

public class Serializator {

	//method for serialization
	protected void Seriliz(Object valueWrite) {
		try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("src/main/resources/resultSort.ser"))) {
			writer.writeObject(valueWrite);
		} catch(FileNotFoundException ex1) {
			ex1.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace(); 
		}
		
	}
	
}
