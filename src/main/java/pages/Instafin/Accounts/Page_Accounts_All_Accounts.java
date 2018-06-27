package pages.Instafin.Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Page_Accounts_All_Accounts {
	
	WebDriver driver;
	
	
	By mainBody = By.cssSelector("body");
	//Element of main button Account from main menu
	By accounts_main_button = By.linkText("Accounts");
	
	//Element of main button All Accounts of submenu
	//By all_accounts_button_submenu = By.linkText("All Accounts");
	By all_accounts_button_submenu = By.xpath("//*[@id=\"sidebar-left\"]/div/ul/li[9]/ul/li[1]/a");
	
	//elements of All accounts elements
	By select_branch = By.id("individualClientCreateBranchId");
	By select_credit_officer = By.id("individualClientCreateCreditOfficerId");
	By select_Centre = By.id("individualClientCreateCentreId");
	By select_Account_Type = By.id("accountTypeId");
	By select_AccountStatus = By.id("accountStatusId");
	By select_Product = By.id("productsDropDown");
	By button_Filter_Submit = By.cssSelector("button[type='submit']");
	By button_Export = By.cssSelector("button[onclick='callExportToExcel()']");
	By button_Print = By.id("print-html");
	By filter_submit_Verify = By.cssSelector("div[id='hides-datatable-wrapper']");
	
	public Page_Accounts_All_Accounts(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void Open_Accounts_Main_Section() {
		/*driver.findElement(mainBody).sendKeys(Keys.ENTER);
		driver.findElement(mainBody).sendKeys(Keys.ENTER);
		driver.findElement(mainBody).sendKeys(Keys.ENTER);
		driver.findElement(mainBody).sendKeys(Keys.ENTER);
		driver.findElement(mainBody).sendKeys(Keys.DOWN);*/
		driver.findElement(accounts_main_button).click();	
		driver.findElement(mainBody).sendKeys(Keys.PAGE_DOWN);
	}

	
	public void Open_All_Accounts_SubSection() {
		
		//driver.findElement(mainBody).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(all_accounts_button_submenu).click();
	}
	
	
	public void VerifyElementsAreAvailable() {
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


	public void Select_Branch() {
		Select branchSelect = new Select(driver.findElement(select_branch));
		branchSelect.selectByValue("1002");
	}


	public void Select_CreditOfficer() {
		Select CreditOfficerSelect = new Select(driver.findElement(select_credit_officer));
		CreditOfficerSelect.selectByValue("1024");
	}


	public void Select_Centre() {
		Select CentreSelect = new Select(driver.findElement(select_Centre));
		CentreSelect.selectByValue("1002");
	}


	public void Select_AccountType() {
		Select AccountTypeSelect = new Select(driver.findElement(select_Account_Type));
		AccountTypeSelect.selectByValue("DEPOSIT");
	}


	public void Select_AccountStatus() {
		Select AccountStatusSelect = new Select(driver.findElement(select_AccountStatus));
		AccountStatusSelect.selectByValue("ACTIVE");
	}


	public void Select_Product() {
		Select ProductSelect = new Select(driver.findElement(select_Product));
		ProductSelect.selectByValue("TD AGDAO");
	}


	public void SubmitFilter() {
		driver.findElement(button_Filter_Submit).click();
	}


	public void Verify_FilterSubmission() {
		driver.findElement(filter_submit_Verify).isDisplayed();
	}

	
}
