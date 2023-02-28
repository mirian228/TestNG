package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/* This is mandatory to run classes and threads together as separate threads / If we change parallel= to "method" than methods will run pas separate threads
 // we can run parallel test tests(suites), classes , methods 
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Testing testng" parallel="class" thread-count="2">
	<test name="test1">
		<classes>
			<class name="paralleltesting.ParallelTest1"/>
			<class name="paralleltesting.ParallelTest2"/>
		</classes>
	</test>
</suite>
  
 */

public class ParallelTest1 {
	WebDriver driver;

	@Test()
	void logoTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(5000);
	}

	@Test()
	void homePageTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Drivers\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterMethod
	void teardown() {
		driver.quit();
	}
}
