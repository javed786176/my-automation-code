package screenshot;

import org.testng.annotations.Test;

import com.crm.pomFile.login;

public class screenshotfailed extends baseclassscreen{
	@Test
	public void dwsLogCorrect() throws InterruptedException
	{
		  d.navigate().to("https://demowebshop.tricentis.com/login");
		  dwsLogInPage  dws=new dwsLogInPage(d);
		  Thread.sleep(2000);
		  dws.username("admin01@gmail.com");
		  dws.password("admin01");
		  dws.login_button();
		 

	}

}
