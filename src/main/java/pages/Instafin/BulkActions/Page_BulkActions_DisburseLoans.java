package pages.Instafin.BulkActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_BulkActions_DisburseLoans {

	WebDriver driver;

	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");
	By disburseLoansMain = By.cssSelector("a[href='/bulk/account/disburse']");
	
	
	public Page_BulkActions_DisburseLoans(WebDriver driver) {
		this.driver = driver;
	}
	

}
