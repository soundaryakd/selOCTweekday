package week1.day4;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
			WebElement dd = driver.findElementById("createLeadForm_dataSourceId");
			Select dropDown=new Select(dd);
			dropDown.selectByVisibleText("Cold Call");
			//dropDown.getOptions();
			WebElement d = driver.findElementById("createLeadForm_marketingCampaignId");
			Select s=new Select(d);
			s.selectByValue("9002");
			WebElement d1 = driver.findElementById("createLeadForm_industryEnumId");
			Select s1=new Select(d1);
			s1.selectByIndex(3);
			WebElement d2 = driver.findElementById("createLeadForm_ownershipEnumId");
			Select s2=new Select(d2);
			List<WebElement> options = s2.getOptions();
			int size=options.size();
			s2.selectByIndex(size-1);
			
			
	}

}
