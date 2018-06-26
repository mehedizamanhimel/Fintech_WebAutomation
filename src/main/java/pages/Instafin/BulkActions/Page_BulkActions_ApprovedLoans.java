package pages.Instafin.BulkActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_BulkActions_ApprovedLoans {

	WebDriver driver;
	
	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");
	By approveLoansMain = By.cssSelector("a[href='/bulk/account/approve");
	
	
	public Page_BulkActions_ApprovedLoans(WebDriver driver) {
		this.driver = driver;
	}
	

}
