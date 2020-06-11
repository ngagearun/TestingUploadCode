package com.applicationname.businessscripts;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applicationname.reusable.ReusableTestNG;

public class ContactUs extends ReusableTestNG {
	
	@BeforeClass(groups={"regression","sanity"})
	public void clickoncontactus(){
		click(By.linkText("Contact Us"), "Clicking on contact us link");
	}
	
	@Test(groups="regression")
	public void verifycontactdetailpageforlicenseuser(){
		dropdown(By.id("c0"), "FDNY");
		dropdown(By.id("c1"), "FDNY");
		click(By.linkText("FDNY Entrance Exam (7001-F2)"), "Clicking on FDNY Entrace Exam link");
		String text=driver.getPageSource();
		Assert.assertTrue(text.contains("Las Vegas, NV 89121"));
	}
	
	@AfterClass(groups={"regression","sanity"})
	public void clickonHomePagelink(){
		
		click(By.linkText("Home"),"Clicking on Home");
		
	}

}
