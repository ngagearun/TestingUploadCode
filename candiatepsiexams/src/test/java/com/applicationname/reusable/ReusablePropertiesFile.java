package com.applicationname.reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ReusablePropertiesFile {
	
	static FileInputStream fi;
	static Properties pro;
	
	public ReusablePropertiesFile(String path) throws IOException{
		try{
	       fi =new FileInputStream(path);
	       pro=new Properties();
	       pro.load(fi);
		}catch(Exception e){
			e.printStackTrace();
		}
	        
	}
	
	
	public String  getPropertyData(String key){
		String value=null;
		try{
		value=pro.getProperty(key);
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}

}
