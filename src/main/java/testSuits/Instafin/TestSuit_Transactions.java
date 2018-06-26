package testSuits.Instafin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_Transactions_Services;
import pages.Instafin.Page_loginPage;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Transactions {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://meheditest.instafin.info/user/login";
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePageElements = new Page_DashBoard(driver);
	Page_Transactions_Services transaction_Page_Elements = new Page_Transactions_Services(driver);
	
	@BeforeTest
	public void beforeTesting() throws IOException {
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
	public void verify_Elements_displayed() {
		transaction_Page_Elements.open_Services_Section();
		transaction_Page_Elements.Verify_Elements();
	}
	
	@Test
	public void Create_Service_Transaction() {
		transaction_Page_Elements.open_Services_Section();		
		transaction_Page_Elements.Input_Amount();
		transaction_Page_Elements.Input_ReferenceNumber();
		transaction_Page_Elements.Input_Notes_Additional();
		transaction_Page_Elements.Select_Service_Product();
		/*transaction_Page_Elements.Select_Payment_Method();
		transaction_Page_Elements.Select_Branch();*/
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		//loginElements.logoutFromApp();
		driver.close();
	}

}
