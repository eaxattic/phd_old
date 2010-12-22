package com.eax.config;

public class ConfigReaderException extends Exception {
	
	public ConfigReaderException(String msg){
		super(msg);
	}
	
	public String toString(){
		return "Configuration Read Exception:" + super.toString();
	}
}
