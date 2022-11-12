package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLocator 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver",
	         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.saucedemo.com/");
	 //Thread.sleep(3000);
	 
	 String LoginTitle=driver.getTitle();
	 System.out.println(LoginTitle);
	 WebElement Username=driver.findElement(By.id("user-name"));
	 Username.sendKeys("performance_glitch_user");
	// Thread.sleep(3000);
	 WebElement Password=driver.findElement(By.id("password"));
	 Password.sendKeys("secret_sauce");
	// Thread.sleep(3000);
	 WebElement Login= driver.findElement(By.id("login-button"));
	 Login.click();
	 String HomeTitle=driver.getTitle();
	 System.out.println(HomeTitle);
	 
	 WebElement Choose= driver.findElement(By.className("inventory_item_name"));
	 Choose.click();
	 
	 WebElement AddToCart= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	 AddToCart.click();

	 WebElement GoToCart= driver.findElement(By.tagName("span"));
	 GoToCart.click();
	 
	 WebElement Checkout= driver.findElement(By.id("checkout"));
	 Checkout.click();
	 
	 WebElement FirstName= driver.findElement(By.id("first-name"));
	 FirstName.click();
	 FirstName.sendKeys("Vaibhav");

	 WebElement LastName= driver.findElement(By.id("last-name"));
	 LastName.click();
	 LastName.sendKeys("Totre");
	 
	 WebElement PostalCode= driver.findElement(By.id("postal-code"));
	 PostalCode.click();
	 PostalCode.sendKeys("410512");
	 
	 WebElement Continue= driver.findElement(By.id("continue"));
	 Continue.click();
	 
	 WebElement Finish= driver.findElement(By.id("finish"));
	 Finish.click();
	 
	 WebElement BackToHome= driver.findElement(By.id("back-to-products"));
	 BackToHome.click();
	 
 }
}
