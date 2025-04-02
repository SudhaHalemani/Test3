package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesforpatientpro.LoginPage;

public class InpatientWithSelenium {

    WebDriver driver;
    LoginPage lp;
	
	public InpatientWithSelenium(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@BeforeMethod
	public void Login() throws InterruptedException {
		driver.get("https://qaiglobalinstitute.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);			
	}
	
	@Test
	public void LoginWithInvalidCreds() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.UserMethod("admin");
		lp.PasswordMethod("Admin123");
		lp.LocationMethod();
		lp.clickLoginbtn();	
		String emsg = "Invalid username/password. Please try again.";
		String em = lp.ErrorMessage();
		Assert.assertEquals(em, emsg);
		
	}
	
	@Test
	public void LoginWithBlankCreds() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.clickLoginbtn();	
		
		String emsg = "Invalid username/password. Please try again.";
		String em = lp.ErrorMessage();
		Assert.assertEquals(em, emsg);
	}
	
	@Test
	public void LoginWithValidCreds() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.UserMethod("admin");
		lp.PasswordMethod("Admin123");
		lp.LocationMethod();
		lp.clickLoginbtn();	
		
		String logouttext = driver.findElement(By.linkText("Logout")).getText();
		Assert.assertEquals(logouttext,"Logout");
	}
	
}
