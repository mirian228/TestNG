package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("||| This will be executed before suite |||");
	}

	@AfterSuite
	void afterSuite() {
		System.out.println("||| This will be executed after suite |||");
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
	void test3() {
		System.out.println("This is test case 3");
	}

	@Test()
	void test4() {
		System.out.println("This is test case 4");
	}

}
