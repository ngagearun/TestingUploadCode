package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHover extends Reusable {

	MouseHover(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser("chrome");
		appurl("https://www.flipkart.com/", "Opening the flipkat app");
		Thread.sleep(6000);

		
		 action=new Actions(driver);
		 
		WebElement electonics=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		action.moveToElement(electonics).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mi")).click();
		Thread.sleep(3000);
		String text=driver.findElement(By.className("_2yAnYN")).getText();
		System.out.println(text);
		WebElement min_price=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
		Select select=new Select(min_price);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByValue("10000");
		Thread.sleep(3000);
		select.selectByVisibleText("₹30000");
		Thread.sleep(3000);
		driver.close();
		
	}

}
