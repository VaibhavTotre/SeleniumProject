package popUpAutomate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQApopUp 
{
	 public static void main(String[] args) throws InterruptedException 
	 {
		 System.setProperty("webdriver.chrome.driver",
		         "V:\\software testing\\Selenium Installation\\chromedriver.exe");
		 System.out.println("Property set");
		 
		 WebDriver driver=new ChromeDriver();
		 System.out.println("ChromeDriver Open");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.manage().window().maximize();
		 System.out.println("Window maximized");
		 
		 driver.get("https://demoqa.com/browser-windows");
		 System.out.println("URL Opened");
		 
		 Thread.sleep(2000);
		 
		WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		newTab.click();
		System.out.println("Clicked on new tab button.");
		Thread.sleep(2000);
		
		List<String> allWindows =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allWindows.get(1));
		System.out.println("Switched to popUp window.");
		
		WebElement sampleHeading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String expectedHeading = "This is a sample page";
		String actualHeading = sampleHeading.getText();
		
		
		if(actualHeading.equals(actualHeading))
		{
			System.out.println("Test case for New tab button is passed.");
		}
		
		driver.switchTo().window(allWindows.get(0));
		Thread.sleep(2000);
		
		WebElement newButton = driver.findElement(By.id("windowButton"));
		newButton.click();
		System.out.println("Clicked on new window button.");
		Thread.sleep(2000);
		
		driver.switchTo().window(allWindows.get(1));
		Thread.sleep(2000);
		
		WebElement sampleHeading2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String expectedHeading2 = "This is a sample page";
		String actualHeading2 = sampleHeading.getText();
		
		if(actualHeading2.equals(actualHeading2))
		{
			System.out.println("Test case for New tab window is passed.");
		}
		
		driver.switchTo().window(allWindows.get(0));
		
		WebElement lastButton = driver.findElement(By.id("messageWindowButton"));
		newButton.click();
		System.out.println("Clicked on new window button.");
		Thread.sleep(2000);
		
		driver.switchTo().window(allWindows.get(1));
		Thread.sleep(2000);
		
		WebElement sampleText = driver.findElement(By.xpath("//body[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']"));
		String expectedtext = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
		String actualtext = sampleText.getText();
		
		if(actualtext.equals(expectedtext))
		{
			System.out.println("Test case for Last Button is passed.");
		}
		
		
		
		Thread.sleep(2000);
		
		
	 }
}
