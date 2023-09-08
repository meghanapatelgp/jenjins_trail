package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login_Page;

public class BuyOrder extends BaseTest{
	WebDriver driver;
	@BeforeTest	
	public void LaunchApplication(){
		
//		1.	Open the browser
		 driver= new ChromeDriver();
		 
//		2.	Maximize it
		driver.manage().window().maximize();
		
//		3.	Navigate to https://www.amazon.in/
		driver.get( "https://demowebshop.tricentis.com");
	}
	
@Test
public void BuyMobile(){
// Login to the application
	Login_Page loginpage=new Login_Page(driver);
	 loginpage. clicklogin();
	 loginpage.enterEmail("megha@gmail.com");
	 loginpage.enterPassword("Megha@123");
	 loginpage.clickloginbtn();
	 
	 
	 
}

@AfterTest
public void CloseBrowser(){
driver.quit();		
}
}