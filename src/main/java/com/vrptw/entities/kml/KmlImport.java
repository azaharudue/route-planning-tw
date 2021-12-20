package com.vrptw.entities.kml;

import java.io.File;
import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class KmlImport
    {

	public static void main(String[] args)
	    {

		String filePath = "D:\\temps\\plz-shape-data.kml";
		parseKml(filePath);
	    }

	private static void parseKml(String filePath)
	    {
		Objects.requireNonNull(filePath, "filePath invalid!(null)");
		try
		    {
			File importFile = new File(filePath);
			JAXBContext jaxbContext = JAXBContext.newInstance(Kml.class);
			final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			
			final Kml kml = (Kml) unmarshaller.unmarshal(importFile);
			
			// System.out.println(kml.document);
			kml.placemarks.forEach(p ->
			    {
				System.out.println(p.elements);
			    });
		    } catch (Exception e)
		    {
			
			e.printStackTrace();
		    }
	    }
    }
