package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAutomate 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.instagram.com/");
			Thread.sleep(2000);
	
	WebElement Username =driver.findElement(By.xpath("//input[@name='username']"));
	Username.sendKeys("vaibhav_totre_007");
	Thread.sleep(2000);
	
	WebElement Password =driver.findElement(By.xpath("//input[@name='password']"));
	Password.sendKeys("vaib0707");
	Thread.sleep(2000);
	
	WebElement Login =driver.findElement(By.xpath("//div[text()='Log In']"));
	Login.click();
	Thread.sleep(4000);
	
	WebElement notnow = driver.findElement(By.xpath("//button[text()='Not Now']"));
	notnow.click();
	Thread.sleep(5000);
	
	WebElement notnow2 = driver.findElement(By.xpath("//button[text()='Not Now']"));
	notnow2.click();
	Thread.sleep(4000);
	
	WebElement Profile = driver.findElement(By.xpath("//span[@class='_aa8h _aa8i']"));
	Profile.click();
	Thread.sleep(2000);
	
	WebElement Logout = driver.findElement(By.xpath("//div[text()='Log Out']"));
	Logout.click();
	

}
}
