package week1.assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Weekend {
	public static void main(String[] args) throws InterruptedException {	

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("soundarya");
		driver.findElementById("createLeadForm_lastName").sendKeys("kadirvel");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Divya");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kadirvel");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("*****");
		WebElement d = driver.findElementById("createLeadForm_dataSourceId");
		Select s=new Select(d);
		s.selectByIndex(4);
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Miss");
		driver.findElementByName("annualRevenue").sendKeys("10000000");
		WebElement d1 = driver.findElementById("createLeadForm_industryEnumId");
		Select s1=new Select(d1);
		s1.selectByIndex(6);
		WebElement d2 = driver.findElementByName("ownershipEnumId");
		Select s2=new Select(d2);
		s2.selectByIndex(3);
		driver.findElementById("createLeadForm_sicCode").sendKeys("***");
		driver.findElementById("createLeadForm_description").sendKeys("Testing");
		driver.findElementById("createLeadForm_importantNote").sendKeys("&%&%&%");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("03");
		driver.findElementByName("primaryPhoneExtension").sendKeys("0422");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Department");
		WebElement d3 = driver.findElementById("createLeadForm_currencyUomId");
		Select s3=new Select(d3);
		List<WebElement> w = s3.getOptions();
		int size=w.size();
		s3.selectByIndex(size-11);
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("#%*@");
		driver.findElementByName("primaryPhoneAskForName").sendKeys("Manager");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
		driver.findElementByName("generalToName").sendKeys("@@@@");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("2,Bharathi Street");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("veerakeralam");
		driver.findElementByName("generalCity").sendKeys("Coimbatore");
		WebElement d4 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select s4=new Select(d4);
		s4.selectByIndex(3);
		WebElement d5 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select s5=new Select(d5);
		s5.selectByVisibleText("India");
		driver.findElementByName("generalPostalCode").sendKeys("641007");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("641007");
		WebElement d6 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select s6=new Select(d6);
		s6.selectByIndex(2);
		WebElement d7 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select s7=new Select(d7);
		s7.selectByIndex(4);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("4833255");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("soundaryak398@gmail.com");
		driver.findElementByClassName("smallSubmit").click();
		
		
		
}}
