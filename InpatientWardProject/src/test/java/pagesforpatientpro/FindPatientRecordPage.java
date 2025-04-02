package pagesforpatientpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindPatientRecordPage {

	WebDriver driver;   
	
	public FindPatientRecordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By findp = By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension");
	By searchp = By.id("patient-search");
	By editpatient = By.id("edit-patient-demographics");
	By givenname = By.name("givenName");
	By saveform = By.id("save-form");
	
	public void ClickOnFindP() {
		driver.findElement(findp).click();
	}
	
	public void SearchPatient() throws InterruptedException {
		driver.findElement(searchp).sendKeys("Anu");
		Thread.sleep(50000);
		driver.findElement(By.cssSelector("tr[class='odd'] td:nth-child(1)")).click();
		Thread.sleep(50000);
	}
	
	public void editp() {
		driver.findElement(editpatient).click();
		driver.findElement(givenname).sendKeys("Anu111");
		driver.findElement(saveform);
	}
	
}
