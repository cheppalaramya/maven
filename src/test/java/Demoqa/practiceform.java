package Demoqa;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class practiceform {
	public WebDriver driver;

	@Test
	public void studentform() throws Exception {

		driver.findElement(By.id("firstName")).sendKeys("ramya");

		driver.findElement(By.id("lastName")).sendKeys("ram");

		driver.findElement(By.id("userEmail")).sendKeys("ramya12@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();

		driver.findElement(By.id("userNumber")).sendKeys("9911223344");

		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();

		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")))
				.selectByVisibleText("february");
		Thread.sleep(2000);

		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")))
				.selectByVisibleText("2024");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, February 21st, 2024']")).click();

		driver.findElement(By.id("subjectsContainer")).sendKeys("physics");

		driver.findElement(By.id("subjectsContainer")).sendKeys("KEYS.ENTER");

		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("c:\\Users\\sh\\OneDrive\\Pictures\\pexels-pixabay-60597 (1).jpg");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("delhi");

		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.TAB);

		driver.switchTo().activeElement().sendKeys("utterpradesh");

		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		driver.switchTo().activeElement().sendKeys("agra");

		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}

	@BeforeTest
	public void openurl() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");
	
		 
	}
	@AfterTest
	public void afterTest() {

	}

}
