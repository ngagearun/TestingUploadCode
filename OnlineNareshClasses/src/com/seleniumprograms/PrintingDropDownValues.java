package com.seleniumprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintingDropDownValues extends Reusable {
	static ExcelReusable ex;
	PrintingDropDownValues(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ex=new ExcelReusable("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx", "Sheet2");
		
	
		launchbrowser("chrome");
		appurl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334", "Draggable demo");
		Thread.sleep(3000);
		WebElement sponsorname=driver.findElement(By.id("c0"));
		List<WebElement> ele=sponsorname.findElements(By.tagName("option"));
		System.out.println(ele.size());
		
		for(int i=0;i<ele.size();i++){
			
			String text=ele.get(i).getText();
			ex.setCellData(i, 3, text);

		}
		
		ex.saveWorkBook("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		driver.close();
		
	

	}

}
