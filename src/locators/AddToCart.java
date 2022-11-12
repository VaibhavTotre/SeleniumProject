package locators;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart 
{
	

	
		public static void main(String[] args) throws InterruptedException, IOException
		{
			
//			//Excel file address
//					String address="V:\\software testing\\Excel Test Data\\Flipkart Test Data.xlsx";
//
//					//File read
//					FileInputStream file=new FileInputStream(address);
//					
//					//WorkBook
//					XSSFWorkbook book=new XSSFWorkbook(file);
//					
//					//Sheet
//					XSSFSheet sheet=book.getSheet("Flipkart");
//					
//					//Row
//					XSSFRow row=sheet.getRow(0);
//					
//					//column
//					XSSFCell column=row.getCell(0);
//					
//					//username
//					double username=column.getNumericCellValue();
//					long username1=(long)username;
//					System.out.println(username1);
//					
//				
//					//password
//					XSSFRow row1=sheet.getRow(0);
//				   XSSFCell column1= row1.getCell(1);
//				   String pass=column1.getStringCellValue();
//				System.out.println(pass);
		
			//set property
			 System.setProperty("webdriver.chrome.driver",
			         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

			//open browser
			WebDriver driver=new ChromeDriver();
			Thread.sleep(3000);
			
			//maximize window
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//open URL
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			
			//find username 
			WebElement user=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			user.sendKeys("vaibhavtotre123@gmail.com");
			
			
			
//			StringBuffer un=new StringBuffer();
//			un.append("9766330238");
//			user.sendKeys(un);
		     Thread.sleep(1000);
		     
		     //find password
		WebElement pswd=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pswd.sendKeys("Vaib0707");
//		un.append(pass);
//		pswd.sendKeys(un);
		Thread.sleep(1000);
		
		//click on login button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();//login button
		Thread.sleep(1000);
		
		
		//click on mobiles and tablets
		WebElement mobiles=driver.findElement(By.xpath("//div[text()='Mobiles']"));
		mobiles.click();
		Thread.sleep(3000);
		
		//element find and perform mouse action
		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		Thread.sleep(2000);
		
		//find MI element
		WebElement MI=driver.findElement(By.xpath("//a[text()='Mi']"));
		MI.click();
		Thread.sleep(2000);
		
		//mobile find
		WebElement mobileselect=driver.findElement(By.xpath("(//div[text()='REDMI 10A (Sea Blue, 64 GB)'])[1]"));
		mobileselect.click();
		Thread.sleep(3000);
		
		//Child browser pop ups
		List<String> allwindow=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allwindow.get(1));
		Thread.sleep(3000);
		
		//add to cart
		WebElement addtocart=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		addtocart.click();
		
		//Program end
	    System.out.println("End of Program");
		
		

		}

}

