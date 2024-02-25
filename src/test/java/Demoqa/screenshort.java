package Demoqa;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class screenshort  {
	
public WebDriver driver;

@Test
  public void alertscreen() throws Exception {
	
	driver.findElement(By.id("alertbutton")).click();
	Thread.sleep(2000);
	
	String s=driver.switchTo().alert().getText();
	
	System.out.println(s);
	Thread.sleep(2000); 
	
	driver.switchTo().alert().accept();
	
	String ATM ="APJ KALAM";
	
	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(scrFile,new File("C:\\Users\\sh\\OneDrive\\Pictures\\pexels-pixabay-60597 (1).jpg\""+ATM+".png"));
	
  }
  @BeforeTest
  public void beforetest() throws IOException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://demoqa.com/alerts");
	  
	  String ATM="RRR";
	  
	  File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrFile,new File("C:\\Users\\sh\\OneDrive\\Pictures\\pexels-pixabay-60597 (1).jpg\""+ATM+".png"));
		

  }

  @AfterTest
  public void afterTest() {
  }

}
