package Demoqa;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class mouseOver {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void mouseOveractions() {
	  
	  action =new Actions(driver);
	  
	  WebElement ele1=driver.findElement(By.linkText("SwitchTo"));
	  
	  //action command
	  action.moveToElement(ele1).build().perform();
	 
	   driver.findElement(By.linkText("Windows")).click();
	   
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
