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
import pages.Instafin.Accounting.Page_Accounting_BalanceSheet;
import pages.Instafin.Accounting.Page_Accounting_ChartOfAccounts;
import pages.Instafin.Accounting.Page_Accounting_GL_Balance_Report;
import pages.Instafin.Accounting.Page_Accounting_GL_Report;
import pages.Instafin.Accounting.Page_Accounting_Income_Expense;
import pages.Instafin.Accounting.Page_Accounting_Journal_Entries;
import pages.Instafin.Accounting.Page_Accounting_TrialBalanceSheet;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Accounting {
	
	static LoadPropertiesFile_Instafin testData;
	
	//Selecting driver for chrome
	WebDriver driver = new ChromeDriver();
	// Selecting mainurl
	//String baseurl = "https://meheditest.instafin.info/user/login";
	
	
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard dashBoard_PageElements = new Page_DashBoard(driver);
	//incorporating accounting classes from page
	Page_Accounting_ChartOfAccounts accounting_ChartofAccounts_PageElements = new Page_Accounting_ChartOfAccounts(driver);
	Page_Accounting_BalanceSheet accounting_balanceSheet_pageElements = new Page_Accounting_BalanceSheet(driver);
	Page_Accounting_GL_Balance_Report accounting_GL_Balance_Report_pageElements = new Page_Accounting_GL_Balance_Report(driver);
	Page_Accounting_GL_Report accounting_GL_Report_pageElements = new Page_Accounting_GL_Report(driver);
	Page_Accounting_Income_Expense accounting_IncomeExpense_pageElements = new Page_Accounting_Income_Expense(driver);
	Page_Accounting_Journal_Entries accounting_JournalEntries_pageElements = new Page_Accounting_Journal_Entries(driver);
	Page_Accounting_TrialBalanceSheet accounting_TrialBalanceSheet_pageElements = new Page_Accounting_TrialBalanceSheet(driver);
	
	
	@BeforeTest
	public void beforeTesting() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testData = new LoadPropertiesFile_Instafin();
		driver.manage().window().maximize();	
		driver.get(testData.properties.getProperty("baseurl"));
		login_PageElements.inputUserName(testData.properties.getProperty("username"));
		login_PageElements.inputPassword(testData.properties.getProperty("password"));
		login_PageElements.clickOnLoginButton();
		dashBoard_PageElements.verifyLogin();
	}
	
	//Area to write automated test cases using TestNG framework
	@Test
	public void Verify_availability_of_elements() {
		
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		login_PageElements.logoutFromApp();
		driver.close();
	}

}
