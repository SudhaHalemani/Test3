package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import pagesforpatientpro.LoginPage;

public class Register {


    WebDriver driver;
    LoginPage lp;
	
	public Register(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@Test
	public void  Login() throws InterruptedException {
		driver.get("https://qaiglobalinstitute.com/");
		driver.manage().window().maximize();
		Thread.sleep(50000);			
	}
	
	@Test 
	public void registerTestmethod() {
		Register r = new Register(driver);
		r.RegisterAPatiant();
	}
	
	
}
