package com.vrptw.entities.kml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacemarkType")
public class Placemark
    {
	@XmlElementWrapper(name="Placemark")
	@XmlAnyElement
	List<?> elements;


    }
