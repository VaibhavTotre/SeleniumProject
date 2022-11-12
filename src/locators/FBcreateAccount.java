package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FBcreateAccount 
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
	 
	 driver.get("https://www.facebook.com/");
	 System.out.println("URL Opened");
	 
	 Thread.sleep(2000);
	 
	 Actions act= new Actions(driver);
	 
	WebElement createAcc = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
	createAcc.click();
	System.out.println("Create new account button clicked");
	
	Thread.sleep(2000);
	WebElement dropdownDay = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
	//dropdownDay.click();
	
	Select s=new Select(dropdownDay);
	s.selectByValue("3");
	System.out.println("Day 3rd entered");
	
	WebElement genderMale= driver.findElement(By.xpath("//label[text()='Male']"));
	boolean gen= genderMale.isSelected();
	if(gen==true)
	{
		System.out.println("Gender male is selected");
	}
	else
	{
		act.click(genderMale).perform();
		System.out.println("Gender male is selected");
		
	}
}
}
