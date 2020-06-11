package com.applicationname.businessscripts;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.applicationname.reusable.ReusableTestNG;


public class CreateAnAccount extends ReusableTestNG{
	
	@BeforeClass(groups={"regression","sanity"})
	public void clickoncreateaccountlink(){
		click(By.linkText("Create"), "Clicking on create account link");

	}

	@Test(priority=4,groups="regression")
	public void creatingtheaccount(){
	
		Random ran=new Random();
		int num=ran.nextInt(3000);
		sendText(By.name("emailid"),"testingcandiate"+num+"@gmail.com");
		sendText(By.name("firstname"),"Arun");
		sendText(By.name("lastname"),"kumar");
		sendText(By.name("password"),"123456789Aa@");
		sendText(By.name("confirmpassword"),"123456789Aa@");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendText(By.name("hintanswer"),"Hyderabad");
		click(By.name("Submit"),"clicking on submit button");
		String text=readdatafromElement(By.id("welcomeDiv"));
		Assert.assertEquals(text, "Arun Kumar");		
	}
	
	@Test(priority=1,groups="sanity")	
	public void creatingaccountwithalreadyexistingaccount(){
		
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
	}
	
	@Test(priority=2,groups="sanity")
	public void verifyerrormessageonmandatoryfields(){
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("lastname")).clear();
		
		click(By.name("Submit"),"clicking on submit button");
		String text=readdatafromElement(By.className("errorInline"));
		Assert.assertEquals(text, "This field is required.");
	}
	
	
	@Test(priority=3,groups="regression")
	public void verifypopupforpasswordrules(){
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
	}
	
	@AfterClass(groups={"regression","sanity"})
	public void logoutfromaccount(){
		click(By.linkText("Logout"),"Clicking on logout");
	}
}
