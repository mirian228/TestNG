package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GoogleSampleTest {

	WebDriver driver;

	@Test()
	void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
				.sendKeys("google");

		Thread.sleep(10000);
	}

	@AfterMethod
	void teardown() {
		driver.quit();
	}
}
