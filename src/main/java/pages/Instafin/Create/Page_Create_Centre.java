package pages.Instafin.Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Create_Centre {


	WebDriver driver;

	// Elements of Create section
	By buttonCreateMainfromMenu = By.cssSelector("i[class='fa fa-plus-square-o']");

	//// Elements of SubsectionsHeader
	By buttonCentreMain = By.cssSelector("a[href='/centre/create']");
	
	public Page_Create_Centre (WebDriver driver) {
		this.driver = driver;
	}

}
