package Demoqa;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class popupwindow {
	
	public WebDriver driver;
	
  @Test
  public void windowpopup() throws Exception  {
	  
	  //click on the separate window
	  driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
	  Thread.sleep(2000);
	  
	  //click button
	  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  Thread.sleep(2000);
	  
	 //come back to parent window handle
	  String backtoparentwindow = driver.getWindowHandle();
	  
	  //handling child window
	  for(String childwindowhandle:driver.getWindowHandles()) {
		  
	 //switch to child window
	 driver.switchTo().window(childwindowhandle);
	  }
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  //click on the blog button
	  driver.findElement(By.xpath(("//a[@class='nav-link']//span[contains(text(),'Blog')]"))).click();
	 Thread.sleep(2000);
	 
	 //childwindow closed
	 driver.close();
	Thread.sleep(2000);
	
	//again switch back to parent window
	driver.switchTo().window(backtoparentwindow);
	Thread.sleep(2000);
	
	//click on the home button 
	driver.findElement(By.linkText("Home")).click();
	Thread.sleep(2000);
	
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
