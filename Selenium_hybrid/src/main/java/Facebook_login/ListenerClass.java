package Facebook_login;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc exc started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("tc successfully exe");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc exec failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc skipped");
	}
}