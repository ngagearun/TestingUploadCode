import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadingDemo {

	public static void main(String[] args) throws IOException {
	
	FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh= wb.getSheet("Sheet1");
	
	int tot_rows=sh.getLastRowNum();
	int tot_cols=sh.getRow(2).getLastCellNum();
	XSSFRow row =sh.getRow(1);
	XSSFCell cell=row.getCell(0);
	if(cell.getCellType()==cell.CELL_TYPE_STRING){
	System.out.println(cell.getStringCellValue());
	}else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
		System.out.println(cell.getNumericCellValue());
	}
	wb.close();
	fi.close();
	
	}

}
