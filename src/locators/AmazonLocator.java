package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocator 
{
 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	 
	 WebElement Username=driver.findElement(By.name("email"));
	 Username.sendKeys("vaibhavtotre123@gmail.com");
	 
	 WebElement Continue=driver.findElement(By.id("continue"));
	 Continue.click();
	 
	 WebElement Password=driver.findElement(By.id("ap_password"));
	 Password.sendKeys("vaib0707");
	 
	 WebElement Submit=driver.findElement(By.id("signInSubmit"));
	 Submit.click();
	 
	 WebElement SearchBar=driver.findElement(By.id("twotabsearchtextbox"));
	 SearchBar.sendKeys("mobile");
	 
	 WebElement Search=driver.findElement(By.id("nav-search-submit-button"));
	 Search.click();
	 
	 WebElement samsung=driver.findElement(By.className("a-size-medium a-color-base a-text-normal"));
	 samsung.click();
	 
	 
	 
}
}
