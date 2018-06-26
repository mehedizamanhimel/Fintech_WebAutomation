package pages.Instafin.Clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Clients_Corporate {


	WebDriver driver;
	
	@FindBy(css="#sidebar-left > div > ul > li:nth-child(5) > a > span")
	WebElement mainClientButton;
	
	@FindBy(css="a[href='/client/corporate/list']")
	WebElement mainCorporateButton;
	
	@FindBy(id="corporateClientCreateBranchId")
	WebElement selectBranch_corporate;
	
	@FindBy(id="corporateClientCreateBranchId")
	WebElement selectCreditOffer_corporate;
	
	@FindBy(id="corporateClientCreateCentreId")
	WebElement selectCentre_corporate;
	
	@FindBy(css="#organisationFilterForm > fieldset > div.fm_field.g1.go > button")
	WebElement buttonFilterSubmit_corporate;
	
	@FindBy(css="#content > div:nth-child(4) > div.span5 > div > a")
	WebElement buttonNewClient_corporate;
	
	@FindBy(css="button[id='export-ms-excel']")
	WebElement buttonExport_corporate;
	
	
	public Page_Clients_Corporate(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Click_On_Main_Client_Button() {
		mainClientButton.click();
	}
	
	public void VerifyElementPresents_Clients_Corporate() {
		
		mainCorporateButton.click();
		selectBranch_corporate.isDisplayed();
		selectCreditOffer_corporate.isDisplayed();
		selectCentre_corporate.isDisplayed();
		buttonFilterSubmit_corporate.isDisplayed();
		buttonNewClient_corporate.isDisplayed();
		buttonExport_corporate.isDisplayed();
	}

}
