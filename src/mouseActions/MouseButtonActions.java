package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseButtonActions 
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
	 
	 driver.get("https://demoqa.com/buttons");
	 System.out.println("URL Opened");
	 
	 Thread.sleep(2000);
	 
	 Actions act = new Actions(driver);
	 System.out.println("Actions class object created");
	 
	WebElement leftClick=driver.findElement(By.xpath("//button[text()='Click Me']"));
	System.out.println("WebElement of click button find out");
	
	act.click(leftClick).perform();
	System.out.println("Normal click performed");
	
	Thread.sleep(2000);
	WebElement result1= driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
	String expected1= "You have done a dynamic click";
	String actual1= result1.getText();
	if(actual1.equals(expected1))
	{
		System.out.println("We performed normal click and test case pass");
	}
	
	Thread.sleep(2000);
	WebElement rightClick=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	System.out.println("WebElement of RightClick button find out");
	
	act.contextClick(rightClick).perform();
	System.out.println("Right click performed");
	
	Thread.sleep(2000);
	WebElement result2= driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
	String expected2= "You have done a right click";
	String actual2= result2.getText();
	if(actual2.equals(expected2))
	{
		System.out.println("We performed right click and test case pass");
	}
	
	Thread.sleep(2000);
	WebElement doubleClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	System.out.println("WebElement of Double click button find out");
	
	act.doubleClick(doubleClick).perform();
	System.out.println("Double click performed");
	
	Thread.sleep(2000);
	WebElement result3= driver.findElement(By.xpath("//p[text()='You have done a double click']"));
	String expected3= "You have done a double click";
	String actual3= result3.getText();
	if(actual3.equals(expected3))
	{
		System.out.println("We performed double click and test case pass");
	}
	
	
}
}
