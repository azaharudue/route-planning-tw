package com.vrptw.entities.kml;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;

//import org.jsoup.nodes.Document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KmlType")
@XmlRootElement(name = "kml")
public class Kml implements Serializable
    {
	/**
	* 
	*/
	private static final long serialVersionUID = -3435906927444374551L;

	@XmlElementWrapper(name="Document")
	@XmlElement(name="Placemark")
	List<Placemark> placemarks; 
	
	

	

	
    }
