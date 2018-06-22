package Oradian.Fintech_Oradian_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Oradian.Fintech_Oradian_Elements.ElementClass;

public class LoginClass {
	ElementClass webElementsFromLoginPage;
	
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://meheditest.instafin.info/user/login";
	
	@BeforeTest
	public void beforeTesting() {
		
	}
	
	@Test
	public void user_Login_valid_credentials() {
		driver.get(baseurl);
		driver.findElement(By.id("us1")).sendKeys("mehedi");
		
		//webElementsFromLoginPage.Login_To_Oradian();
		
	}
	
	@AfterTest
	public void afterTesting() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
