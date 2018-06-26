package pages.Instafin.Reports;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_Reports_AccountActionLog {
	
	
	WebDriver driver;
	
	@FindBy(css="body")
	WebElement pageBody;
	
	
	@FindBy(linkText="Reports")
	WebElement reportsMainButton;
	
	@FindBy(css="a[href='/reports/log/action/accounts']")
	WebElement actionLogMainButton;
	
	@FindBy(id="startDateFilter")
	WebElement fromDate;
	
	@FindBy(id="endDateFilter")
	WebElement toDate;
	
	@FindBy(id="individualClientCreateBranchId")
	WebElement selectBranch;
	
	@FindBy(id="individualClientCreateCreditOfficerId")
	WebElement selectCreditOfficer;
	
	@FindBy(id="individualClientCreateCentreId")
	WebElement selectCentre;
	
	@FindBy(id="transactionTypesId")
	WebElement selectActionType;
	
	@FindBy(id="productIds_chzn")
	WebElement clickProducts;
	
	@FindBy(id="productIds_chzn_o_2")
	WebElement selectProduct02;
	
	@FindBy(id="usersearch")
	WebElement searchUser;
	
	@FindBy(id="showRevertActions")
	WebElement checkBox;
	
	@FindBy(css="button[type='submit']")
	WebElement submitFilter;
	
	@FindBy(id="export-ms-excel")
	WebElement exportButton;
	
	@FindBy(css="div[class='box-header']")
	WebElement filterSubmitConfirmation;
	
	@FindBy(css="#organisationFilterForm > fieldset:nth-child(1) > div:nth-child(1) > div.g3.fm_error > div")
	WebElement fromDateErrorMessage;
	
	public Page_Reports_AccountActionLog(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void click_Rerports_main() {
		reportsMainButton.click();		
	}
	
	public void click_AccountAction_main() {
		pageBody.sendKeys(Keys.ARROW_DOWN);
		pageBody.sendKeys(Keys.ARROW_DOWN);
		pageBody.sendKeys(Keys.ARROW_DOWN);
		pageBody.sendKeys(Keys.ARROW_DOWN);
		actionLogMainButton.click();		
	}

	public void verify_all_elements_present() {
		fromDate.isDisplayed();
		toDate.isDisplayed();
		selectBranch.isDisplayed();
		selectCreditOfficer.isDisplayed();
		selectCentre.isDisplayed();
		selectActionType.isDisplayed();
		clickProducts.isDisplayed();
		searchUser.isDisplayed();
		checkBox.isDisplayed();
		submitFilter.isDisplayed();
		exportButton.isDisplayed();
		
	}


	public void provide_fromDate() {
		fromDate.sendKeys("11012018");
	}


	public void provide_toDate() {
		toDate.sendKeys("11022018");
	}


	public void selectBranch() {
		Select select = new Select(selectBranch);
		select.selectByValue("1000");
	}


	public void selectCreditOfficer() {
		Select select = new Select(selectCreditOfficer);
		select.selectByValue("1022");
	}


	public void selectCentre() {
		Select select = new Select(selectCentre);
		select.selectByValue("1000");
	}


	public void selectActionType() {
		Select select = new Select(selectActionType);
		select.selectByValue("Activate");
	}


	public void selectProducts() {
		clickProducts.click();
		selectProduct02.click();
	}


	public void clickCheckbox() {
		checkBox.click();
	}


	public void selectUser() {
		
	}


	public void clickSubmit() {
		submitFilter.click();
	}


	public void verifyFilterSubmit() {
		filterSubmitConfirmation.isDisplayed();
		
	}


	public void verify_ErrorMessage_date() {
		fromDateErrorMessage.isDisplayed();
		
	}


	public void provide_wrongfromDate(String wrongDate) {
		fromDate.sendKeys(wrongDate);
	}


	public void provide_wrongToDate(String wrongDate) {
		toDate.sendKeys(wrongDate);	
	}


}
