package com.seleniumprograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchApplication extends Reusable {
	
     static ExcelReusable ex;

	LaunchApplication(WebDriver driver) throws InterruptedException, IOException {
		super(driver);
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
				
		ex=new ExcelReusable("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx", "Sheet1");
		launchbrowser("firefox");
		appurl("https://www.mortgagecalculator.org/", "opening the mortgage calculator app");
		Thread.sleep(3000);
		
		driver.findElement(By.id("homeval")).sendKeys(ex.getCellData(1, 0));
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("loanamt")).sendKeys(ex.getCellData(1, 0));
		driver.findElement(By.id("intrstsrate")).sendKeys(ex.getCellData(1, 2));
		
		click(By.name("cal"),"Clicking on calculate button");

		Thread.sleep(3000);
		driver.close();
		
		
	
		
	  
		
		

	}

}
