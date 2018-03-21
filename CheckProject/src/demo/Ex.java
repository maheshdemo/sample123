
package demo;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex{
	
	@Test
	public void check() 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com/");		
	}

}
