package testSuits.Instafin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_loginPage;
import pages.Instafin.Clients.Page_Clients_Centres;
import pages.Instafin.Clients.Page_Clients_Corporate;
import pages.Instafin.Clients.Page_Clients_Individual;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Clients {

	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://meheditest.instafin.info/user/login";
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard dashBoard_PageElements = new Page_DashBoard(driver);
	Page_Clients_Individual clients_Individual_PageElements = new Page_Clients_Individual(driver);
	Page_Clients_Corporate clients_Corporate_PageElements = new Page_Clients_Corporate(driver);
	Page_Clients_Centres clients_Centre_PageElements = new Page_Clients_Centres(driver);
	
	@BeforeTest
	public void beforeTesting() throws IOException {
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
	public void verify_Elements_displayed() {
		clients_Individual_PageElements.Click_On_Main_Client_Button();
		clients_Individual_PageElements.VerifyElementPresents_Clients_Individual();
		clients_Corporate_PageElements.VerifyElementPresents_Clients_Corporate();
		clients_Centre_PageElements.VerifyElementPresents_Clients_Individual();
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		login_PageElements.logoutFromApp();
		driver.close();
	}
	
}
