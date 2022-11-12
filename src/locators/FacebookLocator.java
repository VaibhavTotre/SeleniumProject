package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocator 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.facebook.com/");
	 
	String LoginTitle= driver.getTitle();
	
	if(LoginTitle.equals("Facebook – log in or sign up"))
	{
		System.out.println("Test case passed.");
	}
	else
	{
		System.out.println("Test case failed.");
	}
	
	WebElement Username=driver.findElement(By.name("email"));
    Username.sendKeys("9766330238");
    
    WebElement Password=driver.findElement(By.id("pass"));
    Password.sendKeys("vaib0707");
    
    WebElement LoginButton=driver.findElement(By.tagName("button"));
    LoginButton.click();
    
    //Thread.sleep(4000);
String HomeTitle= driver.getTitle();
	
	if(HomeTitle.equals("(1) Facebook"))
	{
		System.out.println("Test case passed.");
	}
	else
	{
		System.out.println("Test case failed.");
	}
    
	System.out.println(HomeTitle);
    WebElement Options=driver.findElement(By.className("dir"));
    Options.click();
    }
}
