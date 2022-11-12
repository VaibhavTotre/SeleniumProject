package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin 
{
 public static void main(String[] args) 
 {
	 System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

			WebDriver driver =  new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			
			WebElement Username= driver.findElement(By.id("identifierId"));
			Username.sendKeys("vaibhavtotre123@gmail.com");
			
			WebElement NextButton= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]"));
			NextButton.click();
			
			WebElement Password= driver.findElement(By.className("whsOnd zHQkBf"));
			Password.sendKeys("vaib0707");
			
 }
}
