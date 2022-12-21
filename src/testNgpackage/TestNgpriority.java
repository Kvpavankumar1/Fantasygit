package testNgpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNgpriority {
	
	static WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  driver.close();
	  
  }

  @Test(priority=0,enabled=false)
  public void google() throws InterruptedException {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
  }
	/*  @Test(priority=3,enabled=false)
	  public void facebook() throws InterruptedException {
		  driver.get("https://www.fb.com");
		  Thread.sleep(3000);
  }
	  @Test(priority=1,enabled=false)
	  public void yahoo() throws InterruptedException {
		  driver.get("https://www.yahoo.com");
		  Thread.sleep(3000);
  }
	  @Test(dependsOnMethods="google",priority=1,description="browsing")
	  public void gmail() throws InterruptedException {
		  driver.findElement(By.name("q")).sendKeys("tirupati");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  Thread.sleep(3000);*/
  @Test
  public void fb() throws InterruptedException {
	  driver.get("https://www.fb.com");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("pavankumar");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys("pavankumar");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys(Keys.ENTER);
 
  }
}