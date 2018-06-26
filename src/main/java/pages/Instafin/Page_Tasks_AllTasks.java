package pages.Instafin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Tasks_AllTasks {
	
	WebDriver driver;
	By menu_task_mainButton = By.cssSelector("li:nth-child(4) > a > span");
	By allTasks = By.cssSelector("a[href='/tasks']");
	By create_task = By.xpath("//A[@class='submenu'][text()='Create Task']");
	By button_cancel_createTask = By.cssSelector("button[type='button']");
	
	
	public Page_Tasks_AllTasks(WebDriver driver) {
		this.driver = driver;
	}

	public void Open_AllTasks() {
		driver.findElement(allTasks).click();
	}
	
	public void Open_CreateTask() {
		driver.findElement(create_task).click();
	}

	public void Click_Task_mainMenu_button() {
		driver.findElement(menu_task_mainButton).click();
	}
	
}
