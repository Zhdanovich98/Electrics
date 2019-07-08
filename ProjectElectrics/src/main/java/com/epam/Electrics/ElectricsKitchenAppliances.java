package com.epam.Electrics;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class ElectricsKitchenAppliances implements StructureForElectricsClass {

	private String name, brand, country, power, state;


	public ElectricsKitchenAppliances() {

	}


	public ElectricsKitchenAppliances(String name, String brand, String country, String power, String state) {
		this.name = name;
		this.brand = brand;
		this.country = country;
		this.power = power;
		this.state = state;
	}

	private String getName() {
		return name;
	}

	private String getBrand() {
		return brand;
	}

	private String getCountry() {
		return country;
	}

	private String getPower() {
		return power;
	}

	private String getState() {
		return state;
	}

	@Override
	public void reedAndAddInList() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(new File("src/main/resources/ElectricsKitchen.xml"));

			NodeList employeeElements = document.getDocumentElement().getElementsByTagName("appliance");

			for (int i = 0; i < employeeElements.getLength(); i++) {
				Node employee = employeeElements.item(i);

				NamedNodeMap attributes = employee.getAttributes();

				allAppliancesList.add(attributes.getNamedItem("name").getNodeValue() + " "
						+ attributes.getNamedItem("brand").getNodeValue() + " "
						+ attributes.getNamedItem("country").getNodeValue() + " "
						+ attributes.getNamedItem("power").getNodeValue() + " "
						+ attributes.getNamedItem("state").getNodeValue());

			}
			for (int i = 0; i < allAppliancesList.size(); i++) {
				System.out.println(allAppliancesList.get(i));
			}
		} catch (ParserConfigurationException ex) {
			ex.printStackTrace();
		} catch (SAXException ex1) {
			ex1.printStackTrace();
		} catch (IOException ex2) {
			ex2.printStackTrace();
		}
	}
}