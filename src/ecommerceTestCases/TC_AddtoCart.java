package ecommerceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ecommerceBaseClass.BaseClass;
import ecommercePageClass.AddtoCart;
import ecommercePageClass.LoginPage;

public class TC_AddtoCart extends BaseClass {
	
	@Test
	public void TC() throws InterruptedException
	{
		LoginPage lpd=new LoginPage();
		
		lpd.Email("rahulwagh123@gmail.com");
		
		lpd.Password("QWERTY456");
		
		Thread.sleep(3000);
		
		lpd.Login();
		Thread.sleep(3000);

		
		AddtoCart ADD= new AddtoCart(); 
		
		
		Actions act= new Actions(driver);
		
		
		WebElement comp = driver.findElement(By.xpath("//a[contains(text(),\"Computers\")]"));
		Thread.sleep(3000);

		
		act.moveToElement(comp).perform();
		Thread.sleep(3000);

		
		ADD.Notebok();
		Thread.sleep(3000);
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		
//		WebElement app= driver.findElement(By.xpath("//a[contains(text(),\"Apple MacBook Pro 13-inch\")]"));
//		
//		js.executeScript("arguments[0].scrollIntoView();",app);
//		
		ADD.Apple();
		
		ADD.Add();
		Thread.sleep(3000);

		ADD.Msg();
		Thread.sleep(3000); 

		
		
		
		
		
		
		

	}

}
