package testNgpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsEnabled {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.redmine.org/login");
	 Boolean login = driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
	  
	 if(login==true)
	 {
		 System.out.println("Login field is enable to enter the username");
	 }
	 else
	 {
		 System.out.println("Login field is not enable to enter the username");
	 }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
