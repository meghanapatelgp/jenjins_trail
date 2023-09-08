package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Login_Page;
//import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelDataSupllier;

public class BasicTest5 {

	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupllier.class)
	public void TestLogin(String Username, String Password,String  Status) throws Exception {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	
		// Login to the application
			Login_Page loginpage=new Login_Page(driver);
			 loginpage. clicklogin();
			 loginpage.enterEmail(Username);
			 loginpage.enterPassword(Password);
			 loginpage.clickloginbtn();
			Thread.sleep(5000);
				driver.quit();
			 
		 
		}

	}
	
