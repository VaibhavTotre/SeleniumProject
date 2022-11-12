package ImportFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel2 
{
 public static void main(String[] args) throws InterruptedException, IOException 
 {
	 String address = "V:\\software testing\\ExcelImport.xlsx";
		
		FileInputStream file = new FileInputStream(address);
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("excel");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);
}
}
