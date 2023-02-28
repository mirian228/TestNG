package testpriority;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=1)
	void TestOne() {
		System.out.println("This is Test1");
	}

	@Test(priority=2)
	void TestTwo() {
		System.out.println("This is Test2");
	}

	@Test(priority=3)
	void TestThree() {
		System.out.println("This is Test3");
	}

	@Test(priority=4, enabled=false) // enabled=false allows us to discard this test and it won't be executed
	void TestFour() {
		System.out.println("This is Test4");
	}

}
