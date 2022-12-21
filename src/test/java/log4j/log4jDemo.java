package log4j;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class log4jDemo{
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  Logger log = Logger.getLogger("GoogleSearch");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Launch the chrome browser");
		driver.manage().window().maximize();
		log.info("Browser window maximized");
		driver.get("https://www.google.com");
		log.info("Enter the Google URL");
		driver.findElement(By.name("q")).sendKeys("Apache Log4j");
		log.info("Apache Log4j enter in Google Search");
		Thread.sleep(3000);
		log.info("Wait for 3 Seconds");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter keyword pressed in google search");
		driver.quit();
		log.info("Browser closed");
  }
}
