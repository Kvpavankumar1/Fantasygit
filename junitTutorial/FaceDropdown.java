package junitTutorial;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FaceDropdown {

	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pavankumar1");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
	}

}
