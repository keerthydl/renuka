package com.adactin.helper;

public class FileReader {

	
	public FileReader() {
		
	}
	public static FileReader getInstanceFR() {
		FileReader file=new FileReader();
		return file;
	}
	public  Config_Reader getInstanceCR() throws Throwable {
		Config_Reader reader=new Config_Reader();
         return reader;
	}
	
	
}
