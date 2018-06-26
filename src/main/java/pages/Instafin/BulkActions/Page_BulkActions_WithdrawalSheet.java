package pages.Instafin.BulkActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_BulkActions_WithdrawalSheet {

	WebDriver driver;
	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");

	By withDrawalSheetMain = By.cssSelector("a[href='/transaction/account/deposit/withdrawal-list']");	
	
	public Page_BulkActions_WithdrawalSheet(WebDriver driver) {
		this.driver = driver;
	}

}
