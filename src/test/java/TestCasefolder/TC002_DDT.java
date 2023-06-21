package TestCasefolder;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ExcelUtils;
import Webpage.InfoPage;


public class TC002_DDT extends BaseClass {
//To check if form is submitted successfully with multiple data	
	
	@Test (dataProvider="getLeadData")
	public void submitForm2(String Fname, String Lname, String email, String msg)
		{
			invokeURL();
			InfoPage ip=new InfoPage(driver);
			ip.ContactBtn();
			ip.FirstName(Fname);
			ip.LastName(Lname);
			ip.Email(email);
			ip.Message(msg);
			ip.SubmitBtn();
			//The form has been submitted successfully!		
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
		
	

	@DataProvider(name="getLeadData")
	public Object[][] getData() throws IOException
	{
		//String path = "C:\\Users\\Rohit\\eclipse-workspace\\CokuProject\\TestData\\coukdata.xlsx";
		String path = System.getProperty("user.dir")+"\\TestData\\coukdata.xlsx";
		int rowcount = ExcelUtils.getRowcount(path, "Sheet1");
		int colcount = ExcelUtils.getColcount(path, "Sheet1", rowcount);
		Object data[][]= new Object [rowcount][colcount];
		for(int i=1; i<=rowcount ; i++)
		{
			for(int j=0; j<colcount ; j++)
			{
				 data [i-1][j]=ExcelUtils.getCellData(path, "Sheet1", i, j); 
			}
		}
		return data;
	}
}
