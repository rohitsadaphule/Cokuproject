package TestCasefolder;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass implements ITestListener {
	
	public static WebDriver driver;
	public static String URL = "https://thedemosite.co.uk/";
	
	@BeforeClass
	public void chromeDriver()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Documents\\Selenium + JAVA\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	public void invokeURL()
	{
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
 

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		System.out.println("I failed executing");
		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\Rohit\\Documents\\Selenium + JAVA\\srnsht\\screen2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
