package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnUserInteractions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
			driver.findElementById("username").sendKeys("demosalesmanager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			//driver.findElementById("ext-gen854").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
			driver.findElementById("createLeadForm_firstName").sendKeys("soundarya");
			driver.findElementById("createLeadForm_lastName").sendKeys("kadirvel");
			driver.findElementByClassName("smallSubmit").click();
	}

}
