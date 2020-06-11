package com.seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowHandling extends Reusable {

	MultipleWindowHandling(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser("chrome");
		appurl("https://candidate.psiexams.com/index.jsp", "Draggable demo");
		Thread.sleep(3000);
		String mainwindow =driver.getWindowHandle();
		driver.findElement(By.linkText("PSI Bookstore")).click();
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		
		for(String windowname:windows){
			
			if(!windowname.equals(mainwindow)){
				
				driver.switchTo().window(windowname);				
			}
		}
		
		driver.findElement(By.id("search_queryispbxi_")).sendKeys("Test");
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(mainwindow);
		driver.findElement(By.linkText("Certification/Professional Associations")).click();
		driver.quit();
		

	}

}
