package locators;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass1 
{
public static void main(String[] args) throws InterruptedException 
{
	 System.setProperty("webdriver.gecko.driver",
	         "V:\\software testing\\Selenium Installation\\geckodriver.exe");

			WebDriver driver =  new FirefoxDriver();

			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.navigate().to("https://www.selenium.dev/");
			Thread.sleep(5000);
			
			
			driver.get("https://www.facebook.com/");
			driver.navigate().back();
			Thread.sleep(5000);
			driver.navigate().forward();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			//driver.manage().window().minimize();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			//driver.close();
			Thread.sleep(5000);
			//driver.quit();
			driver.navigate().to("https://ssup.uidai.gov.in/checkSSUPStatus/checkupdatestatus");
			Thread.sleep(10000);
			Dimension d=new Dimension(250,300);
			driver.manage().window().setSize(d);
			Thread.sleep(5000);
			Point p=new Point(200,300);
			driver.manage().window().setPosition(p);
			System.out.println("end");
			
			

}
}
