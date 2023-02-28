package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeTest
	void beforeTest() {
		System.out.println("__ This will execute before test __");
	}

	@AfterTest
	void afterTest() {
		System.out.println("__ This will execute after test __");
	}

	@BeforeClass
	void beforeClass() {
		System.out.println("-- This will execute before class --");
	}

	@AfterClass
	void afterClass() {
		System.out.println("-- This will execute after class --");
	}

	@BeforeMethod
	void beforeMethod() {
		System.out.println("@ This will execute before every Method @");
	}

	@AfterMethod
	void afterMethod() {
		System.out.println("@ This will execute after every test Method @");

	}

	@Test()
	void test1() {
		System.out.println("This is test case 1");
	}

	@Test()
	void test2() {
		System.out.println("This is test case 2");
	}

}
