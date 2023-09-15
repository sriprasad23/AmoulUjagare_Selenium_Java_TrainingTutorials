package Listeners_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class MyListeners implements ITestListener
{
	ExtentReports	extent;
	@Override
	public void onFinish(ITestContext context) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	/*
	 * @Override public void onTestFailedButWithinSuccessPercentage(ITestResult
	 * result) { // TODO Auto-generated method stub
	 * ITestListener.super.onTestFailedButWithinSuccessPercentage(result); }
	 *
	 * @Override public void onTestFailedWithTimeout(ITestResult result) { // TODO
	 * Auto-generated method stub
	 * ITestListener.super.onTestFailedWithTimeout(result); }
	 */
	@Override
	public void onTestFailure(ITestResult result) {

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestStart(ITestResult result) {
//		ExtentReports	extent = getExtentObject();

	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

}
