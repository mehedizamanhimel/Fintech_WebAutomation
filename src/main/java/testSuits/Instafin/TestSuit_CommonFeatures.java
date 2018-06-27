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
import pages.Instafin.Page_For_CommonFeatures_Optional;

public class TestSuit_CommonFeatures {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://meheditest.instafin.info/user/login";
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePage_Elements = new Page_DashBoard(driver);
	Page_For_CommonFeatures_Optional common_PageElements = new Page_For_CommonFeatures_Optional(driver);
	
	@BeforeTest
	public void beforeTesting() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testData = new LoadPropertiesFile_Instafin();
		driver.manage().window().maximize();
		driver.get(testData.properties.getProperty("baseurl"));
		login_PageElements.inputUserName(testData.properties.getProperty("username"));
		login_PageElements.inputPassword(testData.properties.getProperty("password"));
		login_PageElements.clickOnLoginButton();
		homePage_Elements.verifyLogin();
	}
	
	//Area to write automated test cases using TestNG framework
	@Test
	public void verify_Elements_displayed() {
		
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		login_PageElements.logoutFromApp();
		driver.close();
	}

}
