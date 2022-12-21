package testNgpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNGIsdisplayed {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
  }
}
	/*  @Test
	  public void f() {
		  driver.get("https://www.redmine.org/login");
		  Boolean logo = driver.findElement(By.xpath("//*[@id=\"header\"]/h1")).isDisplayed();
		  if(logo==true)
		  {
	  System.out.printIn("Logo is displayed in Header Bar");	  
		  }
	  else
	  {
System.out.printIn("Logo is not displayes in Header Bar");
    }
  }*/
