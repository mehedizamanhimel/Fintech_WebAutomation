package pages.Instafin.Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Create_Individual {

	WebDriver driver;

	// Elements of Create section
	By buttonCreateMainfromMenu = By.cssSelector("i[class='fa fa-plus-square-o']");

	// Elements of SubsectionsHeader
	By buttonIndividualMain = By.cssSelector("a[href='/client/individual/create']");
	
	
	
	public Page_Create_Individual (WebDriver driver) {
		this.driver = driver;
	}
	
	public void open_Individual_Section() {
		driver.findElement(buttonIndividualMain).click();
	}


}
