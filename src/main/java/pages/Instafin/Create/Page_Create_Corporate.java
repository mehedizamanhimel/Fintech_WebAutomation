package pages.Instafin.Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Page_Create_Corporate {
	
	WebDriver driver;
	
	//Elements of Create section
	By buttonCreateMainfromMenu = By.cssSelector("i[class='fa fa-plus-square-o']");
	
	
	By buttonCorporateMain = By.cssSelector("li a[href='/client/corporate/create']");
	By buttonCentreMain = By.cssSelector("a[href='/centre/create']");
	
	
	//Elements for Corporate Creation Form
	By basicInfo_InputName = By.id("name");
	By contactData_Input_Street = By.id("address_street1");
	By contactData_Input_State = By.id("address_state");
	By contactData_Input_City = By.id("address_city");
	By contactData_Input_PostCode = By.id("address_postCode");
	By contactData_Input_Country = By.id("address_country");
	By contactData_selectCountry_for_Mobile = By.id("contact_phoneRegionCode");
	By contactData_input_MobileNumber = By.id("contact_mobileNumber");
	By contactData_inputEmail = By.id("contact_email");
	By select_Assigned_Branch_AssignTo = By.id("corporateClientCreateBranchId");
	By select_Credit_Officer_AssignTo = By.id("corporateClientCreateCreditOfficerId");
	By selectCentre_AssignTo = By.id("corporateClientCreateCentreId");
	By select_typeof_Business_Additional = By.id("optionals_typeOfBusiness");
	By inputTaxNumber_FinancialInformation = By.id("optionals_taxNumber");
	By input_Profile_notes_Additional = By.id("contact_mobileNumber");
	By input_CreationDate_Additional = By.id("contact_mobileNumber");
	By button_Create = By.id("disableAfterClick");
	By button_Cancel = By.cssSelector("a[href='/client/corporate/list']");
	
	
	//initiating webdriver from upper
	public Page_Create_Corporate(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void open_Create_Section() {
		driver.findElement(buttonCreateMainfromMenu).click();
	}

	public void open_corporate_client_creation_page() {
		driver.findElement(buttonCorporateMain).click();		
	}


	public void Input_Name_BasicInfo(String name) {
		driver.findElement(basicInfo_InputName).sendKeys(name);
	}


	public void Input_Street_Address(String Street) {
		driver.findElement(contactData_Input_Street).sendKeys(Street);
	}

	public void Input_State_Province(String State) {
		driver.findElement(contactData_Input_State).sendKeys(State);
	}

	public void Input_City_town(String city) {
		driver.findElement(contactData_Input_City).sendKeys(city);	
	}

	public void Input_Postal_Zipcode(String zip) {
		driver.findElement(contactData_Input_PostCode).sendKeys(zip);	
	}

	public void open_Centre_Section() {
		driver.findElement(buttonCentreMain).click();
		
	}

	public void Input_Country() {
		driver.findElement(contactData_Input_Country).sendKeys("Bangladesh");
		
	}

	public void Select_MobileNumber_Code() {
		Select selectMobileNo = new Select(driver.findElement(contactData_selectCountry_for_Mobile));
		selectMobileNo.selectByValue("BD");
	}

	public void Input_Mobile_Number() {
		driver.findElement(contactData_input_MobileNumber).sendKeys("1777777777");
		
	}

	public void Input_Email() {
		driver.findElement(contactData_inputEmail).sendKeys("sampleTest@test.com");
		
	}

	public void Branch_Selection() {
		Select selectBranch = new Select(driver.findElement(select_Assigned_Branch_AssignTo));
		selectBranch.selectByValue("LVB");
	}

	public void Credit_Officer_Selection() {
		Select selectCreditOfficer = new Select(driver.findElement(select_Credit_Officer_AssignTo));
		selectCreditOfficer.selectByValue("USR-001");
	}

	public void Centre_Selection() {
		// TODO Auto-generated method stub
		
	}

	public void BusinessType_Selection() {
		Select selectBusiness = new Select(driver.findElement(select_typeof_Business_Additional));
		selectBusiness.selectByValue("202");
		
	}

	public void TaxNumber() {
		driver.findElement(inputTaxNumber_FinancialInformation).sendKeys("ETIN0000");
	}

	public void ProfileNotes() {
		driver.findElement(input_Profile_notes_Additional).sendKeys("Sample Note from profile");
	}

	public void CreationDate() {
		driver.findElement(input_CreationDate_Additional).sendKeys("22112017");
		
	}

	public void Submission_User_Creation_Form() {
		driver.findElement(button_Create).click();
		
	}

	public void Confirm_Submission_Form() {
		// TODO Auto-generated method stub
		
	}
	
	
}
