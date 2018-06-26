package testSuits.Instafin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_loginPage;
import pages.Instafin.Create.Page_Create_Centre;
import pages.Instafin.Create.Page_Create_Corporate;
import pages.Instafin.Create.Page_Create_Guarantor;
import pages.Instafin.Create.Page_Create_Individual;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Create {
	
	static LoadPropertiesFile_Instafin testData;
	
	
	WebDriver driver = new ChromeDriver();
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePage_Elements = new Page_DashBoard(driver);
	Page_Create_Corporate create_Corporate_PageElements = new Page_Create_Corporate(driver);
	Page_Create_Centre create_Centre_PageEments = new Page_Create_Centre(driver);
	Page_Create_Individual create_Individual_PageEments = new Page_Create_Individual(driver);
	Page_Create_Guarantor create_Guarantor_PageEments = new Page_Create_Guarantor(driver);
	
	
	@BeforeTest
	public void beforeTesting() throws IOException {
		testData = new LoadPropertiesFile_Instafin();
		driver.manage().window().maximize();
		driver.get(testData.properties.getProperty("baseurl"));
		login_PageElements.inputUserName(testData.properties.getProperty("username"));
		login_PageElements.inputPassword(testData.properties.getProperty("password"));
		login_PageElements.clickOnLoginButton();
		//homePage_Elements.verifyLogin();
	}
	
	//Area to write automated test cases using TestNG framework
	
	@Test
	public void createIndividual() throws InterruptedException {
		create_Corporate_PageElements.open_Create_Section();
		create_Individual_PageEments.open_Individual_Section();
		Thread.sleep(1000);
	}
	
	
	
	@Test
	public void verify_all_subSection_Opening() throws InterruptedException {
		create_Corporate_PageElements.open_Create_Section();
		create_Corporate_PageElements.open_Create_Section();
		create_Individual_PageEments.open_Individual_Section();
		Thread.sleep(3000);
		create_Corporate_PageElements.open_corporate_client_creation_page();
		Thread.sleep(3000);
		create_Corporate_PageElements.open_Centre_Section();
		Thread.sleep(3000);
		create_Guarantor_PageEments.open_Generator_Section();
		Thread.sleep(3000);
	}
		
	@Test
	public void corporate_user_creation() throws InterruptedException {
		create_Corporate_PageElements.open_Create_Section();
		Thread.sleep(1000);
		create_Corporate_PageElements.open_corporate_client_creation_page();
		create_Corporate_PageElements.Input_Name_BasicInfo("Mehedi");
		create_Corporate_PageElements.Input_Street_Address("Elephant Road, Dhaka, Bangladesh");
		create_Corporate_PageElements.Input_State_Province("Dhaka");
		create_Corporate_PageElements.Input_City_town("Dhaka");
		create_Corporate_PageElements.Input_Postal_Zipcode("1100");
		create_Corporate_PageElements.Input_Country();
		create_Corporate_PageElements.Select_MobileNumber_Code();
		create_Corporate_PageElements.Input_Mobile_Number();
		create_Corporate_PageElements.Input_Email();
		
		create_Corporate_PageElements.Branch_Selection();
		create_Corporate_PageElements.Credit_Officer_Selection();
		//create_Corporate_PageElements.Centre_Selection();
		
		create_Corporate_PageElements.BusinessType_Selection();
		
		create_Corporate_PageElements.TaxNumber();
		
		create_Corporate_PageElements.ProfileNotes();
		create_Corporate_PageElements.CreationDate();
		create_Corporate_PageElements.Submission_User_Creation_Form();
		//create_Corporate_PageElements.Confirm_Submission_Form();
	}
	
	@AfterTest
	public void afterTesting() {
		login_PageElements.logoutFromApp();
		driver.close();
	}
	

}
