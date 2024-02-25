package alert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	
	public WebDriver driver;
	
  @Test
  public void handling() {
	  
	  driver.findElement(By.id("//button[@id='alertButton']")).click();
	  
	  string s=driver.switchTo().alert().getText();
	  
	  System.out.println(s);
	  
	 Thread.sleep(2000);
	  
	  driver.switchTo().alert().accept();
  }
	  
  @BeforeTest
  public void beforeTest() {
	  webdriver.manager.chromedriver().setup();
	  
	  driver=new chromedriver();
	  
	  driver.get("https://demoqa.com/alerts");
	  
	  driver.manage().window().maxmize();
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
