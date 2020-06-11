package com.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();//launch the chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		Thread.sleep(3000);
		

		if(driver.findElement(By.id("leftNav")).isEnabled()){
		System.out.println("leftNav is enable");
		 int count=0;
		for( int i =0; i<=count;count++) {
		driver.findElement(By.id("leftNav")).click();
		//Thread.wait(3000);
		System.out.println("No. of clicks"+count);
		}

		//System.out.println("No. of clicks"+count);
		}else
		{
		System.out.println("rightNav is enable");

		 int count=0;
		for( int i =0; i<=count;count++) {
		driver.findElement(By.id("rightNav")).click();
		//Thread.wait(3000);
		System.out.println("No. of clicks"+count);
		}
		}

		//System.out.println("No. of clicks"+count);
		driver.close();
		System.out.println("Closing the application!");

		}







	

}
