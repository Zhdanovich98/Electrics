package com.epam.electrics;

import java.io.*;

public class ElectricsRoomAppliances implements StructureForElectricsClass {

	// method of reading data from roomElectrics.txt and adding data to
	// allAppliancesList
	@Override
	public void reedAndAddInList() {
		try (BufferedReader reader = new BufferedReader(
				new FileReader(new File("src/main/resources/roomElectrics.txt")))) {
			int index = 0;
			while (true) {
				String DataFromTxt = reader.readLine();
				if (DataFromTxt == null) {
					break;
				}
				allAppliancesList.add(DataFromTxt);
				index++;
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
