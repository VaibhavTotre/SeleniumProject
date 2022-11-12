package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot1 
{

  static WebDriver driver;

   public static void getScreenshots(String Name) throws IOException
   {
	 TakesScreenshot ss =  (TakesScreenshot)driver;
	 File sourceFile = ss.getScreenshotAs(OutputType.FILE);
	 File destFile = new File("V:\\software testing\\Snapshots\\"+Name+".jpg");  
	 FileHandler.copy(sourceFile, destFile);
	 
   }


	public static void main(String[] args) throws InterruptedException, IOException 
	 {
		 System.setProperty("webdriver.chrome.driver",
		         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

				driver =  new ChromeDriver();
	            driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
			
				 WebElement Username=driver.findElement(By.xpath("//input[@id='user-name']"));
				 Username.sendKeys("performance_glitch_user");
				// Thread.sleep(3000);
				 WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
				 Password.sendKeys("secret_sauce");
				// Thread.sleep(3000);
				 WebElement Login= driver.findElement(By.xpath("//input[@name='login-button']"));
				 Login.click();
				 
				 
				 
				 String HomeTitle=driver.getTitle();
				 System.out.println(HomeTitle);
				 
				 getScreenshots("LoginSS");
				 
				 WebElement Choose= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
				 Choose.click();
				 
				 WebElement AddToCart= driver.findElement(By.xpath("//button[text()='Add to cart']"));
				 AddToCart.click();
				 
				 getScreenshots("AddToCartSS");

				 WebElement GoToCart= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
				 GoToCart.click();
				 
				 WebElement Checkout= driver.findElement(By.xpath("//button[@id='checkout']"));
				 Checkout.click();
				 
				 WebElement FirstName= driver.findElement(By.xpath("//input[@id='first-name']"));
				 FirstName.click();
				 FirstName.sendKeys("Vaibhav");

				 WebElement LastName= driver.findElement(By.xpath("//input[@id='last-name']"));
				 LastName.click();
				 LastName.sendKeys("Totre");
				 
				 WebElement PostalCode= driver.findElement(By.xpath("//input[@id='postal-code']"));
				 PostalCode.click();
				 PostalCode.sendKeys("410512");
				 
				 WebElement Continue= driver.findElement(By.xpath("//input[@id='continue']"));
				 Continue.click();
				 
				 WebElement Finish= driver.findElement(By.xpath("//button[text()='Finish']"));
				 Finish.click();
				 
				 WebElement BackToHome= driver.findElement(By.xpath("//button[text()='Back Home']"));
				 BackToHome.click();
				 
				 Thread.sleep(10000);
				 WebElement OpenMenu= driver.findElement(By.xpath("//button[text()='Open Menu']"));
				 OpenMenu.click();
				 
				 WebElement Logout= driver.findElement(By.xpath("//button[text()='Open Menu']"));
				 Logout.click();
	}
}
