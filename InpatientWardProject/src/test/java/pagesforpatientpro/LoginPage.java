package pagesforpatientpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    String errormsg;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//By username = By.id("username");
	//By password = By.id("password");
	//By location = By.id("Inpatient Ward");
	By errormessage = By.id("error-message");
	By loginbtn = By.id("loginButton");
	
	public void UserMethod(String user) {
		By username = By.id("username");
		driver.findElement(username).sendKeys(user);					
	}
	
	public void PasswordMethod(String pass) {
		By password = By.id("password");
		driver.findElement(password).sendKeys(pass);					
	}
	
	public void LocationMethod() {
		By location = By.id("location");
		driver.findElement(location).click();			
	}
			
	public void clickLoginbtn() {
		driver.findElement(loginbtn).click();
	}
	
	public String ErrorMessage() {
		return errormsg = driver.findElement(errormessage).getText();
	}
}
