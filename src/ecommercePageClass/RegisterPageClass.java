package ecommercePageClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerceBaseClass.BaseClass;

	public class RegisterPageClass extends BaseClass {
	
	public RegisterPageClass()
	{
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath="//button[@type=\"button\"]")
	public WebElement register;

	@FindBy (id="gender-male")
	public WebElement gender; 
	
	@FindBy (xpath="//input[@id=\"FirstName\"]")
	public WebElement fname;
	
	@FindBy (xpath="//input[@id=\"LastName\"]")
	public WebElement lastname;
		
	@FindBy (xpath="//select[@name=\"DateOfBirthDay\"]//option")
	public List<WebElement> date;
		
	@FindBy (xpath="//select[@name=\"DateOfBirthMonth\"]//option")
	public List<WebElement> month;

	@FindBy (xpath="//select[@name=\"DateOfBirthYear\"]//option")
	public List<WebElement> year;
	
	@FindBy (xpath="//input[@id=\"Email\"]")
	public WebElement mail;
	
	@FindBy (xpath="//input[@id=\"Company\"]")
	public WebElement company; 
	
	@FindBy (xpath="//input[@id=\"Password\"]")
	public WebElement pass; 
			
	@FindBy (xpath="//input[@id=\"ConfirmPassword\"]")
	public WebElement cpass; 
			
	@FindBy (xpath="//button[@id=\"register-button\"]")
	public WebElement reg; 
	
	public void Reg()
	{
		register.click();
	}
	
					
	public void Gender()
	{
		gender.click();
	}

	public void Firstname(String name)
	{
		fname.sendKeys(name);
	}

	public void Lasttname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void Date(String dd)
	{
		for(int i=0;i<date.size();i++)
		{
			String d=date.get(i).getText();
			if(dd.equals(d))
			{

				date.get(i).click();
				System.out.println("Selected Date is "+ d);

				break;
			}
		}
	}
		
	public void Month(String mm)
		{
		for(int i=0;i<month.size();i++)
			{
				String m=month.get(i).getText();
				if(mm.equals(m))
				{
					month.get(i).click();
					System.out.println("Selected month is "+ m);

					break;

					
				}
			}
			
		}
	
	public void Year(String yy)
	{
		for(int i=0;i<year.size();i++)
		{
			String y=year.get(i).getText();
			if(yy.equals(y))
			{
				
				year.get(i).click();
				System.out.println("Selected year is "+ y);

				

			}
		}
	}
	
	public void Email(String e_mail)
	{
		mail.sendKeys(e_mail);
	}
	
	
	public void Company(String cname)
	{
		company.sendKeys(cname);
	}
	
	public void Password(String Pass)
	{
		pass.sendKeys(Pass);
	}
	
	public void ConfirmPassword(String Pass)
	{
		cpass.sendKeys(Pass);
	}
	
	
	
	public void Register()
	{
		reg.click();
	}
	

	


}