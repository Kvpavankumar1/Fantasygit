package junitTutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {

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
      @Disabled
	@Test
	void test1() {
		driver.get("https:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("Pavan");
	}
	   @Ignore
	@Test
	void test2() {
		driver.get("https:\\www.fb.com");
	}
		@Test
	void test3() {
			driver.get("https:\\www.yahoo.com");
	}
}
