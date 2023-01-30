package ecommerceTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import ecommercePageClass.LoginPage;

public class TC_Login extends LoginPage
{
	@Test
	public void TC3() throws IOException
	{
		LoginPage lpd=new LoginPage();
		
		lpd.Email("rahulwagh123@gmail.com");
		
		lpd.Password("QWERTY456");
		
		lpd.Login();
		
		String ActualResult = driver.getTitle();
		
		String ExpectedResult = "nopCommerce demo store";

		
		if(ActualResult.equals(ExpectedResult))
		{
			Assert.assertTrue(true);

		}
		
		else
		{
			screenshot("Login");
			Assert.assertTrue(false);
		}
}
}