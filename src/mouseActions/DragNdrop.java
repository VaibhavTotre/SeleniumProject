package mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  
	  	//set property
	  System.setProperty("webdriver.chrome.driver",
		         "V:\\software testing\\Selenium Installation\\chromedriver.exe");

	  			
	  			//Open chromedriver
	  			WebDriver driver=new ChromeDriver();
	  			System.out.println("open chrome browser");
	  			Thread.sleep(3000);
	  			
	  			//maximize window
	  			driver.manage().window().maximize();
	  			System.out.println("window maximized");
	  			Thread.sleep(3000);
	  			
	  			//open URl
	  			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	  			System.out.println("URL opened");
	  			Thread.sleep(3000);
	  			
	  
	  		 WebElement washington=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));   
	  		 WebElement oslo = driver.findElement(By.id("box1"));
	  		 WebElement Seoul = driver.findElement(By.id("box5"));
	  		 WebElement Stockholm = driver.findElement(By.id("box2"));
	  		 WebElement Copenhagen = driver.findElement(By.id("box4"));
	  		 WebElement Rome = driver.findElement(By.id("box6"));
	  		 WebElement Madrid = driver.findElement(By.id("box7"));
	  		 System.out.println("WebElements of all capitals found out");   
	  		    
	  		    
	  		  WebElement Norway = driver.findElement(By.id("box101"));
	  		  WebElement Swedan = driver.findElement(By.id("box102"));
		  	  WebElement US = driver.findElement(By.id("box103"));
		  	  WebElement Denmark = driver.findElement(By.id("box104"));
		  	  WebElement SouthKorea = driver.findElement(By.id("box105"));
		  	  WebElement Italy = driver.findElement(By.id("box106"));
		  	  WebElement Spain = driver.findElement(By.id("box107"));
		  	  
		  	System.out.println("WebElements of all countries found out");
	  		    
	  		    Actions act = new Actions(driver);
	  		    System.out.println("Object of Actions class created");
	  		    Thread.sleep(2000);
	  //1) 	Washington ---> US
	  		    
	  		act.dragAndDrop(washington, US).perform();
	  		System.out.println("Washington box dragged and droped on US");
	  		  Thread.sleep(2000);
	  		String expected1="visibility: visible; background-color: rgb(0, 255, 0);";        
	  		String actual1= washington.getAttribute("style");
	  		
            if(expected1.equals(actual1))
            {
            	System.out.println("TC for washington hac passed.");
            }
            else
            {
            	System.out.println("TC for washington hac failed.");
            }
	  	
      //2)   ROme --->  italy      
	  		act.dragAndDrop(Rome, Italy).perform();
	  		System.out.println("Rome box dragged and droped on Italy");
	  		Thread.sleep(2000);
	  		String expected2="visibility: visible; background-color: rgb(0, 255, 0);";        
	  		String actual2= Rome.getAttribute("style");
	  	
            if(expected2.equals(actual2))
            {
            	System.out.println("TC for Rome hac passed.");
            }
            else
            {
            	System.out.println("TC for Rome hac failed.");
            }
	  	
      //3) Oslo ---> Norway      
	  		act.dragAndDrop(oslo, Norway).perform();
	  		System.out.println("oslo box dragged and droped on Norway");
	  		Thread.sleep(2000);
	  		String expected3="visibility: visible; background-color: rgb(0, 255, 0);";        
	  		String actual3= Rome.getAttribute("style");
	  		
            if(expected3.equals(actual3))
            {
            	System.out.println("TC for oslo hac passed.");
            }
            else
            {
            	System.out.println("TC for oslo hac failed.");
            }
	  		
	  	//4) Madrid ---> Spain	
	  		act.dragAndDrop(Madrid, Spain).perform();
	  		System.out.println("Madrid box dragged and droped on Spain");
	  		Thread.sleep(2000);
	  		String expected4="visibility: visible; background-color: rgb(0, 255, 0);";        
	  		String actual4= Madrid.getAttribute("style");
	  		
            if(expected4.equals(actual4))
            {
            	System.out.println("TC for Madrid hac passed.");
            }
            else
            {
            	System.out.println("TC for Madrid hac failed.");
            }
	  	
            
      // 5) Seoul ---> SouthKorea     
	  		act.dragAndDrop(Seoul, SouthKorea).perform();
	  		System.out.println("Seoul box dragged and droped on SouthKorea");
	  		Thread.sleep(2000);
	  		String expected5="visibility: visible; background-color: rgb(0, 255, 0);";        
	  		String actual5= Seoul.getAttribute("style");
	  		
            if(expected5.equals(actual5))
            {
            	System.out.println("TC for Seoul hac passed.");
            }
            else
            {
            	System.out.println("TC for Seoul hac failed.");
            }
	  
       //6) Stockholm ---> Swedan     
	  		act.dragAndDrop(Stockholm, Swedan).perform();
	  		System.out.println("Stockholm box dragged and droped on Swedan");
	  		Thread.sleep(2000);
	  		String expected6="visibility: visible; background-color: rgb(0, 255, 0);";        
	  		String actual6= Stockholm.getAttribute("style");
	  		
            if(expected6.equals(actual6))
            {
            	System.out.println("TC for Stockholm hac passed.");
            }
            else
            {
            	System.out.println("TC for Stockholm hac failed.");
            }
	  
       //7) Copenhagen ---> Denmark     
	  		act.dragAndDrop(Copenhagen, Denmark).perform();
	  		System.out.println("Copenhagen box dragged and droped on Denmark");
	  		Thread.sleep(2000);
	  		String expected7="visibility: visible; background-color: rgb(0, 255, 0);";        
	  		String actual7= Copenhagen.getAttribute("style");
	  		
            if(expected7.equals(actual7))
            {
            	System.out.println("TC for Copenhagen hac passed.");
            }
            else
            {
            	System.out.println("TC for Copenhagen hac failed.");
            }
	  		    

     System.out.println("End of the program.");
  }
}
