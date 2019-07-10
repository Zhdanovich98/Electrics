package com.epam.workWithElectrics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TxtWriter {

	//method for write result sorting in txt file resultSort.txt
	protected void writer(ArrayList<String> List, int sizeList) {
		try(FileWriter write = new FileWriter("src/main/resources/resultSort.txt")) {
			for(int i = 0; i < sizeList; i++) {
				write.write(List.get(i)  + ", ");
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
