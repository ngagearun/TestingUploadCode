package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AlertsDemo extends Reusable {

	AlertsDemo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	    ChromeOptions options  = new ChromeOptions();
	    //options.addArguments("incognito");
	    options.addArguments("--disable-popup-blocking");
	    options.addArguments("--disable-notifications");ss
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	    driver = new ChromeDriver(capabilities);
		//launchbrowser();
		appurl("https://www.naukri.com/", "chrome");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[1]")).click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		driver.close();
		

	}

}
