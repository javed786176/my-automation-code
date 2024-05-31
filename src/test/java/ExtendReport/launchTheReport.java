package ExtendReport;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class launchTheReport {
	@Test
	public void launchTheReport()
	{
	ExtentReports report=new ExtentReports();
	File path=new File("./ExtentReport/sample.html");
	ExtentSparkReporter spark=new ExtentSparkReporter(path);
	spark.config().setDocumentTitle("M3&A5 batch");
	spark.config().setReportName("javed");
	spark.config().setTheme(Theme.STANDARD);
	report.attachReporter(spark);
	//create the test case
	ExtentTest test1=report.createTest("test1");
	test1.log(Status.FAIL, "log in function error ");
	report.flush();
	
	
	
	
	}	

}
