package kalyan;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FullpageScreenshot {
	WebDriver driver ;
	
  @Test
  public void f() throws InterruptedException, IOException {
	  driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File("D:\\Screenshot\\FullPageScreenshot.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();

  }
  
}
