package com.seleniumprograms;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands extends Reusable {

	static ReusablePropertiesFile property;
	
	Navigationcommands(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		property=new ReusablePropertiesFile(System.getProperty("user.dir")+"\\configuration.properties");
		launchbrowser(property.getPropertyData("browsername"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		appurl("https://www.selenium.dev/", "Opening the selenium deve application");
		
		String titlename=driver.getTitle();
		System.out.println(titlename);
		
		driver.findElement(By.linkText("Downloads")).click();
		

		driver.findElement(By.linkText("Projects")).click();
		

		driver.findElement(By.linkText("Documentation")).click();
		
		
		Navigation nav=driver.navigate();
		nav.back();
		
		nav.forward();
		
		nav.refresh();
		String currenturl=driver.getCurrentUrl();
		driver.get(currenturl);
		
		nav.to(currenturl);
		
		driver.findElement(By.id("search-by")).sendKeys(Keys.F5);
			
		driver.close();

	}

}
