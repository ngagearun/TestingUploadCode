package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DraggableDemo extends Reusable{

	DraggableDemo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser("firefox");
		appurl("https://jqueryui.com", "Draggable demo");
		Thread.sleep(3000);
		driver.switchTo().frame(200);		
		WebElement draggable=driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		
        action.dragAndDropBy(draggable, 61, 95).perform();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Droppable")).click();
        driver.close();
	}

}
