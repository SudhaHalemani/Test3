package pagesforpatientpro;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	By registerbutton = By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension");
	
	public void clickregister() {
		driver.findElement(registerbutton).click();
	}
	
}
