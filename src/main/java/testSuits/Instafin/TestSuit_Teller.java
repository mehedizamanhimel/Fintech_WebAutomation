package testSuits.Instafin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_Teller_TellerAccounts;
import pages.Instafin.Page_Teller_TransactionReports;
import pages.Instafin.Page_loginPage;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Teller {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	//String baseurl = "https://meheditest.instafin.info/user/login";
	
	
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePage_Elements = new Page_DashBoard(driver);
	Page_Teller_TellerAccounts tellerAccount_Page = new Page_Teller_TellerAccounts(driver);
	Page_Teller_TransactionReports tellerTransactionReport_Page = new Page_Teller_TransactionReports(driver);
	
	
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
