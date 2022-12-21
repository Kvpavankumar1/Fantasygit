package junitTutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Pavanunit {

	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		//driver.get("https://www.facebook.com/signup");
		/*driver.findElement(By.id("email")).sendKeys("pavankumar1");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("pavan");
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("kumar");
		driver.findElement(By.name("login")).click();*/
		//new Select(driver.findElement(By.xpath("//*[@id=\"month\"]"))).selectByVisibleText("Nov");
		//new Select(driver.findElement(By.id("month"))).selectByVisibleText("Mar");
		//new Select(driver.findElement(By.id("year"))).selectByIndex(11);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("tirupati"+Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	}

}
