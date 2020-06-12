package com.applicationname.businessscripts;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.applicationname.reusable.ReusableTestNG;
import com.relevantcodes.extentreports.LogStatus;


public class CreateAnAccount extends ReusableTestNG{
	
	@BeforeClass(groups={"regression","sanity"})
	public void clickoncreateaccountlink() throws IOException{
		test=report.startTest("CreateAnAccount");
		click(By.linkText("Create"), "Clicking on create account link");
		test.log(LogStatus.PASS, "The create account page opened");
		

	}

	@Test(priority=4,groups="regression")
	public void creatingtheaccount() throws IOException{
	
		Random ran=new Random();
		int num=ran.nextInt(3000);
		sendText(By.name("emailid1"),"testingcandiate"+num+"@gmail.com");
		sendText(By.name("firstname"),"Arun");
		sendText(By.name("lastname"),"kumar");
		sendText(By.name("password"),"123456789Aa@");
		sendText(By.name("confirmpassword"),"123456789Aa@");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendText(By.name("hintanswer"),"Hyderabad");
		click(By.name("Submit"),"clicking on submit button");
		String text=readdatafromElement(By.id("welcomeDiv"));
		test.log(LogStatus.PASS, "The Name of the user is verified");
		//Assert.assertEquals(text, "Arun Kumar");		
	}
	
	@Test(priority=1,groups="sanity")	
	public void creatingaccountwithalreadyexistingaccount() throws IOException{
		
		sendText(By.name("emailid"),"test@gmail.com");
		sendText(By.name("firstname"),"Arun");
		sendText(By.name("lastname"),"kumar");
		sendText(By.name("password"),"123456789Aa@");
		sendText(By.name("confirmpassword"),"123456789Aa@");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendText(By.name("hintanswer"),"Hyderabad");
		click(By.name("Submit"),"clicking on submit button");
		String text=readdatafromElement(By.xpath("//*[@id='instruction']/table/tbody/tr/td/ul/li"));
		Assert.assertEquals(text,"Email already exists. Please enter another Email ID");
		test.log(LogStatus.PASS, "Checking for the existingaccount");
	}
	
	@Test(priority=2,groups="sanity")
	public void verifyerrormessageonmandatoryfields() throws IOException{
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("lastname")).clear();
		
		click(By.name("Submit"),"clicking on submit button");
		String text=readdatafromElement(By.className("errorInline"));
		Assert.assertEquals(text, "This field is required.");
		test.log(LogStatus.PASS, "The Name of the user is verified");
	}
	
	
	@Test(priority=3,groups="regression")
	public void verifypopupforpasswordrules() throws IOException{
		sendText(By.name("emailid"),"test@gmail.com");
		sendText(By.name("firstname"),"Arun");
		sendText(By.name("lastname"),"kumar");
		sendText(By.name("password"),"123456789Aa@");
		sendText(By.name("confirmpassword"),"6366363663@");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendText(By.name("hintanswer"),"Hyderabad");
		click(By.name("Submit"),"clicking on submit button");
		String text=alert();
		Assert.assertTrue(text.contains("The Password and Re-entered Password do not match"));
		driver.switchTo().alert().accept();
		test.log(LogStatus.PASS, "No password rulesmatching");
	
	}
	
	@AfterClass(groups={"regression","sanity"})
	public void logoutfromaccount() throws IOException{
		click(By.linkText("Logout"),"Clicking on logout");
		test.log(LogStatus.PASS, "Logout from account");
	}
}
