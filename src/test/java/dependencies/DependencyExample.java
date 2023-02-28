package dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

	@Test()
	void startCar() {
		System.out.println("Car started");
		Assert.fail(); // fail this test intentionally so we can see dependency logic
	}

	@Test(dependsOnMethods = { "startCar" })
	void driveCar() {
		System.out.println("Car driving");
	}

	@Test(dependsOnMethods = { "driveCar" })
	void stopCar() {
		System.out.println("Car stopped");
	}

	@Test(dependsOnMethods = { "stopCar", "driveCar" }, alwaysRun = true) // We can also have multiple dependency, if alwaysRun is true it will execute even though dependent methods failed
	void parkCar() {
		System.out.println("Car parked");
	}
}
