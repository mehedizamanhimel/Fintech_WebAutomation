package pages.Instafin.Accounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Accounting_BalanceSheet {

	WebDriver driver;

	
	By accounting_main_menu = By.cssSelector("div ul li.active a span");
	By submenu_balanceSheet = By.cssSelector("div ul li.active ul li:nth-child(2)");
	
	By exportButton = By.id("export-ms-excel");
	By inputDate = By.id("toDate");
	By checkBox_Hide_Zero_Balance = By.id("hideZeroBalance");
	By input_level = By.id("levelId");
	By select_Branch = By.id("generalLedgerBalanceSheetReportBranchSelect");
	By checkBox_Balance_show_level = By.id("showOnlyThisLevel");
	By button_submit_Filter = By.cssSelector("button[type='submit']");
	
	
	public Page_Accounting_BalanceSheet(WebDriver driver) {
		this.driver = driver;
	}


	public void Open_Accounting_Balance_sheet() {
		driver.findElement(accounting_main_menu).click();
		driver.findElement(submenu_balanceSheet).click();
	}


	public void Verify_Balance_sheet_elements() {
		driver.findElement(inputDate).isDisplayed();
		driver.findElement(exportButton).isDisplayed();
		driver.findElement(checkBox_Hide_Zero_Balance).isDisplayed();
		driver.findElement(input_level).isDisplayed();
		driver.findElement(select_Branch).isDisplayed();
		driver.findElement(checkBox_Balance_show_level).isDisplayed();
		driver.findElement(button_submit_Filter).isDisplayed();
	}

}
