package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/logout");
			driver.findElementById("username").sendKeys("demosalesmanager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			//driver.findElementById("ext-gen854").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
			driver.findElementByXPath("//span[text()='Phone']").click();
			//driver.findElementByXPath("//input[@style='width: 152px;' and @class='x-form-text x-form-field']").sendKeys("12");
			//driver.findElementByXPath("//input[id='ext-gen270']").sendKeys("12");
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("12");
			driver.findElementByXPath("//button[text()='Find Leads']").click();		
	}

}
