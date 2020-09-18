package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Loginpage;
import utilities.Utility;

public class Testwithparameters
{
	
	@Test
	@Parameters({"browsername","url","userid","password"})
	public void method(String bn, String url, String u, String p) throws Exception
	{
		Utility ut=new Utility();
		WebDriver driver;
		driver=ut.openBrowse(bn);
		ut.launchSite(url);
		Loginpage lp=new Loginpage(driver);
		lp.uidFill(u);
		lp.pwdFill(p);
		ut.closeSite();
		
		
	}
	

}
