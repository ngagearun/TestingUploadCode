package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollBarActions extends Reusable {

	ScrollBarActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser("chrome");
		appurl("https://www.flipkart.com/", "Redifff pge");
		Thread.sleep(3000);
		WebElement sonycamera=driver.findElement(By.linkText("Sony Camera"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",sonycamera);
		Thread.sleep(3000);
		js.executeScript("arguments[0].style.border='3px dotted red'", sonycamera);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", sonycamera);
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		driver.close();

		


		

	}

}
