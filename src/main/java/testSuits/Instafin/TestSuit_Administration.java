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
import pages.Instafin.Administration.Page_Administration_Users_Users;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Administration {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://meheditest.instafin.info/user/login";
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePageElements = new Page_DashBoard(driver);
	Page_Administration_Users_Users administration_PageElements = new Page_Administration_Users_Users(driver);
	
	
	@BeforeTest
	public void beforeTesting() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testData = new LoadPropertiesFile_Instafin();
		driver.manage().window().maximize();
		driver.get(testData.properties.getProperty("baseurl"));
		login_PageElements.inputUserName(testData.properties.getProperty("username"));
		login_PageElements.inputPassword(testData.properties.getProperty("password"));
		login_PageElements.clickOnLoginButton();
		homePageElements.verifyLogin();
	}
	
	//Area to write automated test cases using TestNG framework
	@Test
	public void verify_elements_visibility() {
		
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		login_PageElements.logoutFromApp();
		driver.close();
	}

}
