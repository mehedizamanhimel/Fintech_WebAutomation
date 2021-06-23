package Instafin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_loginPage;
import pages.Instafin.Accounts.Page_Accounts_All_Accounts;
import pages.Instafin.Accounts.Page_Accounts_Loan_Accounts;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Accounts {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://meheditest.instafin.info/user/login";
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePage_Elements = new Page_DashBoard(driver);
	Page_Accounts_All_Accounts accounts_All_Accounts = new Page_Accounts_All_Accounts(driver);
	Page_Accounts_Loan_Accounts accounts_LoanAccounts = new Page_Accounts_Loan_Accounts(driver);

	
	
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
	public void Verify_Elements_is_displayed() throws InterruptedException {
		accounts_All_Accounts.Open_Accounts_Main_Section();
		Thread.sleep(1000);
		accounts_All_Accounts.Open_All_Accounts_SubSection();
		Thread.sleep(1000);
		accounts_All_Accounts.VerifyElementsAreAvailable();
		Thread.sleep(1000);
	}
	
	
	@Test(priority=0)
	public void Filter_All_Accounts() throws InterruptedException {
		accounts_All_Accounts.Open_Accounts_Main_Section();
		Thread.sleep(1000);
		accounts_All_Accounts.Open_All_Accounts_SubSection();
		Thread.sleep(1000);
		accounts_All_Accounts.Select_Branch();
		accounts_All_Accounts.Select_CreditOfficer();
		accounts_All_Accounts.Select_Centre();
		//Thread.sleep(1000);
		accounts_All_Accounts.Select_AccountType();
		accounts_All_Accounts.Select_AccountStatus();
		accounts_All_Accounts.Select_Product();
		//Thread.sleep(1000);
		accounts_All_Accounts.SubmitFilter();
		accounts_All_Accounts.Verify_FilterSubmission();
		//Thread.sleep(1000);
	}
	
	@Test(priority=1)
	public void Edit_Accounts() throws InterruptedException {
		accounts_All_Accounts.Open_Accounts_Main_Section();
		Thread.sleep(1000);
		accounts_All_Accounts.Open_All_Accounts_SubSection();
		Thread.sleep(1000);
		accounts_All_Accounts.Select_Branch();
		accounts_All_Accounts.SubmitFilter();
		Thread.sleep(1000);
		accounts_All_Accounts.open_EditSection();
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(2000);
		login_PageElements.logoutFromApp();
		Thread.sleep(2000);
		driver.close();
	}
}
