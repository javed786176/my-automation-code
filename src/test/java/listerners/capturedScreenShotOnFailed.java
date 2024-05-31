package listerners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crs.pom.DwsLogInPage;

import screenshot.baseclassscreen;

@Listeners(listerners.generateExtendsReport.class)
public class capturedScreenShotOnFailed extends baseclassscreen {
	@Test
	public void dwsLoginCorrect() throws InterruptedException {
		d.get("http://demowebshop.tricentis.com/");
		d.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLogInPage dws= new DwsLogInPage(d);
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login_button();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@Test
	public void dwsLoginWrong() throws InterruptedException {
		d.get("http://demowebshop.tricentis.com/");
		d.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLogInPage dws= new DwsLogInPage(d);
		dws.username("admin01@gmail.com");
		dws.password("admin");
		dws.login_button();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void redBus() {
		d.get("https://www.redbus.in/");
		AssertJUnit.assertEquals("javed", "java");
	}

}
