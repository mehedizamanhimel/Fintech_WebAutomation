package pages.Instafin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Page_loginPage {

	//declaring the driver
	WebDriver driver;
	
	//webElements for loginPage
	By userName = By.id("us1");
	By passWord = By.id("pw1");
	By buttonLogin = By.cssSelector("button[type='submit']");
	By loginFailedNotification = By.cssSelector("li");
	By logoutmodal = By.cssSelector("a[class='btn dropdown-toggle']");
	By logoutButton = By.cssSelector("a[href='/user/logout']");
	
	
	public Page_loginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	//methods for login with login elements
	public void inputUserName(String uid) {
		driver.findElement(userName).sendKeys(uid);
	}
	
	public void inputPassword(String pass) {
		driver.findElement(passWord).sendKeys(pass);
	}

	public void clickOnLoginButton() {
		driver.findElement(buttonLogin).click();
	}

	public void verifyLoginFailed() {
		String errorText = driver.findElement(loginFailedNotification).getText();
		Assert.assertEquals(errorText, "Wrong username or password");
		System.out.println(errorText);
	}
	
	//Clearning the username and password field
	public void clearLoginField() {
		driver.findElement(userName).clear();		
		driver.findElement(passWord).clear();
	}

	//logout from application
	public void logoutFromApp() {
		driver.findElement(logoutmodal).click();
		driver.findElement(logoutButton).click();		
	}


}
