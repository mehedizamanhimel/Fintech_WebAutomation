package pages.Instafin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Page_Transactions_Services {
	WebDriver driver;
	
	//Elements of Subsection Services from Transactions 
	By buttonTransactionMain = By.cssSelector("i[class='fa fa-handshake-o']");
	By buttonServiceMain = By.cssSelector("#sidebar-left li:nth-child(2) ul li a");
	
	//Elements of Services page
	By select_ServiceProduct = By.cssSelector("#react-select-2--value > div.Select-placeholder");
	By select_Paymentmethod = By.cssSelector("#react-select-3--value > div.Select-placeholder");
	By select_Branch = By.cssSelector("#react-select-4--value div.Select-placeholder");
	By input_Amount = By.cssSelector("input[label='Amount']");
	//By input_ReferenceNumber = By.cssSelector("input[id='referenceNumber']");
	By input_ReferenceNumber = By.id("referenceNumber");
	By input_Notes = By.id("notes");
	By button_ApplyTransaction = By.cssSelector("button[type='submit']");
	By button_CancelTransaction = By.cssSelector("button[type='button']");
	
	
	//Element of mandatory tooltips
	By tooltip_ServiceProductSelection = By.cssSelector("<div class=\"Tooltip__tip--JSFYh Tooltip__error--30ShZ\">Required</div>");
	By tooltip_PaymentMethodSelection = By.cssSelector("");
	By tooltip_BranchSelection = By.cssSelector("");
	By tooltip_Amount = By.cssSelector("");
	By tooltip_ReferenceNumber = By.cssSelector("");
	By errorNotification_AfterCompletion = By.cssSelector("span[class='FormError__message--1VIpa FormError__error--1lqlb']");
		
	/*@FindBy(css="#react-select-2--value > div.Select-placeholder")
	public WebElement selectingSerive;
	
	@FindBy(css="#react-select-3--value > div.Select-placeholder")
	public WebElement selectingPaymentMethod;
	
	@FindBy(css="#react-select-4--value div.Select-placeholder")
	public WebElement selectingBranch;
	
	@FindBy(css="input[label='Amount']")
	public WebElement providingAmount;
	
	@FindBy(css="input[id='referenceNumber']")
	public WebElement providingReference;
	
	@FindBy(id="notes")
	public WebElement providingNotes;*/
	
	public Page_Transactions_Services(WebDriver driver) {
		this.driver = driver;
	}

	public void open_Services_Section() {
		driver.findElement(buttonTransactionMain).click();
		driver.findElement(buttonServiceMain).click();
	}

	public void Verify_Elements() {
		driver.findElement(select_ServiceProduct).isDisplayed();
		driver.findElement(select_Paymentmethod).isDisplayed();
		driver.findElement(select_Branch).isDisplayed();
		driver.findElement(input_Amount).isDisplayed();
		driver.findElement(input_ReferenceNumber).isDisplayed();
		driver.findElement(input_Notes).isDisplayed();
		driver.findElement(button_ApplyTransaction).isDisplayed();
		driver.findElement(button_CancelTransaction).isDisplayed();
	}

	public void Select_Service_Product() {
		Select selectServiceProduct = new Select(driver.findElement(select_ServiceProduct));
		selectServiceProduct.selectByVisibleText("Product 1568");		
	}

	public void Select_Payment_Method() {
		Select selectPayment = new Select(driver.findElement(select_Paymentmethod));
		selectPayment.selectByIndex(1);
	}

	public void Select_Branch() {
		Select selectBranch = new Select(driver.findElement(select_Branch));
		selectBranch.selectByIndex(1);
	}

	public void Input_Amount() {
		driver.findElement(input_Amount).sendKeys("100");
		
	}

	public void Input_ReferenceNumber() {
		driver.findElement(input_ReferenceNumber).sendKeys("111");
		
	}

	public void Input_Notes_Additional() {
		driver.findElement(input_Notes).sendKeys("asfsfsadf  asdf asdf sadf dsf asd");
		
	}
	
}
