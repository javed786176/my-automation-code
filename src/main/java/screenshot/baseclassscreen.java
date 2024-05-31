package screenshot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class baseclassscreen {
	public static	WebDriver d;
	

	
	@BeforeClass
	
	public void Log() throws InterruptedException, IOException
	{
				 d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		   Thread.sleep(2000);
	}
	@BeforeMethod
	public void beforemethod() throws IOException
	{
		System.out.println("welcome to page");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("thanks for coming");	
		}
	@AfterClass
	public void afterclass()
	{
		d.quit();
	}
	


}
