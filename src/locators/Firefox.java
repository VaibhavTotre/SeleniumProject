package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox 
{
 public static void main(String[] args) 
 {
	 System.setProperty("webdriver.gecko.driver",
	         "V:\\software testing\\Selenium Installation\\geckodriver.exe");

			WebDriver driver =  new FirefoxDriver();
			
			driver.get("https://www.mozilla.org/en-US/firefox/download/thanks/");

}
}
