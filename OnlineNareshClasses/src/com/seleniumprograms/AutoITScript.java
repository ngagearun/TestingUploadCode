package com.seleniumprograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoITScript  extends Reusable{

	AutoITScript(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		launchbrowser("chrome");
		appurl("https://www.naukri.com/", "Opened Naukari wesite");
		Thread.sleep(3000);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\UploadDocument.exe");
		Thread.sleep(3000);
		driver.close();
		

	}

}
