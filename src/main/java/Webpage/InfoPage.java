package Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoPage {
	
	WebDriver ldriver;
	
	public InfoPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Contact']")
	WebElement contactBtn;
	public void ContactBtn()
	{
		contactBtn.click();
	}
	
	@FindBy(xpath="//input[@name='fcb44c85']")
	WebElement firstName;
	public void FirstName(String fName)
	{
		firstName.sendKeys(fName);
	}
	
	@FindBy(xpath="//input[@name='0112ce16']")
	WebElement lastName;
	public void LastName(String lName)
	{
		lastName.sendKeys(lName);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	public void Email(String eemail)
	{
		email.sendKeys(eemail);
	}
	
	@FindBy(xpath="//textarea[@name='fd8a921a']")
	WebElement message;
	public void Message(String msg)
	{
		message.sendKeys(msg);
	}
	
	@FindBy(xpath="//div[text()='Submit']")
	WebElement submitBtn;
	public void SubmitBtn()
	{
		submitBtn.click();
	}
	
	
	
	
	
	
	
}
