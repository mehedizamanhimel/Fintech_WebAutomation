package pages.Instafin.Clients;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Clients_Individual {

WebDriver driver;
	
	//Elements of Create section
	By aaa = By.cssSelector("dfsdfsd");
	
	//@FindBy(css="i[class='fa-icon-group']")
	//By mainClientButton = By.cssSelector("i[class='fa-icon-group']");
	By mainClientButton = By.xpath("(//A[@class='dropmenu'])[4]");
	
	/*@FindBy(css="a[href='/client/individual/list']")
	WebElement mainIndividualButton;*/
	By mainIndividualButton = By.cssSelector("a[href='/client/individual/list']");
	
	/*@FindBy(id="individualClientCreateBranchId")
	WebElement selectBranch_individual;*/
	By selectBranch_individual = By.id("individualClientCreateBranchId");
	
	/*@FindBy(id="individualClientCreateCreditOfficerId")
	WebElement selectCreditOffer_individual;*/
	By selectCreditOffer_individual = By.id("individualClientCreateCreditOfficerId");
	
	/*@FindBy(id="selectCentre_individual")
	WebElement selectCentre_individual;*/
	By selectCentre_individual = By.id("selectCentre_individual");
	
	/*@FindBy(css="#organisationFilterForm > fieldset > div.fm_field.g1.go > button")
	WebElement buttonFilterSubmit_individual;*/
	By buttonFilterSubmit_individual = By.cssSelector("#organisationFilterForm > fieldset > div.fm_field.g1.go > button");
	
	@FindBy(css="a[href='/client/individual/create']")
	WebElement buttonNewClient_individual;
	//By mainIndividualButton = By.cssSelector("a[href='/client/individual/list']");
	
	
	
	
	public Page_Clients_Individual(WebDriver driver) {
		driver= this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Click_On_Main_Client_Button() {
		driver.findElement(mainClientButton).click();		
	}
	
	public void VerifyElementPresents_Clients_Individual() {
		/*mainIndividualButton.click();
		selectBranch_individual.isDisplayed();
		selectCreditOffer_individual.isDisplayed();
		selectCentre_individual.isDisplayed();
		buttonFilterSubmit_individual.isDisplayed();*/
		driver.findElement(mainIndividualButton).click();
		driver.findElement(selectBranch_individual).isDisplayed();
		driver.findElement(selectCreditOffer_individual).isDisplayed();
		driver.findElement(selectCentre_individual).isDisplayed();
		buttonNewClient_individual.isDisplayed();
	}
	
}
