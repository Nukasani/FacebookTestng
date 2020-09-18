package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Loginpage;
import utilities.Utility;

public class Test1withdataprovider 
{
	
		@DataProvider(name="details")
		public Object[][] method1()
		{
			Object[][] oo=new Object[][] 
					{
				          {"opera","9603634253","Harsha@_205"},
				          {"chrome","9603634253","Harsha@_205"},
				          {"firefox","9603634253","Harsha@_205"} 
					};
					return(oo);
			}
			
	@Test(dataProvider="details")
	public void method2(String bn,String u,String p)
	{
		Utility ut=new Utility();
		WebDriver driver;
		driver=ut.openBrowse(bn);
		ut.launchSite("https://www.facebook.com/");
		Loginpage lp=new Loginpage(driver);
		lp.uidFill(u);
		lp.pwdFill(p);
		lp.clickNext();
		ut.closeSite();
		Reporter.log("one test passed");
		
	}


	}


