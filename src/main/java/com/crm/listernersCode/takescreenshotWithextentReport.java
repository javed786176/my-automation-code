package com.crm.listernersCode;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import screenshot.baseclassscreen;

public class takescreenshotWithextentReport extends baseclassscreen implements ITestListener {
			  public ExtentReports report;
		  public ExtentSparkReporter spark;
		  public ExtentTest test;
			@Override
			public void onTestStart(ITestResult result) {
				String name=result.getMethod().getMethodName();
				test=report.createTest(name);
				test.log(Status.INFO, "welcome to our class");
				test.log(Status.INFO, "my wonderful fellow");

				System.out.println("onTEstStart");
			}

			@Override
			public void onTestSuccess(ITestResult result) {
				
				test.log(Status.PASS, "your testcases pass");

			System.out.println("on test success");
			}

			@Override
			public void onTestFailure(ITestResult result) {
				test.log(Status.FAIL, "your testcase has failed");
				TakesScreenshot ts=(TakesScreenshot)d;
              String from=ts.getScreenshotAs(OutputType.BASE64);
              test.addScreenCaptureFromBase64String(from);
				System.out.println("on test failure");
			}
			@Override
			public void onTestSkipped(ITestResult result) {
				System.out.println("on test skipped");
				test.log(Status.SKIP,"your testcase has been skipped");
				
			}

			@Override
			public void onStart(ITestContext context) {
				File path =new File("./capture.html");
				spark =new ExtentSparkReporter(path);
				spark.config().setDocumentTitle("muje pata hai");
				spark.config().setReportName("javed");
				spark.config().setTheme(Theme.STANDARD);
				report=new ExtentReports();
				report.setSystemInfo("mac-os", "mackbook air");
				report.setSystemInfo("Browser", "Chrome");
				report.attachReporter(spark);
			}

			@Override
			public void onFinish(ITestContext context) {
				report.flush();
			}

}
