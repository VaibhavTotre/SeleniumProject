package popUpAutomate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUp 
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
	 
	 driver.get("https://demoqa.com/alerts");
	 System.out.println("URL Opened");
	 
	 Thread.sleep(2000);
	 
	WebElement clickMe1=driver.findElement(By.xpath("//button[@id='alertButton']"));
	clickMe1.click();
	System.out.println("clickMe1 button found out and clicked.");
	
	//validation for clickMe1
	
	
	Thread.sleep(1000);
	Alert al=driver.switchTo().alert();
	al.accept();
	System.out.println("Switched to first alert and clicked ok.");
	
	Thread.sleep(2000);
	WebElement clickMe2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	clickMe2.click();
	System.out.println("clickMe2 button found out and clicked.");
	
	Thread.sleep(6000);
	Alert al2=driver.switchTo().alert();
	al2.accept();
	System.out.println("Switched to second alert and clicked ok.");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 System.out.println("Casting of driver done");
	 js.executeScript("window.scrollBy(0,280)");
	
	Thread.sleep(2000);
	WebElement clickMe3=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	Thread.sleep(2000);
	clickMe3.click();
	System.out.println("clickMe3 button found out and clicked.");
	
	Thread.sleep(1000);
	Alert al3=driver.switchTo().alert();
	al3.accept();
	System.out.println("Switched to third alert and clicked ok.");
	
	Thread.sleep(2000);
	WebElement clickMe4=driver.findElement(By.xpath("//button[@id='promtButton']"));
	clickMe4.click();
	System.out.println("clickMe4 button found out and clicked.");
	
	Thread.sleep(1000);
	Alert al4=driver.switchTo().alert();
	al4.sendKeys("Everything is alright!");
	Thread.sleep(3000);
	al4.dismiss();
	System.out.println("Switched to last alert text entered and dismissed the alert.");
	
	System.out.println("End of the Program...");
}
}
