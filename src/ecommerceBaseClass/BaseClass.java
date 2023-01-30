package ecommerceBaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import configuration.ReadConfi;

public class BaseClass {

public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{

		System.setProperty("webdriver.chrome.driver",ReadConfi.Chromepath);
		
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(ReadConfi.baseURL);
		
	}
	
	public void screenshot(String TestcaseID) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		String name= TestcaseID+Timestamp+"jpg";
		
		File dest= new File(ReadConfi.filepath+name);
		
		FileHandler.copy(src, dest);

	
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		driver.quit();
		
	
	}
}
