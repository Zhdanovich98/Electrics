package com.epam.WorkWithElectrics;

import java.io.FileWriter;
import java.io.IOException;

public class TxtWriter {

	//method for write result sorting in txt file resultSort.txt
	protected void writer(String result) {
		try(FileWriter write = new FileWriter("src/main/resources/resultSummPower.txt")) {
			write.write(result);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
