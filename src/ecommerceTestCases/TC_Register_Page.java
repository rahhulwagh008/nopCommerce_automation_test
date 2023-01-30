package ecommerceTestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import ecommercePageClass.RegisterPageClass;
import graphql.Assert;

public class TC_Register_Page extends RegisterPageClass   {
	
	@Test
	public void TC1() throws IOException 
	{
		
		RegisterPageClass rtc= new RegisterPageClass();
		
		rtc.Reg();
		
		rtc.Gender();
		
		rtc.Firstname("Rahul");
		
		rtc.Lasttname("Wagh");
		
		rtc.Date("14");
		
		rtc.Month("July");
		
		rtc.Year("1997");
		
		rtc.Email("rahulwagh123@gmail.com");
		
		rtc.Company("Unikorn PVT LTD");
		
		rtc.Password("QWERTY456");
		
		rtc.ConfirmPassword("QWERTY456");
		
		rtc.Register();
				

		if(driver.getTitle().equals("nopCommerce demo store. Register"))
		{
			screenshot("RegisterTC001");

			Assert.assertTrue(true);
			
		}
		
		else
		{
			screenshot("RegisterTC001");

			Assert.assertTrue(false);
		}
		
		


		
	}

}
