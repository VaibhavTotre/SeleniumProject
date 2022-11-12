package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction 
{
public static void main(String[] args) throws InterruptedException 
{
	 System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");
	 System.out.println("Property set");
	 
	 WebDriver driver=new ChromeDriver();
	 System.out.println("ChromeDriver Open");
	 
	 driver.manage().window().maximize();
	 System.out.println("Window maximized");
	 
	 driver.get("https://vctcpune.com/");
	 System.out.println("URL Opened");
	 
	 Thread.sleep(2000);
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 System.out.println("Casting of driver done");
	 
	 WebElement startButton= driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']"));
     System.out.println("Start webelement found out");
     
     js.executeScript("arguments[0].scrollIntoView(true);",startButton );
     System.out.println("Page scrolled upto element");
     
     Thread.sleep(2000);
     js.executeScript("window.scrollBy(0,2000)");
     System.out.println("Page scrolled down");
     
     Thread.sleep(2000);
     js.executeScript("window.scrollBy(0,-4000)");
     System.out.println("Page scrolled up");
     
     System.out.println("End of program");
}
}
