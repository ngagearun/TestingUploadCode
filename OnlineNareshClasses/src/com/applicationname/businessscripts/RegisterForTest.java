package com.applicationname.businessscripts;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applicationname.reusable.ReusableTestNG;

public class RegisterForTest extends ReusableTestNG {
	
	@BeforeClass(groups={"regression","sanity"})
	public void clickonregisterlink(){
		click(By.linkText("Register"), "Clicking on Regsiter for link");
	}
	
	 @Test(priority=5,groups="regression")
	   public void fDNY_RegisterExam_coreectuerdetails(){
		   
		   dropdown(By.id("c0"), "FDNY");
		   ExplicitWaitCondition(By.id("c1"));
		   dropdown(By.id("c1"), "FDNY");
		   ExplicitWaitCondition(By.linkText("FDNY Entrance Exam (7001-E1)"));
		   click(By.linkText("FDNY Entrance Exam (7001-E1)"),"Clicking on FDNY");
		   click(By.name("Submit3"),"Clicking on submit button");
		   sendText((By.name("emailid")), "samule@gmail.com");
		   sendText((By.name("password")), "123456789Aa@");
		   click(By.name("loginbtn"),"Clicking on login button");
		   String reisteruername=readdatafromElement(By.id("welcomeDiv"));
		   System.out.println(reisteruername);
		   Assert.assertTrue(reisteruername.contains("arun"));	   
		   click(By.linkText("Logout"),"Clicking on logout");
		   click(By.linkText("Register"),"Clicking");
	   }
	   
	   @Test(priority=6,groups="sanity")
	   public void findtestdate_RegisterExam() throws InterruptedException{
		   
		   dropdown(By.id("c0"), "FDNY");
		   ExplicitWaitCondition(By.id("c1"));
		   dropdown(By.id("c1"), "FDNY");
		   ExplicitWaitCondition(By.linkText("FDNY Entrance Exam (7001-E1)"));
		   click(By.linkText("FDNY Entrance Exam (7001-E1)"),"Clicking on FDNY");
		   click(By.name("Submit3"),"Submit3");
		   sendText((By.name("emailid")), "samule@gmail.com");
		   sendText((By.name("password")), "123456789Aa@");
		   click(By.name("loginbtn"),"login");	   
		   click(By.linkText("Find test date"),"Testdate");
		   dropdown(By.id("c0"), "FDNY");
		   dropdown(By.id("c1"), "FDNY");
		   click(By.id("radio0"),"Radio");
		   Thread.sleep(4000);
		   JavascriptExecutor jse = ((JavascriptExecutor)driver);
		   jse.executeScript("window. scrollBy(0,800)", "");
		   Thread.sleep(4000);
		//   jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("Continue")));
		   click(By.id("Continue"),"COntinue");
		   sendText(By.id("autoSuggestField"), "99501");
		   driver.findElement(By.id("autoSuggestField")).sendKeys(Keys.ENTER);
		   click(By.id("Searchbtn"),"Search button");
		   String message=readdatafromElement(By.className("tips"));
		   Assert.assertEquals("No test centers found.",message);
		  
		   
	   }

}
