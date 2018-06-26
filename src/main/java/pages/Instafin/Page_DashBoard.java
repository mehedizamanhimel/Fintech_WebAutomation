package pages.Instafin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_DashBoard {

	WebDriver driver;
	
	//Elements of HomePage
	By homePageDashBoard = By.cssSelector("h1");
	By homePageSearch = By.id("globalsearch");
	By button_Filter_Modal = By.id("filter-button");
	By select_levelType_FilterDashBoard = By.id("userLevelTypeSelect");
	By select_level_FilterDashBoard = By.id("userLevelSelect");
	By button_Filter_submit = By.id("submitFilterAction");
	By button_Filter_cancel = By.id("dashboardFilterCancelButton");
	By disbursement_HistoryBoard = By.cssSelector("#loading_div > div > div:nth-child(3) > div>");
	
	
	
	
	public Page_DashBoard(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyLogin() {
		driver.findElement(homePageDashBoard).isDisplayed();
		
	}
	
}
