package Demoqa;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class alert {

	public WebDriver driver;

	@Test
	public void handling() throws Exception {
       //click on the click me button
		driver.findElement(By.id("alertButton")).click();

		String s = driver.switchTo().alert().getText();

		System.out.println(s);

		Thread.sleep(2000);
       //handling alert
		driver.switchTo().alert().accept();
	}

	@BeforeTest
	public void openurl() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		Thread.sleep(2000);

	}

	@AfterTest
	public void afterTest() {
	}

}
