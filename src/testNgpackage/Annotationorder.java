package testNgpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Annotationorder {
	
	static WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

  @Test
  public void google() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
  }
	  @Test
	  public void facebook() throws InterruptedException {
		  driver.get("https://www.fb.com");
		  Thread.sleep(3000);
  }
	  @Test
	  public void yahoo() throws InterruptedException {
		  driver.get("https://www.yahoo.com");
		  Thread.sleep(3000);
  }
	  @Test
	  public void gmail() throws InterruptedException {
		  driver.get("https://www.gmail.com");
		  Thread.sleep(3000);
  }
}