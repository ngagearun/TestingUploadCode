package com.seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableDemo extends Reusable {

	WebTableDemo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser("chrome");
		appurl("https://money.rediff.com/gainers/bsc/dailygroupa?", "Redifff pge");
		Thread.sleep(3000);
		WebElement body =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		List<WebElement> rows =body.findElements(By.tagName("tr"));
		
		for(int i=0;i<2;i++){	
			
			rows.get(i).findElement(By.xpath("//td[2]"));
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));			
			for(int j=0;j<cols.size();j++){
				
				String text=cols.get(j).getText();
				System.out.println(text);
			}
		}

		driver.close();
	}

}
