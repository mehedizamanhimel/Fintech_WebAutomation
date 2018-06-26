package pages.Instafin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_OfflineTransactions {
	
	WebDriver driver;
	By aaaa = By.cssSelector("");
	
	@FindBy(linkText= "Offline Transactions")
	WebElement offilne_Transaction_Main_Button;
	
	@FindBy(id="toDate")
	WebElement date;
	
	@FindBy(id="userLevelTypeSelect")
	WebElement selectLevelType;
	
	@FindBy(id="userLevelSelect")
	WebElement selectLevel;
	
	@FindBy(css="button[type='submit']")
	WebElement filterSubmitButton;
	
	@FindBy(css="div[id='conflictResolutionTable_wrapper']")
	WebElement filterResultBox;
	
	public Page_OfflineTransactions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void open_Main_Button() {
		offilne_Transaction_Main_Button.click();
	}

	public void select_Level_Type() {
		Select selectingleveltype = new Select(selectLevelType);
		selectingleveltype.selectByValue("3");
	}

	public void select_Level() {
		Select selectinglevel = new Select(selectLevel);
		selectinglevel.selectByValue("1006");
		
	}

	public void select_date() {
		date.sendKeys("20052018");
		
	}

	public void submit_Filter() {
		filterSubmitButton.click();		
	}

	public void verify_filter_is_working() {
		filterResultBox.isDisplayed();		
	}
	
	

}
