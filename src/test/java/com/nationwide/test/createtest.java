package com.nationwide.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class createtest {
	
	public static final String URL = "http://localhost:3000/login";
	
	private WebDriver driver;
	
	public void login1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "../../chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void createprofile() throws InterruptedException {
	
	  driver.get("http://localhost:3000/login"); 
	  WebElement username =driver.findElement(By.id("formUsername")); 
	  WebElement password =driver.findElement(By.id("formPassword")); 
	  WebElement login=driver.findElement(By.xpath("//button[text()='Submit']")); 
	  username.sendKeys("admin"); password.sendKeys("admin"); 
	  
	  login.click();  
	  
	  Thread.sleep(1000);
	  
	  WebElement addnewprofile = driver.findElement(By.id("1"));	
      addnewprofile.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement name = driver.findElement(By.name("name"));	
	  name.sendKeys("50 Cent");
	  
	  WebElement programme = driver.findElement(By.name("programme"));
	  programme.sendKeys("TDP");
	  
      WebElement districtdescription = driver.findElement(By.name("districtdescription"));
      districtdescription.sendKeys("Bench");     

      Select stream = new Select(driver.findElement(By.id("stream")));
      stream.selectByVisibleText("Software Engineering");
      
      Select startdate = new Select(driver.findElement(By.id("startdate")));
      startdate.selectByVisibleText("Sep 2016");
      
      WebElement area = driver.findElement(By.name("area"));
      area.sendKeys("Bench Services");
      
      Select internalexternal = new Select(driver.findElement(By.id("internalexternal")));
      internalexternal.selectByVisibleText("External");
      
      Select locationdescription = new Select(driver.findElement(By.id("locationdescription")));
      locationdescription.selectByVisibleText("London");
     
      WebElement background = driver.findElement(By.name("background"));
      background.sendKeys("Rapper from America");
      
      WebElement maintext = driver.findElement(By.name("maintext"));
      maintext.sendKeys("go shorty, its ya burfday, we gonna party like its yo burfday!!!");
      
      WebElement email = driver.findElement(By.name("email"));
      email.sendKeys("fittycent58@hotmail.co.uk");
      
      WebElement facebook = driver.findElement(By.name("facebook"));
      facebook.sendKeys("www.facebook.com/fitty");
      
      WebElement linkedin = driver.findElement(By.name("linkedin"));
      linkedin.sendKeys("www.linkedin.com/fitty");
      
      WebElement twitter = driver.findElement(By.name("twitter"));
      twitter.sendKeys("www.twitter.com/fitty");
      
      WebElement submitform =driver.findElement(By.xpath("//button[text()='Submit']"));
      submitform.click();
      
      Thread.sleep(1000);
      
      WebElement logout =driver.findElement(By.xpath("//span[text()='Logout']"));
	  logout.click();
	}
}