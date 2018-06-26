package pages.Instafin.BulkActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_BulkActions_CombinedSheet {


	WebDriver driver;
	
	
	By buttonBulkActionsMain = By.cssSelector("i[class='fa-icon-resize-small']");
	
	By combinedSheetMain = By.linkText("Combined Sheet");
	
	//Elements of Combined Sheet
	By dateSelect = By.cssSelector("input[class='DatePicker--Input']");
	
	By checkBox_ExcludeInArrears = By.cssSelector("input[name='excludeInArrears']");
	
	By checkBox_PaidPrepaid = By.cssSelector("input[name='includePaidAndPrepaid']");
	
	By InputBranch = By.cssSelector("#react-select-2--value > div.Select-placeholder");
	//By InputBranch = By.cssSelector("body > div:nth-child(2) > instafin-app > div > div > div.main-container > div > div.col-sm-11.no-left-gutter > div > div > div > div:nth-child(2) > form > div > div:nth-child(2) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div > span.Select-arrow-zone > span");
	//List <WebElement> branch= (List<WebElement>) By.cssSelector("input[aria-activedescendant='react-select-2--value']");
	
	By depositeType = By.id("react-select-5--value");
	
	By vcb = By.cssSelector("input[placeholder='dd/mm/yyyy']");
	
	By weqr = By.cssSelector("input[placeholder='dd/mm/yyyy']");
	
	By ads = By.cssSelector("input[placeholder='dd/mm/yyyy']");
	
	
	
	
	
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
		/*driver.findElement(InputBranch).click();
		Select asdf = new Select(driver.findElement(InputBranch));
		asdf.selectByVisibleText("Branch 1006");
		List<WebElement> element = driver.findElements(By.cssSelector("InputBranch"));
		for (int i = 0; i < element.size(); i++) {
	        String temp = element.get(i).getText();
	        if (temp.equals("0")) {
	            element.get(i).click();             
	            break;
	        }
	    }*/
		driver.findElement(InputBranch).click();
		Thread.sleep(2000);
		driver.findElement(InputBranch).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(InputBranch).sendKeys(Keys.ENTER);
	}

	public void input_Date() {
		driver.findElement(dateSelect).sendKeys("01/06/2018");
		
	}

	public void check_Exclude_Arrears() {
		// TODO Auto-generated method stub
		
	}

	public void checl_Inlude_Paid_Prepaid() {
		// TODO Auto-generated method stub
		
	}

	public void Select_Credit_Officer() {
		// TODO Auto-generated method stub
		
	}

	public void Select_Centre() {
		// TODO Auto-generated method stub
		
	}

	public void Deposite_Type() throws InterruptedException {
		driver.findElement(depositeType).click();
		
		driver.findElement(depositeType).click();
	
		Select selectDeposit = new Select(driver.findElement(depositeType));
		selectDeposit.selectByIndex(1);
		
	}

	public void Select_Products() {
		// TODO Auto-generated method stub
		
	}

	public void Select_Clients() {
		// TODO Auto-generated method stub
		
	}

	public void Submit_Filter() {
		// TODO Auto-generated method stub
		
	}

	public void Verify_Filter_Submission() {
		// TODO Auto-generated method stub
		
	}

}
