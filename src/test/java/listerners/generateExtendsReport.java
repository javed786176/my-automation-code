package listerners;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class generateExtendsReport implements ITestListener{
  public ExtentReports report;
  public ExtentSparkReporter spark;
  public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		report.createTest(name);
		System.out.println("onTEstStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("on test success");
	String name=result.getMethod().getMethodName();
	 test = report.createTest(name);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();

		System.out.println("on test failure");
		test.log(Status.PASS,name+" "+"is passed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		System.out.println("on test skipped");
		test.log(Status.FAIL,name+" "+"is skipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		File path =new File("./externalReport/testRun.html");
		spark =new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("demoWebShop");
		spark.config().setReportName("javed");
		spark.config().setTheme(Theme.STANDARD);
		report=new ExtentReports();
		report.setSystemInfo("mac-os", "mackbook air");
		report.setSystemInfo("safari", "safari");
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("");
		report.flush();
	}

}
