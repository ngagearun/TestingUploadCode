package com.applicationname.businessscripts;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applicationname.reusable.ExtentCustomisedReports;
import com.applicationname.reusable.ReusableTestNG;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ContactUs extends ReusableTestNG {
	
	
	@BeforeClass(groups={"regression","sanity"})
	public void clickoncontactus() throws IOException{
		test=report.startTest("Contact US");
		click(By.linkText("Contact Us"), "Clicking on contact us link");
		test.log(LogStatus.PASS, "Able to click on contact us link");
		
		
		
	}
	
	@Test(groups="regression")
	public void verifycontactdetailpageforlicenseuser() throws IOException{
		dropdown(By.id("c0"), "FDNY");
		dropdown(By.id("c3"), "FDNY");
		click(By.linkText("FDNY Entrance Exam (7001-F2)"), "Clicking on FDNY Entrace Exam link");
		String text=driver.getPageSource();
		Assert.assertTrue(text.contains("Las Vegas, NV 89121"));
		test.log(LogStatus.PASS, "The contact detail page has been verified");
		
	}
	
	@AfterClass(groups={"regression","sanity"})
	public void clickonHomePagelink() throws IOException{
		
		click(By.linkText("Home"),"Clicking on Home");
		test.log(LogStatus.PASS, "Cliking on Home page");
		
		
	}

}
