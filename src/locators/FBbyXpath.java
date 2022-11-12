package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBbyXpath 
{
 public static void main(String[] args) 
 {
   System.setProperty("webdriver.chrome.driver","V:\\software testing\\Selenium Installation\\chromedriver.exe");
   System.out.println("Webdriver property set");
   
   WebDriver driver=new ChromeDriver();
   
   driver.get("https://www.facebook.com/");
   System.out.println("FB login page opened");
   
   WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
   System.out.println("Usename element find out");
   Username.sendKeys("9766330238");
   System.out.println("Usename entered");
   
   WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
   System.out.println("Password element find out");
   Password.sendKeys("vaib0707");
   System.out.println("Password entered");
   
   WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
   System.out.println("LoginButton element find out");
   LoginButton.click();
   System.out.println("LoginButton clicked");
   
}
}
