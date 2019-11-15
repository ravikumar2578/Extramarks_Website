package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{
	


	@FindBy(className = "signin")
	public static WebElement hsingnin;
	
	@FindBy(id = "usernameLogin")
	public static WebElement username;

	@FindBy(id = "passwdLogin")
	public static WebElement password;

	@FindBy(id = "login-account")
	public static WebElement signin;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
	public static WebElement logOutLink;
	
	@FindBy(xpath = "//a[@href='/user/logout']")
	public static WebElement logOutBtn;

	

}
