package testSuits.Instafin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_OfflineTransactions;
import pages.Instafin.Page_loginPage;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Offline_Transactions {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	//String baseurl = "https://meheditest.instafin.info/user/login";
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePage_Elements = new Page_DashBoard(driver);
	Page_OfflineTransactions offline_Transaction_PageElements = new Page_OfflineTransactions(driver);

	
	@BeforeTest
	public void beforeTesting() throws IOException {
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
	public void verify_Elements_displayed() throws InterruptedException {
		offline_Transaction_PageElements.open_Main_Button();
		offline_Transaction_PageElements.select_Level_Type();
		Thread.sleep(1000);
		offline_Transaction_PageElements.select_Level();
		Thread.sleep(1000);
		offline_Transaction_PageElements.select_date();
		Thread.sleep(1000);
		offline_Transaction_PageElements.submit_Filter();
		Thread.sleep(1000);
		offline_Transaction_PageElements.verify_filter_is_working();
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
}
