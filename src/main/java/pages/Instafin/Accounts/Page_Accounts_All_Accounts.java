package pages.Instafin.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Accounts_All_Accounts {
	
	WebDriver driver;
	
	//Element of main button Account from main menu
	//By accounts_main_button = By.cssSelector("#sidebar-left > div > ul > li.active > a > i");
	By accounts_main_button = By.xpath("//SPAN[@class='hidden-tablet'][text()='Accounts']");
	
	//Element of main button All Accounts of submenu
	By all_accounts_button_submenu = By.cssSelector("#sidebar-left > div > ul > li.active > ul > li:nth-child(1) > a");
	//By all_accounts_button_submenu = By.xpath("//A[@class='submenu current'][text()='All Accounts']");
	
	//elements of All accounts elements
	By select_branch = By.id("individualClientCreateBranchId");
	By select_credit_officer = By.id("individualClientCreateCreditOfficerId");
	By select_Centre = By.id("individualClientCreateCentreId");
	By select_Account_Type = By.id("accountTypeId");
	By select_AccountStatus = By.id("accountStatusId");
	By select_Product = By.id("productsDropDown");
	By button_Filter_Submit = By.id("submit");
	By button_Export = By.cssSelector("button[onclick='callExportToExcel()']");
	By button_Print = By.id("print-html");
	
	public Page_Accounts_All_Accounts(WebDriver driver) {
		this.driver = driver;
	}
	
	public void open_All_Accounts_SubPage() {
		driver.findElement(accounts_main_button).click();
		driver.findElement(all_accounts_button_submenu).click();
	}
	
	public void Verify_that_all_elements_are_Present_displayed() {
		driver.findElement(select_branch).isDisplayed();
		driver.findElement(select_credit_officer).isDisplayed();
		driver.findElement(select_Centre).isDisplayed();
		driver.findElement(select_Account_Type).isDisplayed();
		driver.findElement(select_AccountStatus).isDisplayed();
		driver.findElement(select_Product).isDisplayed();
		driver.findElement(button_Filter_Submit).isDisplayed();
		driver.findElement(button_Export).isDisplayed();
		driver.findElement(button_Print).isDisplayed();
	}



}
