package pages.Instafin.BulkActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_BulkActions_CombinedSheet {


	WebDriver driver;
	
	
	@FindBy(css="body")
	WebElement body;
	
	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");
	
	By combinedSheetMain = By.linkText("Combined Sheet");
	
	//Elements of Combined Sheet
	By dateSelect = By.cssSelector("input[class='DatePicker--Input']");
	//By toDate = By.cssSelector("input[placeholder='dd/mm/yyyy']");
	
	By checkBox_ExcludeInArrears = By.cssSelector("input[name='excludeInArrears']");
	
	By checkBox_PaidPrepaid = By.cssSelector("input[name='includePaidAndPrepaid']");
	
	
	By select_Branch = By.cssSelector("div[data-qa-element-id='organisationStructure.branch']");
	By dropDown_values = By.cssSelector(".Select-input > input");
	
	By select_CreditOfficer = By.cssSelector("div[data-qa-element-id='organisationStructure.creditOfficer']");
	By select_Centre = By.cssSelector("div[data-qa-element-id='organisationStructure.centre']");
	By select_Product = By.cssSelector("div[data-qa-element-id='products']");
	By select_Client = By.cssSelector("div[data-qa-element-id='clients']");
	By depositeType = By.cssSelector("react-select-5--value");
	By tooltipSelectBranch = By.cssSelector("div[class='Tooltip__tip--JSFYh Tooltip__error--30ShZ']");
	By clearDropDown = By.cssSelector("div:nth-child(2) > form > div > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div > span.Select-clear-zone > span");
	
	By selectDepositMethod = By.cssSelector("div[data-qa-element-id='deposit.paymentMethod']");
	By selectDepositMethodValue = By.cssSelector("#react-select-8--value > div.Select-placeholder");
	
	@FindBy(css="SPAN[CLASS='FormError__message--1VIpa FormError__error--1lqlb']")
	WebElement errorNotification;
	
	@FindBy(xpath="/html/body/div[1]/instafin-app/div/div/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[5]/div/button")
	WebElement submitButton;
	
	@FindBy(css="div[class='box__box--3I4zq']")
	WebElement combineSheetBody;
	
	@FindBy(xpath="(//INPUT[@type='checkbox'])[4]")
	WebElement checkboxClient;
	
	@FindBy(xpath="/html/body/div[1]/instafin-app/div/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[2]/div/button")
	WebElement submitPayment;
	
	@FindBy(id="referenceNumber")
	WebElement referenceNumber;
	
	@FindBy(id="note")
	WebElement note;
	
	@FindBy(css="body > div:nth-child(4) > div > div.fade.in.modal > div > div > form > div.modal-footer > button.btn.btn-primary")
	WebElement submitBulkPayment;

	@FindBy(xpath="//SPAN[@class='notif__message'][text()='The Repayment of PHP 6,772.10 and The Deposit of PHP 600.00 was successfully entered']")
	WebElement successfulNotification;
	
	
	public Page_BulkActions_CombinedSheet(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_BulkActions_MainButton() {
		driver.findElement(buttonBulkActionsMain).click();
		
	}

	
	public void open_CombineSheet() {
		driver.findElement(combinedSheetMain).click();
	}

	public void verifybuttonavailable() {
		driver.findElement(combinedSheetMain).isDisplayed();
		
	}

	public void select_Branch() throws InterruptedException {
		
		/*WebElement selectBranchBox = driver.findElement(By.cssSelector("div[data-qa-element-id='organisationStructure.branch']"));
		WebElement selectBranchInput = selectBranchBox.findElement(By.cssSelector(".Select-input > input"));
        selectBranchInput.sendKeys("Branch 1004");
        WebElement selectOption = selectBranchBox.findElement(By.cssSelector(".Select-option"));
        selectOption.click();*/
		
		WebElement selectBranchValue = driver.findElement(select_Branch).findElement(dropDown_values);
		selectBranchValue.sendKeys("Branch 1007");
		WebElement selectOptionBranch = driver.findElement(select_Branch).findElement(By.cssSelector(".Select-menu"));
        selectOptionBranch.click();
		
	}

	public void input_Date() {
		driver.findElement(dateSelect).sendKeys("01/06/2018");
		
	}

	public void check_Exclude_Arrears() {
		driver.findElement(checkBox_ExcludeInArrears).click();
		
	}

	public void checl_Inlude_Paid_Prepaid() {
		driver.findElement(checkBox_PaidPrepaid).click();
		
	}

	public void Select_Credit_Officer() throws InterruptedException {
		WebElement selectBranchValue = driver.findElement(select_CreditOfficer).findElement(dropDown_values);
		selectBranchValue.sendKeys("Name 1029 Surname 1029");
		//Thread.sleep(1000);
		WebElement selectOptionCreditOfficer = driver.findElement(select_CreditOfficer).findElement(By.cssSelector(".Select-menu"));
        selectOptionCreditOfficer.click();
	}

	public void Select_Centre() {
		WebElement selectBranchValue = driver.findElement(select_Centre).findElement(dropDown_values);
		selectBranchValue.sendKeys("Without Centre");
		WebElement selectOptionCentre = driver.findElement(select_Centre).findElement(By.cssSelector(".Select-menu"));
		selectOptionCentre.click();
	}

	public void Deposite_Type() throws InterruptedException {
		driver.findElement(depositeType).click();
		
		Select selectDeposit = new Select(driver.findElement(depositeType));
		selectDeposit.selectByIndex(1);
		
	}

	public void Select_Products() {
		WebElement selectBranchValue = driver.findElement(select_Product).findElement(dropDown_values);
		selectBranchValue.sendKeys("Product 1001");
		/*WebElement selectProducts = driver.findElement(select_Product).findElement(By.cssSelector(".Select-menu"));
		selectProducts.click();*/
		
	}

	public void Select_Clients() throws InterruptedException {
		WebElement selectBranchValue = driver.findElement(select_Client).findElement(dropDown_values);
		selectBranchValue.sendKeys("Client 1418");
		WebElement selectClients = driver.findElement(select_Client).findElement(By.cssSelector(".Select-menu"));
		//WebElement selectClients = driver.findElement(select_Client).findElement(By.cssSelector(".Select-value-label"));
		selectClients.click();
	}
	

	public void deposit_Payment_Method() {
		WebElement selectdepositValue = driver.findElement(selectDepositMethod).findElement(dropDown_values);
		selectdepositValue.sendKeys("Cash-only Test");
		WebElement selectdepositMethod = driver.findElement(selectDepositMethod).findElement(By.cssSelector(".Select-menu"));
		selectdepositMethod.click();
		
	}

	public void verifyErrorAfterSubmitFilter() {
		errorNotification.isDisplayed();
	}
	
	
	public void Submit_Filter() {
		submitButton.click();		
	}

	public void Verify_CombineSheet_Opening() {
		combineSheetBody.isDisplayed();
	}

	public void select_CheckBOX_CLient() {
		checkboxClient.click();
		body.sendKeys(Keys.PAGE_DOWN);
	}

	public void Enter_Payment() {
		submitPayment.click();
		
	}


	public void input_referenceNumber() {
		referenceNumber.sendKeys("sample reference number");
		
	}

	public void input_Note() {
		note.sendKeys("sample Note");	
		note.submit();
	}

	public void complete_Payment() {
		submitBulkPayment.click();
	}

	public void successfull_Verification() {
		successfulNotification.isDisplayed();
		
	}

}
