package testNgpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsSelected {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @Test
  public void Isselected() {
	  driver.get("https://www.redmine.org/login");
	  driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
	  Boolean checkbox = driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
	  
		  if(checkbox==true)
		  {
			  System.out.println("stay logged in checkbox selected");
		  }
		  else
			  System.out.println("stay logged in checkbox not selected");
		  driver.close();
	  }
  }

