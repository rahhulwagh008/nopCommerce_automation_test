package ecommercePageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerceBaseClass.BaseClass;

public class AddtoCart extends BaseClass {
	
	public AddtoCart ()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),\"Computers\")]")
	WebElement com;
	
	@FindBy(xpath="//a[contains(text(),\"Notebooks\")]")
	WebElement note;
	
	@FindBy(xpath="	//a[contains(text(),\"Apple MacBook Pro 13-inch\")]")
	WebElement apple;
	
	@FindBy(xpath="//button[contains(text(),\"Add to cart\")]")
	WebElement addtocart;
	
	@FindBy(xpath="//p[contains(text(),\"The product has been added to your\")]")
	WebElement msg;
	
	public void Notebok()
	{
		note.click();
	}
	
	public void Apple()
	{
		apple.click();
	}
	
	public void Add()
	{
		addtocart.click();
	}
	
	public void Msg()
	{
		msg.isDisplayed();
	}
}

