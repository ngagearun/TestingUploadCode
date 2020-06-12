package com.applicationname.reusable;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

public class ReusableTestNG extends TestBaseSetup {

	static Select select;	
	static Actions action;
	
	
	static Actions actions() {
		 action = new Actions(driver);
		return action;
	}
	
	static void appurl(String url,String teststepname){
		driver.get(url);
	}
	
	public static String readdatafromElement(By locatorname) throws IOException{
		String text=null;
		try{
			text=driver.findElement(locatorname).getText();
		}catch(Exception e){			
           test.log(LogStatus.FAIL,test.addScreenCapture(takeScreenShot(driver))+ "Test Failed");
			e.printStackTrace();
		}
		return text;
	}
	
	
	public static void ExplicitWaitCondition(By locatorname){
		
		try{
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(locatorname));
		}catch(Exception e){		
	        e.printStackTrace();
	    }
	
	
	}
	
	public static void click(By locatorname,String teststepname) throws IOException{
		try{
		driver.findElement(locatorname).click();
		}catch(Exception e){
			//test.log(LogStatus.FAIL, test.addScreenCapture("D:\\test.png"));
			test.log(LogStatus.FAIL,test.addScreenCapture(takeScreenShot(driver))+ "Test Failed");
			e.printStackTrace();
		}
	}
	
	public static void dropdown(By locatorname,String value) throws IOException{
		try{
		select=new Select(driver.findElement(locatorname));
		select.selectByVisibleText(value);
		}catch(Exception e){
			test.log(LogStatus.FAIL,test.addScreenCapture(takeScreenShot(driver))+ "Test Failed");
			e.printStackTrace();
		}
	}
	
	public static void switchToFrameByIndex(int index) throws IOException{
		try{
			driver.switchTo().frame(index);
		}catch(Exception e){
			test.log(LogStatus.FAIL,test.addScreenCapture(takeScreenShot(driver))+ "Test Failed");
			e.printStackTrace();
		}
	}
	
	public static void sendText(By locatorname,String text) throws IOException{
		try{
			driver.findElement(locatorname).clear();
			driver.findElement(locatorname).sendKeys(text);
		}catch(Exception e){
			
			test.log(LogStatus.FAIL,test.addScreenCapture(takeScreenShot(driver))+ "Test Failed");
			e.printStackTrace();
			
		}
	}
	
	
	public static void mouseHover(By locatorname) throws IOException{
		try{
			action.moveToElement(driver.findElement(locatorname)).build().perform();
		}catch(Exception e){
			test.log(LogStatus.FAIL,test.addScreenCapture(takeScreenShot(driver))+ "Test Failed");
			e.printStackTrace();
		}
	}
	
	public static String alert() throws IOException{
		String text=null;
		try{
		text=driver.switchTo().alert().getText();
		//driver.switchTo().alert().accept();
		}catch(Exception e){
			test.log(LogStatus.FAIL,test.addScreenCapture(takeScreenShot(driver))+ "Test Failed");

			e.printStackTrace();
		}
		return text;
	}
	
	@SuppressWarnings("deprecation")
	public static String takeScreenShot(WebDriver driver ) throws IOException{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()
		+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
	}
	
	public static void scrollBar(By locatorname){
		try{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(locatorname));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static String readdatafromtable(By locatorname){
		String text=null;
		try{
		WebElement body =driver.findElement(locatorname);
		List<WebElement> rows =body.findElements(By.tagName("tr"));		
		for(int i=0;i<rows.size();i++){	
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));			
			for(int j=0;j<cols.size();j++){
				
				text=cols.get(j).getText();

			}
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return text;
	}
	
	
}

