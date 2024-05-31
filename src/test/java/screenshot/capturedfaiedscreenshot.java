package screenshot;

import java.io.File;
import java.time.LocalDateTime;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class capturedfaiedscreenshot extends baseclassscreen implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result)
	{
	LocalDateTime date=LocalDateTime.now();
	String time=date.toString().replace(":", "-");
			TakesScreenshot sh=(TakesScreenshot)d;
			File from=sh.getScreenshotAs(OutputType.FILE);
			File to=new File(".//screenShot/dws"+time+".png");
			try {
				FileHandler.copy(from, to);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}

}
