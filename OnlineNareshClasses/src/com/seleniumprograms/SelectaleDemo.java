package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectaleDemo extends Reusable {

	SelectaleDemo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
	
		launchbrowser("chrome");
		appurl("https://jqueryui.com/selectable/", "opening the mortgage calculator app");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		WebElement item1=driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
		WebElement item3=driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
		WebElement item4=driver.findElement(By.xpath("//*[@id='selectable']/li[4]"));
		
		 action=new Actions(driver);
		 action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item4).perform();
		 
		 Thread.sleep(3000);
		 driver.close();

	}

}
