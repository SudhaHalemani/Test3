package pagesforpatientpro;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import Pages.HomePage;

public class RegisterPage {

	 WebDriver driver;
	    String errormsg;
		
		public RegisterPage(WebDriver driver) {
			this.driver = driver;
		}
	
	By givenname = By.name("givenName");
	By familyname = By.name("familyName");
	By nextbtn = By.id("next-button");
	By birthdayfield = By.id("birthdateDay-field");
	By monthfield = By.id("birthdateMonth-field");
	By yearfield = By.id("birthdateYear-field");
	By add1 = By.id("address1");
	By phoneno = By.name("phoneNumber");
	By relationship = By.id("relationship_type");
	By personname = By.xpath("//input[@placeholder='Person Name']");
	By submitbtn = By.id("submit");
	By subconfirm = By.id("coreapps-showContactInfo");
	
	public void RegisterAPatiant() {
		//driver.findElement(registerbutton).click();
		HomePage h = new HomePage(driver);
		//HomePage hp = new HomePage(driver);
		h.clickregister();
		driver.findElement(givenname).sendKeys("Anu");
		driver.findElement(familyname).sendKeys("Anu11");
		driver.findElement(nextbtn).click();
		WebElement gernder = driver.findElement(By.name("gender"));
		Select date = new Select(gernder);
		date.selectByValue("F");
		driver.findElement(nextbtn).click();
		driver.findElement(birthdayfield).sendKeys("1");
		driver.findElement(monthfield).click();
		WebElement months = driver.findElement(monthfield);
		Select month = new Select(months);
		date.selectByValue("1");
		
		driver.findElement(yearfield).sendKeys("1990");		
		driver.findElement(nextbtn).click();
		
		driver.findElement(add1).sendKeys("add11");
		driver.findElement(nextbtn).click();
		
		driver.findElement(phoneno);
		driver.findElement(nextbtn).click();
		
		WebElement relationshiptypes = driver.findElement(relationship);
		Select re = new Select(relationshiptypes);
		re.selectByValue("8d919b58-c2cc-11de-8d13-0010c6dffd0f-A");
		driver.findElement(personname).sendKeys("aabbcc");			
		driver.findElement(submitbtn).click();
		
		String str = driver.findElement(subconfirm).getText();
		Assert.assertEquals(str, "Hide Contact Info");		
	}
}
