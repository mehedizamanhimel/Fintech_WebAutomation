package pages.Instafin.Clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Clients_Centres {

	WebDriver driver;

	@FindBy(css = "#sidebar-left > div > ul > li:nth-child(5) > a > span")
	WebElement mainClientButton;

	@FindBy(css = "a[href='/centre/list']")
	WebElement mainCentreButton;

	@FindBy(id = "individualClientCreateBranchId")
	WebElement selectBranch_centre;

	@FindBy(id = "individualClientCreateCreditOfficerId")
	WebElement selectCreditOffer_centre;

	@FindBy(id = "userStatusActive")
	WebElement selectStatus_centre;
	
	@FindBy(css = "#filterForm > div > button")
	WebElement buttonSubmit_centre;	
	
	public Page_Clients_Centres(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Click_On_Main_Client_Button() {
		mainClientButton.click();
	}
	
	public void VerifyElementPresents_Clients_Individual() {
		mainCentreButton.click();
		selectBranch_centre.isDisplayed();
		selectCreditOffer_centre.isDisplayed();
		selectStatus_centre.isDisplayed();
		buttonSubmit_centre.isDisplayed();
		
	}

}
