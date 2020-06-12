package com.applicationname.businessscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.applicationname.reusable.ReusableTestNG;

public class DataProviderInTestNG extends ReusableTestNG{
	
	@Test(dataProvider="cal")
	public void calculateinterest(String homevalue,String downpayment,String loanamt,String interestrate) throws IOException{
		
		sendText(By.id("homeval"), homevalue);
		sendText(By.id("downpayment"), downpayment);
		sendText(By.id("loanamt"), loanamt);
		sendText(By.id("intrstsrate"), interestrate);
		click(By.name("cal"), "calculatebutton");
	}
	
	
	@DataProvider(name="cal")	
	public String[][] inputvalues() throws IOException{
		
		String pathname="C:\\Users\\Lenovo\\Documents\\OnlineNareshClasses\\src\\com\\applicationname\\resources\\ExcelOperations.xlsx";
		String arr[][]=readdatafromExcel(pathname,"Sheet1");  
		return arr;		
	}


	private String[][] readdatafromExcel(String path, String sheetname) throws IOException {
		
		String arr[][]=null;
		FileInputStream fi=new FileInputStream(path);
		//Workbook wb=WorkbookFactory.create(fi);		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet(sheetname);
		int tot_rows=sh.getLastRowNum();
		int tot_cols=sh.getRow(2).getLastCellNum();
		XSSFRow row;XSSFCell cell;
		arr=new String[tot_rows][tot_cols];
		for(int i=1;i<=tot_rows;i++){
			
			row=sh.getRow(i);
			
			for(int j=0;j<tot_cols;j++){
				
				cell=row.getCell(j);
				arr[i-1][j]=cell.getStringCellValue();
			}
			
		}	
		
		return arr;
	}
	
	
	
	

}
