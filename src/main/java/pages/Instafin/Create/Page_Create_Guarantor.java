package pages.Instafin.Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Create_Guarantor {
	WebDriver driver;
	
	//Elements of Create section
	By buttonCreateMainfromMenu = By.cssSelector("i[class='fa fa-plus-square-o']");
	By buttonGeneratorMain = By.cssSelector("a[href='/guarantor/create']");
	
	public Page_Create_Guarantor(WebDriver driver) {
		this.driver = driver;
	}

	public void open_Generator_Section() {
		driver.findElement(buttonGeneratorMain).click();
	}
	
	
}
