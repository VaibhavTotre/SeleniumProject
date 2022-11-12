package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFbAccount 
{
  public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");
	

		
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is Open");
		driver.manage().window().maximize();
		System.out.println("Window is Maximize");
		driver.get("https://www.facebook.com/");
		System.out.println("URL is Enter");
		WebElement createnewaccount =driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createnewaccount.click();
		System.out.println("Click on Create New Account");
		Thread.sleep(2000);
		WebElement firstname =driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Vaibhav");
		System.out.println("Enter The First Name");
		Thread.sleep(2000);
		WebElement lastname =driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Totre");
		System.out.println("Enter The Last Name");
		Thread.sleep(2000);
		WebElement mobileno =driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobileno.sendKeys("9604148905");
		System.out.println("Enter The Userid");
		Thread.sleep(2000);
		WebElement password =driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("vaib1807");
		System.out.println("Enter The Password");
		WebElement dropdownday = driver.findElement(By.xpath("//select[@id='day']"));		
		dropdownday.click();
		Select day= new Select(dropdownday);
		day.selectByValue("3");
		Thread.sleep(2000);
		System.out.println("Day is Selected");
		WebElement dropdownmonth = driver.findElement(By.xpath("//select[@id='month']"));		
		dropdownmonth.click();
		Thread.sleep(2000);
		Select month= new Select(dropdownmonth);
		month.selectByValue("5");
		System.out.println("Month is Selected");
		WebElement dropdownyear = driver.findElement(By.xpath("//select[@id='year']"));		
		dropdownyear.click();
		Thread.sleep(2000);
		Select year= new Select(dropdownyear);
		year.selectByVisibleText("2000");
		System.out.println("Year is Selected");
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));		
		male.click();
		System.out.println("Gender is Selected");
		WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));		
		signup.click();
		System.out.println("Click on Sign up");
//		driver.quit();
		System.out.println("end of program");
}
}
