package sikuli;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
  WebDriver driver;
	  Screen s = new Screen();
	  @Test
	  public void desktopAutomation() throws FindFailed, InterruptedException{
		//  s.click("C:\\Users\\Pavan kumar\\Pictures\\win.PNG");
		 // driver.manage().window().minimize();
		  Thread.sleep(5000);
		  s.click("D:\\Sikuli\\Chrome.PNG");
s.dragDrop("D:\\Sikuli\\skype.PNG", "D:\\Sikuli\\daily.PNG");	  
  }
}
