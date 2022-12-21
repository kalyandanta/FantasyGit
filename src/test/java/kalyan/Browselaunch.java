package kalyan;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Browselaunch {
	 static WebDriver driver;
  
  
  @Test
  public void gangaram() throws InterruptedException {
	  driver.get("https://www.google.co.in/");
	  Thread.sleep(1000);
	  driver.findElement(By.name("q")).sendKeys("Tirupati"+Keys.ENTER);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
