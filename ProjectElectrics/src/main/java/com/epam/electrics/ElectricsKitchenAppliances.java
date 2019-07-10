package com.epam.electrics;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class ElectricsKitchenAppliances implements StructureForElectricsClass {


	// method of reading data from roomElectrics.txt and adding data to
	// allAppliancesList
	@Override
	public void reedAndAddInList() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("src/main/resources/ElectricsKitchen.xml"));
			NodeList electricsElements = document.getDocumentElement().getElementsByTagName("appliance");

			for (int i = 0; i < electricsElements.getLength(); i++) {
				Node employee = electricsElements.item(i);

				NamedNodeMap attributes = employee.getAttributes();

				allAppliancesList.add(attributes.getNamedItem("name").getNodeValue() + " "
						+ attributes.getNamedItem("brand").getNodeValue() + " "
						+ attributes.getNamedItem("country").getNodeValue() + " "
						+ attributes.getNamedItem("power").getNodeValue() + " "
						+ attributes.getNamedItem("state").getNodeValue());

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