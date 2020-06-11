package com.seleniumprograms;

import java.io.File;
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
import org.openqa.selenium.support.ui.Select;

public class Reusable {

	static WebDriver driver;
	static Select select;
	
	@SuppressWarnings("static-access")
	Reusable(WebDriver driver){
		this.driver=driver;
	}
	
	
	static Actions action;
	static void launchbrowser(String browsername){
		if(browsername.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");		
		 driver=new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();			
		}else if(browsername.equalsIgnoreCase("IE")){
			
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	static Actions actions() {
		 action = new Actions(driver);
		return action;
	}
	
	static void appurl(String url,String teststepname){
		driver.get(url);
	}
	
	
	static void click(By locatorname,String teststepname){
		try{
		driver.findElement(locatorname).click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void dropdown(By locatorname,String value){
		try{
		select=new Select(driver.findElement(locatorname));
		select.selectByVisibleText(value);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void switchToFrameByIndex(int index){
		try{
			driver.switchTo().frame(index);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void sendText(By locatorname,String text){
		try{
			driver.findElement(locatorname).sendKeys(text);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	static void mouseHover(By locatorname){
		try{
			action.moveToElement(driver.findElement(locatorname)).build().perform();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("deprecation")
	static void takeScreenShot(String path){
		try{
			TakesScreenshot tc=(TakesScreenshot) driver;
			File fi=tc.getScreenshotAs(OutputType.FILE);
			Date d=new Date();
			FileUtils.copyFile(fi, new File(d.getMinutes()+path));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void scrollBar(By locatorname){
		try{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(locatorname));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	static String readdatafromtable(By locatorname){
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

