package TestCasefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Webpage.InfoPage;



public class TC001_Submit extends BaseClass{
//To check if form is submitted successfully
		@Test
	public void submitForm1()
		{
			invokeURL();
			InfoPage ip=new InfoPage(driver);
			ip.ContactBtn();
			ip.FirstName("FGH");
			ip.LastName("wwe");
			ip.Email("jhg@gmail.com");
			ip.Message("Hi");
			ip.SubmitBtn();
				
			String message = "The form has been submitted successfully!";
			if(driver.getPageSource().contains(message))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);	
				}
			}
		
		
	}


