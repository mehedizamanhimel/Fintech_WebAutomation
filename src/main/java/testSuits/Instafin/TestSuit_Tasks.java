package testSuits.Instafin;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Instafin.Page_DashBoard;
import pages.Instafin.Page_Tasks_AllTasks;
import pages.Instafin.Page_Tasks_CreateTask;
import pages.Instafin.Page_loginPage;
import utils.LoadPropertiesFile_Instafin;

public class TestSuit_Tasks {
	
	static LoadPropertiesFile_Instafin testData;
	
	WebDriver driver = new ChromeDriver();
	
	Page_loginPage login_PageElements = new Page_loginPage(driver);
	Page_DashBoard homePage_Elements = new Page_DashBoard(driver);
	Page_Tasks_AllTasks allTask_Page = new Page_Tasks_AllTasks(driver);
	Page_Tasks_CreateTask createTask_Page = new Page_Tasks_CreateTask(driver);

	
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
	public void Verify_task_feature_links() throws InterruptedException {
		allTask_Page.Click_Task_mainMenu_button();
		allTask_Page.Open_CreateTask();
		allTask_Page.Open_AllTasks();
		
	}
	
	
	
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		//login_PageElements.logoutFromApp();
		driver.close();
	}
}
