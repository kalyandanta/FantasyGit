package kalyan;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Failedscreenshot {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.get("https://www.google.com/");
		try {                
			driver.findElement(By.name("q")).sendKeys("Tirupati");			
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[4]/a")).click();
			
			}
		catch(Exception e) {      
	 		takeScreenshot();       
		}      
	}
	
  
  
	public void takeScreenshot() throws Exception {              
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\screenshot\\failedscreenshot.png"));
	}
  


  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
