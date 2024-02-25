package Demoqa;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class informationcommands  {
  private ChromeDriver driver;

@Test(priority=1)
  public void gmail() {
	
	String str1=driver.findElement(By.linkText("Gmail")).getText();
	
	System.out.println(str1);
}
@Test(priority=2)
 public void googleimage() {
	
	String str2=driver.findElement( By.xpath("//span[normalize-space()='Images']")).getAttribute("alt");
	
	System.out.println(str2);
	
}
 
@Test(priority=3)
public  void searchbutton() {
	
	String  str3=driver.findElement(By.name("btnk")).getAttribute("value");
	
	System.out.println(str3);
	
}
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com");
	  
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
