package testSuits.Instafin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_loginPage;
import pages.Instafin.Reports.Page_Reports_AccountActionLog;
import pages.Instafin.Reports.Page_Reports_AllTransactions;
import pages.Instafin.Reports.Page_Reports_DynamicReports;
import pages.Instafin.Reports.Page_Reports_StandardReports;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Reports {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	
	//declaring related pages of this test suit
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePage_Elements = new Page_DashBoard(driver);
	Page_Reports_AllTransactions allTransactions_PageElements = new Page_Reports_AllTransactions(driver);
	Page_Reports_AccountActionLog accountActionLog_PageElements = new Page_Reports_AccountActionLog(driver);
	Page_Reports_DynamicReports dynamicReports_PageElements = new Page_Reports_DynamicReports(driver);
	Page_Reports_StandardReports standardReports_PageElements = new Page_Reports_StandardReports(driver);
	
	
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
	public void verify_Elements_displayed() {
		
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		login_PageElements.logoutFromApp();
		driver.close();
	}
}
