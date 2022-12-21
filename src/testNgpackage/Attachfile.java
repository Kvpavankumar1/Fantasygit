package testNgpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Attachfile {
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();   
	  }
  @Test
  public void Attachfile() throws InterruptedException {
	  driver.get("https.//https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AeAAQh7R4d3IaurE1HZUyZFsuAWPxbLAU-r2MUNqzSE3RJ1LzKFZmBQNBOolyMNQ2jZo-qX0Amoqwg&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("kvpavankumar1921@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("lokipavan");
	  driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
	  driver.get("https://mail.google.com/mail/u/0/#inbox?compose=new");
	  driver.findElement(By.xpath("//*[@id=\":n2\"]")).sendKeys("Hello");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\":s8\"]")).sendKeys("C:\\Users\\Pavan kumar\\Downloads\\Test Analyst JD.docx");
	  
  }
  

}
