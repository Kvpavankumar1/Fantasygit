package testNgpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TestNgTitle {
	
  static WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @Test(enabled = false)
  public void google() {
	  driver.get("https://www.google.com");
	  String exp = "Google";
	  String act = driver.getTitle();
	  Assert.assertEquals(exp, act);  
  }
  @Test(enabled = false)
  public void Redmine() {
	  driver.get("https://www.redmine.org/projects/redmine/boards");
	  String expg = "Forums";
	  String actg = driver.findElement(By.xpath("//*[@id=\"content\"]/h2")).getText();
	  Assert.assertEquals(expg, actg);  
  }
  @Test(enabled = false)
  public void Issues() {
	  driver.get("https://www.redmine.org/projects/redmine/issues");
	  String expg = "Issues";
	  String actg = driver.findElement(By.xpath("//*[@id=\"content\"]/h2")).getText();	   
  Assert.assertEquals(actg, expg);
  }
@Test
  public void URL() {
	  driver.get("https://www.google.com");
	  String expu = "https://www.google.com/";
	  String actu = driver.getCurrentUrl();
	  Assert.assertEquals(actu, expu);
   }
 
}
