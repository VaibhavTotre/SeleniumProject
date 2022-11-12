package ImportFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportExcel1 
{
 public static void main(String[] args) throws IOException 
 {
	String address = "V:\\software testing\\Amazon TCD.xlsx";
	
	FileInputStream file = new FileInputStream(address);
	
	XSSFWorkbook book = new XSSFWorkbook(file);
	
	XSSFSheet sheet = book.getSheet("Amazon");
	
	XSSFRow row = sheet.getRow(2);
	
	XSSFCell cell = row.getCell(0);
	
	String username = cell.getStringCellValue();
	
	System.out.println(username);
	
	
}
}
