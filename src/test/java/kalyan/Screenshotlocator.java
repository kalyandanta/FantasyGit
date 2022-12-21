package kalyan;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Screenshotlocator {
	WebDriver driver;
	
  @Test
  public void f() throws IOException, InterruptedException {
	  driver.get("http://seleniumlearn.com/");
		Thread.sleep(5000);
		WebElement screen = driver.findElement(By.xpath("//*[@id=\"edit-submit\"]"));
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	  FileUtils.copyFile(f, new File("D:\\screenshot\\screenshotlocator.png"));  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
