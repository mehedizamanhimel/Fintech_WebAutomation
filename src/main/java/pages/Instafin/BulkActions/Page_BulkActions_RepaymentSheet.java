package pages.Instafin.BulkActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_BulkActions_RepaymentSheet {
	
	WebDriver driver;
	
	//Elements of Main subsections
	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");
	
	By repaymentSheetMain = By.cssSelector("a[href='/transaction/account/loan/due-list'");	
	By withDrawalSheetMain = By.cssSelector("a[href='/transaction/account/deposit/withdrawal-list']");
	By disburseLoansMain = By.cssSelector("a[href='/bulk/account/disburse");
	
	
	
	public Page_BulkActions_RepaymentSheet(WebDriver driver) {
		this.driver = driver;
	}

	public void click_BulkActions_MainButton() {
		driver.findElement(buttonBulkActionsMain).click();
	}
	
	public void verifyElements_bulkActions() {
		driver.findElement(repaymentSheetMain).isDisplayed();
	}

}
