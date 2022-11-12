package popUpAutomate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAutomate
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver",
		         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
				System.out.println("ChomeBrowser opened.");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.manage().window().maximize();
				System.out.println("Window maximized.");

				driver.get("https://www.flipkart.com/");
				System.out.println("Flipkart webpage opened.");
				
			WebElement Username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			Username.sendKeys("9766330238");
			System.out.println("Username entered.");
			
			WebElement Password= driver.findElement(By.xpath("//input[@type='password']"));
			Password.sendKeys("vaib0707");
			System.out.println("Password entered. ");
			
			WebElement LoginButton=	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
			LoginButton.click();
			System.out.println("Login button clicked.");
			Thread.sleep(3000);
			
			WebElement TVApp = driver.findElement(By.xpath("//div[text()='TVs & Appliances']"));
			TVApp.click();
			System.out.println("TV & appliences tab selected.");
		
			Thread.sleep(3000);
			WebElement TVApp2=	driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
			
			Actions action= new Actions(driver);
			action.moveToElement(TVApp2).perform();
			
			Thread.sleep(1000);
			
			WebElement TV=	driver.findElement(By.xpath("//a[text()='Television']"));
			TV.click();
			System.out.println("Television tab selected.");
			
			Thread.sleep(3000);
			WebElement LEDTV=	driver.findElement(By.xpath("//a[text()='Mi Q1 189.34 cm (75 inch) QLED Ultra HD (4K) Smart Android TV Ful...']"));
			LEDTV.click();
			System.out.println("Product selected.");
			
			Thread.sleep(3000);
//			
			List<String> allWindows =new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allWindows.get(1));
			System.out.println("Switched to popUp.");
			
			Thread.sleep(3000);
			
			WebElement addToCart=	driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
			addToCart.click();
			System.out.println("Product added to cart.");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 System.out.println("Casting of driver done");
			 js.executeScript("window.scrollBy(100,0)");
			 Thread.sleep(2000);
			
//			WebElement goToCart=	driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
//			goToCart.click();
//			System.out.println("Go to cart.");
			Thread.sleep(3000);
			
			 WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']"));
			 js.executeScript("arguments[0].scrollIntoView();",remove);
			 Thread.sleep(6000);
			
			
			 remove.click();
			 System.out.println("Clicked on remove button.");
			 Thread.sleep(2000);
			 
			 List<String> allwindow=new ArrayList<String>(driver.getWindowHandles());
			 driver.switchTo().window(allwindow.get(1));
			 System.out.println("Switched to remove popUp.");
		   	Thread.sleep(4000);
				
		    WebElement removePopUp = driver.findElement(By.xpath("//div[text()='Remove']"));
			removePopUp.click();
			System.out.println("Confirmed on remove item.");
			Thread.sleep(2000);
				 	
			WebElement Vaibhav = driver.findElement(By.xpath("//div[text()='Vaibhav']"));
			action.moveToElement(Vaibhav).perform();
			System.out.println("Moved on menuTab.");
			
			Thread.sleep(2000);
			WebElement Logout=	driver.findElement(By.xpath("//div[text()='Logout']"));
			Logout.click();
			System.out.println("Clicked on LogOut.");
			
			System.out.println("End of program");
  }
}
