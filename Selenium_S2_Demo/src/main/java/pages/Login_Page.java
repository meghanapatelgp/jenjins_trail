package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(linkText="Log in")
	private WebElement login;

	@FindBy(id="Email")
	private WebElement emailtextbox;

	@FindBy(id="Password")
	private WebElement passwordtextbox;

	@FindBy(xpath= "//input[contains(@class,'button-1 login-button')]")
	private WebElement loginbtn;

	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		actions=new Actions(driver);
	
	}

	public void clicklogin() {
		login.click();
	}
	
	public void enterEmail(String Username) {
		//emailtextbox.clear();
		emailtextbox.sendKeys(Username);
	}

	public void enterPassword(String Password) {
		//emailtextbox.clear();
		passwordtextbox.sendKeys(Password);
	}
	
	public void clickloginbtn() {
		loginbtn.click();
	}


}
