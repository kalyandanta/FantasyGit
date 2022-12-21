package kalyan;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Newtabfunctionality {
	WebDriver driver;
  @Test
  public void newTab() throws InterruptedException {
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[4]/a")).click();
	  Thread.sleep(3000);
	  
	  ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(1));
		
	  driver.findElement(By.xpath("/html/body/app-root/app-header/header/nav[1]/div/div[2]/div[2]/ul/li[2]/a")).click();
	  
	/*  ArrayList<String> newtabOne = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtabOne.get(0));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[3]/span")).click();*/
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
  }
}
