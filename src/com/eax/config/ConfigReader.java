package com.eax.config;

import java.io.File;
import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ConfigReader {
	private Hashtable<String, String> _hashConfigs = new Hashtable<String, String>();
	
	public String getConfig(String configName) {
		return _hashConfigs.get(configName);
	}
	
	public ConfigReader(String configFileName) {
		//TODO: read config xml file and load up all configuration settings...
		try{
			File file = new File(configFileName);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			
			NodeList nl = doc.getElementsByTagName("generic");
			Element generic = (Element) nl.item(0);
			NodeList anl = generic.getElementsByTagName("agent_name");
			Element agent_name_el = (Element) anl.item(0);
			NodeList ganl = agent_name_el.getChildNodes();
			Node agent_name = ganl.item(0);
			
			_hashConfigs.put("agent_name", agent_name.getNodeValue());
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
