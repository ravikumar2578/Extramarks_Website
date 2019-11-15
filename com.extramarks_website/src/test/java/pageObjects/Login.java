package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login {
	private static WebDriver driver;

	@Test(priority = 1)
	public void login() throws InterruptedException {
		// String popUpHandle = driver.getWindowHandle();
		// driver.switchTo().window(popUpHandle);
		String strUserName = "8527124689";
		String Password = "123456";
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://developer1.extramarks.com/");
		Thread.sleep(1000);
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.hsingnin.click();
		Thread.sleep(1000);
		LoginPage.username.sendKeys(String.valueOf(strUserName));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.password.sendKeys(String.valueOf(Password));
		LoginPage.signin.click();
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			alert.accept();
		} catch (NoAlertPresentException ex) {
			System.out.println("Alert not found");
			Reporter.log("Alert not found");
		}

	}

	@Test(priority = 2)
	public void logOut() throws InterruptedException {
		Thread.sleep(2000);

		LoginPage.logOutLink.click();
		Thread.sleep(1000);
		LoginPage.logOutBtn.click();
	}

}
