package seleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
 public static void main(String[] args) 
 {
	 System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");
       
	 WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement username = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='name']"))));
		username.sendKeys("standard_user");
		

		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");

		WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
}
}
