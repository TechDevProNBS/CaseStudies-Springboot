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
import org.openqa.selenium.JavascriptExecutor;

public class fullcrudtest {
	
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
	public void crudtest() throws InterruptedException {
	

	driver.manage().window().maximize();
	
	  driver.get("http://localhost:3000/login"); 
	  WebElement username =driver.findElement(By.id("formUsername")); 
	  WebElement password =driver.findElement(By.id("formPassword")); 
	  WebElement login=driver.findElement(By.xpath("//button[text()='Submit']")); 
	  username.sendKeys("admin"); password.sendKeys("admin"); 
	  
	  login.click(); 
	  
	  String actualUrl="http://localhost:3000/viewprofiles"; 
	  
	  Thread.sleep(1000);
	  
	  WebElement addnewprofile = driver.findElement(By.id("1"));	
      addnewprofile.click();
	  
	  Thread.sleep(3000);
	  
	  WebElement name = driver.findElement(By.name("name"));	
	  name.sendKeys("Celine Dion");
	  
	  WebElement programme = driver.findElement(By.name("programme"));
	  programme.sendKeys("TDP");
	  
      WebElement districtdescription = driver.findElement(By.name("districtdescription"));
      districtdescription.sendKeys("Bench");     

      Select stream = new Select(driver.findElement(By.id("stream")));
      stream.selectByVisibleText("Software Engineering");
      
      Select startdate = new Select(driver.findElement(By.id("startdate")));
      startdate.selectByVisibleText("Sep 2015");
      
      WebElement area = driver.findElement(By.name("area"));
      area.sendKeys("Bench Services");
      
      Select internalexternal = new Select(driver.findElement(By.id("internalexternal")));
      internalexternal.selectByVisibleText("External");
      
      Select locationdescription = new Select(driver.findElement(By.id("locationdescription")));
      locationdescription.selectByVisibleText("London");
     
      WebElement background = driver.findElement(By.name("background"));
      background.sendKeys("Songstress from Canada");
      
      WebElement maintext = driver.findElement(By.name("maintext"));
      maintext.sendKeys("near, far, where ever you are , I beleive that the heart does go on...");
      
      WebElement email = driver.findElement(By.name("email"));
      email.sendKeys("celine56@hotmail.co.uk");  
      
      WebElement facebook = driver.findElement(By.name("facebook"));
      facebook.sendKeys(" ");
      
      WebElement linkedin = driver.findElement(By.name("linkedin"));
      linkedin.sendKeys("www.linkedin.com/celine");
      
      WebElement twitter = driver.findElement(By.name("twitter"));
      twitter.sendKeys("www.twitter.com/celine");
      
      WebElement submitform =driver.findElement(By.xpath("//button[text()='Submit']"));
      submitform.click();
      
      Thread.sleep(2000);
      
      ((JavascriptExecutor) driver)
      .executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
      Thread.sleep(2000);
      
      int length = driver.findElements(By.name("edit")).size();
      
      WebElement editprofile = driver.findElements(By.name("edit")).get(length-1);
      editprofile.click();
      
      Thread.sleep(2000);
      
      WebElement facebook2 = driver.findElement(By.name("facebook"));	
	  facebook2.sendKeys("www.facebook.com/celine");
	  
	  WebElement submitform2 =driver.findElement(By.xpath("//button[text()='Submit']"));
	  submitform2.click();
	  
	  Thread.sleep(2000);
	  
	  ((JavascriptExecutor) driver)
      .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
      
      WebElement deleteprofile = driver.findElements(By.name("delete")).get(length-1);
      deleteprofile.click();
      
      ((JavascriptExecutor) driver)
      .executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
      Thread.sleep(2000);
	  
	  String expectedUrl= driver.getCurrentUrl(); if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
	  System.out.println("Test passed"); } else { System.out.println("Test failed"); 
	  }
	  
	  WebElement logout =driver.findElement(By.xpath("//span[text()='Logout']"));
	  logout.click();
	  
	  ((JavascriptExecutor) driver)
      .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  
	}
}
