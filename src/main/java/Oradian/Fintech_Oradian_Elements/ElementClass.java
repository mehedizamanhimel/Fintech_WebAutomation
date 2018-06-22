package Oradian.Fintech_Oradian_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementClass {

	@FindBy(css ="input[id='us1']")
	WebElement userNameField;
	
	@FindBy(name ="pw1")
	WebElement passwordField;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/form/fieldset/button")
	WebElement loginButton;

	public void Login_To_Oradian() {
		
		userNameField.sendKeys("mehedi");
		passwordField.sendKeys("kreso123!");
		loginButton.click();
	}

}
