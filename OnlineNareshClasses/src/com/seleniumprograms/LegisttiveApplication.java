package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LegisttiveApplication extends Reusable {
	
	LegisttiveApplication(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static void StaleElementHandleByID(WebElement col){
		int count = 0; 
		while (count < 4){
		    try {		       
		    	col.click();
		    	break;
		     } catch (StaleElementReferenceException e){
		       e.toString();
		       System.out.println("Trying to recover from a stale element :" + e.getMessage());
		       count = count+1;
		     }
		   count = count+4;
		}
	}

	public static void main(String[] args) throws InterruptedException{
		
		launchbrowser("firefox");
		appurl("https://www.legislation.gov.au/Browse/Results/ByTitle/Acts/InForce/Ab/0/0/principal", "Redifff pge");
		Thread.sleep(3000);
		
		List<WebElement> rows =driver.findElements(By.xpath("//*[@id='ctl00_MainContent_gridBrowse_ctl00']/tbody/tr"));
		System.out.println(rows.size());
		for(int i=0;i<rows.size();i++){
			
			
			
			driver.findElement(By.xpath("//*[@id='ctl00_MainContent_gridBrowse_ctl00']/tbody/tr["+(i+1)+"]/td[2]")).click();	
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);			
		}
		
		

		driver.close();
	
	}

}
