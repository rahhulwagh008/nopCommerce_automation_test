package ecommercePageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerceBaseClass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="Email")
	public WebElement mail;
	
	@FindBy(id="Password")
	public WebElement pass;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	public WebElement submit;
	
	
	public void Email(String email)
	{
		mail.sendKeys(email);
	}
	
	public void Password(String pword)
	{
		pass.sendKeys(pword);
	}
	
	public void Login()
	{
		submit.click();
	}
	
	


}
