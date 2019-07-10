package com.epam.electrics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ElectricsBathroomAppliances implements StructureForElectricsClass {

	private static final String url = "jdbc:mysql://localhost:3306/epam";
	private static final String user = "root";
	private static final String password = "root";

	// method of reading data from BD and adding data to
	// allAppliancesList
	@Override
	public void reedAndAddInList() {

		String query = "select id, name, brand, country, power, state from electricsbathroom";

		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			while (rs.next()) {
				allAppliancesList
						.add(rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5) + rs.getString(6));
			}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}

}
