package pages.Instafin.BulkActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_BulkActions_ImportTransactions {

	WebDriver driver;

	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");

	By importTransactionsMain = By.cssSelector("a[href='/transaction/migration/view']");
	
	public Page_BulkActions_ImportTransactions(WebDriver driver) {
		this.driver = driver;
	}
	

}
