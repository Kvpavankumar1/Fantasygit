package testNgpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class scrolldown {
	WebDriver driver;
	
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();  
  }
  @Test(enabled=false)
  public void scrolldown() {
	  driver.get("https://www.selenium.dev");
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(0, 2000)");
  }
  @Test(enabled=false)
  public void scrollup() {
	  driver.get("https://www.selenium.dev");
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(2000, 0)");
  }
  @Test
  public void scrollupselectlocatior() {
	  driver.get("https://www.selenium.dev/documentation/");
WebElement element = (WebElement)driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/div[2]/div[7]/h5/a"));	 
Coordinates coordinate = ((Locatable)element).getCoordinates();
coordinate.onPage();
coordinate.inViewPort();
  }
}
