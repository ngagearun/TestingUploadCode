package com.applicationname.reusable;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentCustomisedReports {
	
	public static ExtentReports report;
	public static ExtentTest test;
	
	ExtentCustomisedReports(){
		
	}
	
	ExtentCustomisedReports(String path){		
		report=new ExtentReports(path);
		
	}
	

}
