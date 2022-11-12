package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame1 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

			WebDriver driver =  new ChromeDriver();
			System.out.println("Chromedriver opened.");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
            driver.manage().window().maximize();
            System.out.println("Window maximized.");
            
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			System.out.println("URL opened.");
			
			WebElement iFrame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
			
			Thread.sleep(5000);
			driver.switchTo().frame(iFrame1);
			System.out.println("Switched to iframe1.");
			
			WebElement Textbox = driver.findElement(By.xpath("/html/body/input"));
			Textbox.sendKeys("Not a Friendly Topic");
			System.out.println("Topic entered in textbox.");
			
			WebElement innerFrame2 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
			
			driver.switchTo().frame(innerFrame2);
			System.out.println("Switched to inner frame 2.");
			
			WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
			checkbox.click();
			System.out.println("Checkbox clicked.");
			
			driver.switchTo().defaultContent();
			System.out.println("Switched to grand parent.");
			
			Thread.sleep(3);
			
            WebElement innerFrame3 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
			
			driver.switchTo().frame(innerFrame3);
			System.out.println("Switched to inner frame 3.");
			
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
			System.out.println("Dropdown element found.");
			
			Select s = new Select(dropdown);
			s.selectByValue("babycat");
			System.out.println("babycat selected.");
			
			driver.switchTo().parentFrame();
			System.out.println("Switched on parent window.");
			
			System.out.println("...END OF PROGRAM...");
			
		
 }
}
