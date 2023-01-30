package ecommerceTestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ecommercePageClass.LoginPage;
import graphql.Assert;
import utilities.ParaUtils;

public class TC_LoginwithParameters extends LoginPage {

	
	@Test(dataProvider = "LoginData")
	public void LoginData(String user, String pass, String exp)
	{
		LoginPage lpd=new LoginPage();
		
		lpd.Email(user);
		
		lpd.Password(pass);
		
		lpd.Login();
		
		String ActualResult = driver.getTitle();
		
		String ExpectedResult = "nopCommerce demo store";
		
		if(exp.equals("valid"))
		{
			if(ActualResult.equals(ExpectedResult))
			{
				Assert.assertTrue(true);
			}
			
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		else if(exp.equals("invalid"))
		{
			if(ActualResult.equals(ExpectedResult))
			{
				Assert.assertTrue(false);
			}
			
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	
	@DataProvider(name = "LoginData")
	public String[][] getdata() throws IOException, InvalidFormatException {
		
		String path="C:\\Users\\Rahul.DESKTOP-V45M5B9\\eclipse-workspace\\Nop_Commerce\\src\\ecommerceTestData\\nopCommerce_parameterization.xlsx";
		
		int ROW = ParaUtils.getLrow(path,"LOGIN");
		
		int CELL = ParaUtils.getLcell(path,"LOGIN",1);
		
		String data [] [] = new String [ROW] [CELL];
		
		for(int i=1;i<=ROW;i++)
		{
			for(int j=0;j<CELL;j++)
			{
				data[i-1] [j] = ParaUtils.getcelldata(path,"LOGIN",i, j);
			}
		}
		return data;
		
		
		
		
	}
	
	
	
}
