package kalyan;

import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ScreenshotTime {
	WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  driver.get("https://google.com");
		Thread.sleep(2000);
		takeScreenshot();
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		Thread.sleep(1000);
		takeScreenshot();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
        takeScreenshot();
  }

	public void takeScreenshot() throws Exception {    
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);
	
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D:\\screenshot\\screenshot"+time+".png"));
	}
  

	  @Test
	  public void google() throws Exception {
		  
	
	  }
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
