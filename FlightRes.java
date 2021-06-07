package com.priyanka.flightReservation.FlightReservation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FlightRes {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
    public void setup()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://blazedemo.com/");
            
        }
	
	@Test
	@Parameters({"name","address","city","state","zipcode","creditcardno","month","year"})
	
	public void FlightDemo(String name, String address, String city,String state,String zipcode,String creditcardno,String month,String year) {
		
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "BlazeDemo" , "Title is not matched");
		
		Select fromPort=new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByVisibleText("Boston");
		
		Select toPort=new Select(driver.findElement(By.name("toPort")));
		toPort.selectByVisibleText("Berlin");
		
		driver.findElement(By.className("btn-primary")).click();
		String Title1=driver.getTitle();
		Assert.assertEquals(Title1, "BlazeDemo - reserve" , "Title1 is not matched");
		
		driver.findElement(By.xpath("(//*[@class='btn btn-small'])[2]")).click();
		
		String Title2=driver.getTitle();
		Assert.assertEquals(Title2, "BlazeDemo Purchase" , "Title2 is not matched");
		
		driver.findElement(By.name("inputName")).clear();
		driver.findElement(By.name("inputName")).sendKeys(name);
		driver.findElement(By.name("address")).clear();
		driver.findElement(By.name("address")).sendKeys(address);
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("zipCode")).clear();
		driver.findElement(By.name("zipCode")).sendKeys(zipcode);
		Select cardtype=new Select(driver.findElement(By.name("cardType")));
		cardtype.selectByVisibleText("American Express");
		
		driver.findElement(By.name("creditCardNumber")).clear();
		driver.findElement(By.name("creditCardNumber")).sendKeys(creditcardno);
		
		driver.findElement(By.id("creditCardMonth")).clear();
		driver.findElement(By.id("creditCardMonth")).sendKeys(month);
		
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys(year);
		
		driver.findElement(By.id("nameOnCard")).clear();
		driver.findElement(By.id("nameOnCard")).sendKeys(name);
		
		driver.findElement(By.className("btn-primary")).click();
		
		String Title3=driver.getTitle();
		
		Assert.assertEquals(Title3, "BlazeDemo Confirmation" , "Title3 is not matched");
			
		
	}
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
			
		
		
		
		
		
		
	}
	


	
			
			
	  
  
 
	  
	  
	  
	  	
		
  }
  
  
  



