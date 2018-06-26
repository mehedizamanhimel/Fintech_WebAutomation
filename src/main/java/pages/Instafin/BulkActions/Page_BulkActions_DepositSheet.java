package pages.Instafin.BulkActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_BulkActions_DepositSheet {

	WebDriver driver;

	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");
	
	By depositSheetMain = By.cssSelector("a[href='/transaction/account/deposit/due-list']");
	
	
	public Page_BulkActions_DepositSheet(WebDriver driver) {
		this.driver = driver;
	}

}
