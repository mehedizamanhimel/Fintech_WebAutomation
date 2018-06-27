package testSuits.Instafin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_loginPage;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Login {
		
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard dashBoard_PageElements = new Page_DashBoard(driver);
	
	public static LoadPropertiesFile_Instafin testdata;
	
	/*@BeforeClass
	public static void setUpPropertiesFile() throws IOException {
		testdata = new LoadPropertiesFile_Instafin();
	}*/
	
	@BeforeTest
	public void beforeTesting() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get(testData.properties.getProperty("baseurl"));
		
	}
		
	@Test
	public void test_User_Login_valid_credentials() {
		
		login_PageElements.inputUserName(testData.properties.getProperty("username"));
		login_PageElements.inputPassword(testData.properties.getProperty("password"));
		login_PageElements.clickOnLoginButton();
		dashBoard_PageElements.verifyLogin();
		login_PageElements.logoutFromApp();
	}
	
	@Test
	public void test_user_Login_invalid_credentials() {
		login_PageElements.inputUserName(testData.properties.getProperty("username"));
		login_PageElements.inputPassword(testData.properties.getProperty("wrongPassword"));
		login_PageElements.clickOnLoginButton();
		login_PageElements.verifyLoginFailed();
		login_PageElements.clearLoginField();
	}
	
	
	/*@Test
	public void test_User_Login_With_Blank_credentials() {
		login_PageElements.clickOnLoginButton();
		login_PageElements.inputUserName("mehedi");
		login_PageElements.inputPassword("Mehedi007");
		login_PageElements.clickOnLoginButton();
		dashBoard_PageElements.verifyLogin();
		login_PageElements.logoutFromApp();
	}*/
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	
	
}
