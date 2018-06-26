package pages.Instafin.BulkActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Page_BulkActions_CreateLoans {


	WebDriver driver;
	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");
	
	By createloansMain = By.linkText("Create Loans");
	
	By selectBrunch = By.id("branchSelector");
	By selectCreditOfficer = By.id("creditOfficerSelector");
	By selectCentre = By.id("centreSelector");
	By selectLoadProduct = By.id("productSelector");
	By buttonFilterSubmit = By.id("filterBtn");
	By loanFilterResult = By.cssSelector("div[class='row-fluid mainBoxWrapper']");
	
	
	
	public Page_BulkActions_CreateLoans(WebDriver driver) {
		this.driver = driver;
	}


	public void click_BulkActions_MainButton() {
		driver.findElement(buttonBulkActionsMain).click();		
	}

	public void open_CreateLone() {
		driver.findElement(createloansMain).click();		
	}
	
	public void Selecting_Branch() {
		Select selectBranch = new Select(driver.findElement(selectBrunch));
		selectBranch.selectByValue("WKB");
	}

	public void Selecting_LoanProduct() {
		Select selectLoanProduct = new Select(driver.findElement(selectLoadProduct));
		selectLoanProduct.selectByValue("00345");
	}
	
	public void Selecting_CreditOfficer() {
		Select selectOfficer = new Select(driver.findElement(selectCreditOfficer));
		selectOfficer.selectByValue("USR-001");
	}

	public void Selecting_Centre() {
		Select selectCentre = new Select(driver.findElement(selectCreditOfficer));
		selectCentre.selectByValue("SL001");
	}
	
	public void submitFilter() {
		driver.findElement(buttonFilterSubmit).click();
	}


	public void verifyFilteringDone() {
		driver.findElement(loanFilterResult).isDisplayed();
		
	}

}
