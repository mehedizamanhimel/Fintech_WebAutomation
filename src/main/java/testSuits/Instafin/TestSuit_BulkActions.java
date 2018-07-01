package testSuits.Instafin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_loginPage;
import pages.Instafin.BulkActions.Page_BulkActions_CombinedSheet;
import pages.Instafin.BulkActions.Page_BulkActions_CreateLoans;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_BulkActions {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();


	String baseurl = "https://meheditest.instafin.info/user/login";
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePage_Elements = new Page_DashBoard(driver);
	//Page_BulkActions_RepaymentSheet bulkActions_RepaymentSheet_PageElements = new Page_BulkActions_RepaymentSheet(driver);
	Page_BulkActions_CombinedSheet bulk_CombineSheet = new Page_BulkActions_CombinedSheet(driver);
	Page_BulkActions_CreateLoans bulk_CreateLone = new Page_BulkActions_CreateLoans(driver);
	
	
	@BeforeTest
	public void beforeTesting() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testData = new LoadPropertiesFile_Instafin();
		driver.manage().window().maximize();
		//driver.get(testData.properties.getProperty("baseurl"));
		driver.get(baseurl);
		login_PageElements.inputUserName(testData.properties.getProperty("username"));
		login_PageElements.inputPassword(testData.properties.getProperty("password"));
		login_PageElements.clickOnLoginButton();
		homePage_Elements.verifyLogin();
		
	}
	
	
	@Test(priority=4)
	public void CreateLoans_verify_CreatingLoans() throws InterruptedException {
		bulk_CreateLone.click_BulkActions_MainButton();
		Thread.sleep(1000);
		bulk_CreateLone.open_CreateLone();
		Thread.sleep(1000);
		bulk_CreateLone.Selecting_Branch();
		Thread.sleep(1000);
		bulk_CreateLone.Selecting_LoanProduct();
		Thread.sleep(1000);
		bulk_CreateLone.submitFilter();
		Thread.sleep(1000);
		bulk_CreateLone.verifyFilteringDone();
		Thread.sleep(1000);
	}
	
	@Test(priority=0)
	public void CombineSheet_verify_Elements_Availability() throws InterruptedException {
		bulk_CombineSheet.click_BulkActions_MainButton();
		bulk_CombineSheet.verifybuttonavailable();	
		bulk_CombineSheet.open_CombineSheet();
		bulk_CombineSheet.verify_AllElements_Available_BeforeFilter();
		bulk_CombineSheet.select_Branch();
		bulk_CombineSheet.Submit_Filter();
		bulk_CombineSheet.verify_AllElements_Available_AfterFilter();
		driver.navigate().refresh();
	}
	
	
	
	@Test(priority=1)
	public void CombineSheet_verifyErrorForBlankSubmission() {
		bulk_CombineSheet.click_BulkActions_MainButton();
		bulk_CombineSheet.open_CombineSheet();
		bulk_CombineSheet.Submit_Filter();
		bulk_CombineSheet.verifyErrorAfterSubmitFilter();
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void Open_Combine_Sheet() throws InterruptedException{
		bulk_CombineSheet.click_BulkActions_MainButton();
		bulk_CombineSheet.open_CombineSheet();
		bulk_CombineSheet.select_Branch();
		bulk_CombineSheet.Submit_Filter();
		bulk_CombineSheet.Verify_CombineSheet_Opening();
		driver.navigate().refresh();
	}
	
	
	@Test(priority=4)
	public void verify_Combine_Sheet_For_Bulk_Payments() throws InterruptedException {
		bulk_CombineSheet.click_BulkActions_MainButton();
		bulk_CombineSheet.verifybuttonavailable();
		bulk_CombineSheet.open_CombineSheet();
		
		bulk_CombineSheet.input_Date();
		bulk_CombineSheet.check_Exclude_Arrears();
		bulk_CombineSheet.checl_Inlude_Paid_Prepaid();
		
		bulk_CombineSheet.select_Branch();
		Thread.sleep(1000);
		bulk_CombineSheet.Select_Credit_Officer();
		Thread.sleep(1000);
		bulk_CombineSheet.Select_Centre();
		Thread.sleep(1000);
		bulk_CombineSheet.Select_Products();
		Thread.sleep(1000);
		/*bulk_CombineSheet.Select_Clients();
		Thread.sleep(5000);*/
		bulk_CombineSheet.Deposite_Type();
		Thread.sleep(1000);	
		bulk_CombineSheet.Submit_Filter();
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void CombineSheet_Enter_Payments() throws InterruptedException {
		bulk_CombineSheet.click_BulkActions_MainButton();
		bulk_CombineSheet.open_CombineSheet();
		Thread.sleep(1000);
		bulk_CombineSheet.select_Branch();
		bulk_CombineSheet.Submit_Filter();
		Thread.sleep(1000);
		bulk_CombineSheet.select_CheckBOX_CLient_ALL();
		bulk_CombineSheet.Enter_Payment();
		Thread.sleep(1000);

		bulk_CombineSheet.Payment_Method_Repayment_Deposit();
		
		bulk_CombineSheet.input_referenceNumber();
		bulk_CombineSheet.input_Note();	
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}

