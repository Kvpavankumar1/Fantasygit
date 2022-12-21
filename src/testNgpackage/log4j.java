package testNgpackage;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class log4j {
	WebDriver driver;
	
  @Test
  public void tutorial() {
	 Logger log = Logger.getLogger("");
	  PropertyConfigurator.configure("log4j.properties");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  log.info("launch the chrome browser");
	  driver.manage().window().maximize();
	  log.info("Browser window maximize");
	  driver.get("https://www.google.com");
	  log.info("enter the google url");
  }
}
