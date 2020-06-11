package com.seleniumprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReusable {
	static FileInputStream fi;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static FileOutputStream fo;
	
	public ExcelReusable(String path,String sheetname) throws IOException{
		try{
	       fi =new FileInputStream(path);
	        wb=new XSSFWorkbook(fi);
	       sh =wb.getSheet(sheetname);
		}catch(Exception e){
			e.printStackTrace();
		}
	        
	}
	
	public String getCellData(int rownum,int colno){
		String value=null;	
			try{
				value=sh.getRow(rownum).getCell(colno).getStringCellValue();
		
				}catch(Exception e){
				    e.printStackTrace();
				}

			return value;
		}
	
	
	public void setCellData(int rownum,int colno,String text){
			
			try{
				sh.createRow(rownum).createCell(colno).setCellValue(text);
		
				}catch(Exception e){
				    e.printStackTrace();
				}
			
		}
	
	public void saveWorkBook(String path) throws IOException{
		fo=new FileOutputStream(path);
		wb.write(fo);
		fo.close();
		wb.close();
		fi.close();
	}
	
	
	
	
	
	
	public int getRow(){
		
		int rowno=sh.getLastRowNum();
		return rowno;
	}
	
	public int getCol(int rowno){
		
		int colno=sh.getRow(rowno).getLastCellNum();
		return colno;
	}
	
	
	
	
}
