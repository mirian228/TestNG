package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {
	// This belongs to ITestListener and will execute before starting of Test set
	public void onStart(ITestContext arg) {
		System.out.println("Starts Test execution...." + arg.getName());
	}

	// This belongs to ITestListener and will execute after starting of Test set
	public void onFinish(ITestContext arg) {
		System.out.println("Finish Test execution...." + arg.getName());
	}

	// This belongs to ITestListener and will execute before the main test starts
	public void onTestStart(ITestResult arg0) {
		System.out.println("Starts test ........." + arg0.getName());
	}

	// This belongs to ITestListener and will execute when a test is skipped
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Skipped test....." + arg0.getName());
	}

	// This belongs to ITestListener and will execute when a test is passed
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Passed test........." + arg0.getName());
	}

	// This belongs to ITestListener and will execute when a test is failed
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Failed test......." + arg0.getName());
	}
	
	//Not so important .. ignore this as of now
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		 
	}

}
