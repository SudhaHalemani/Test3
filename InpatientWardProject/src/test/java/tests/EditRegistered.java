package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pagesforpatientpro.FindPatientRecordPage;
import pagesforpatientpro.LoginPage;

public class EditRegistered {

	  WebDriver driver;
		
		public EditRegistered(WebDriver driver) {
			this.driver=driver;
		}
		
		@Test
		public void  Login() throws InterruptedException {
			driver.get("https://qaiglobalinstitute.com/");
			driver.manage().window().maximize();
			Thread.sleep(50000);			
		}
		@Test
		public void EditFormTest() throws InterruptedException {
			FindPatientRecordPage ed= new FindPatientRecordPage(driver);
			
			ed.ClickOnFindP();
			ed.SearchPatient();
			ed.editp();
		}
		
}
