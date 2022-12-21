package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertBoxokbutton {
	WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan kumar\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @Test(enabled=false)
  public void alertokbutton() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button"));
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  driver.switchTo().alert().accept();
  }
	  @Test(enabled=false)
	  public void confirmationDIalogbox() throws InterruptedException {
	driver.get("http://seleniumlearn.com/confirmation-dialog-box");	 
	driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button"));
	driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	driver.switchTo().alert().dismiss();
	  }
	  @Test
	  public void  promptbox() throws InterruptedException {
		  driver.get("http://seleniumlearn.com/prompt-dialog-box");	 
		  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		//  driver.switchTo().alert().sendKeys("Pavan");
		  //driver.switchTo().alert().accept();
		Alert alt = driver.switchTo().alert();  
		alt.sendKeys("pavan");
		alt.accept();
  }
}

