package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends ProjectSpecificMethods {
	
	@Given("open Chrome Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		
	}
	@Given("Launch Url")
	public void launchUrl() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	@Given("Enter Username as (.*)")
	public void enter_Username_as_DemoSalesmanager(String uName) {
	    
		driver.findElementById("username").sendKeys(uName);
		
	}

	@Given("Enter Password as (.*)")
	public void enter_Password_as_crmsfa(String pword) {
		driver.findElementById("password").sendKeys(pword);
		
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify Homepage is Displayed")
	public void verify_Homepage_is_Displayed() {
	   System.out.println("home page is displayed");
	}
	@When("click on crmsfa link")
	public void clickOnLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@Then("Verify myhome page")
	public void myHomePage() {
		System.out.println("My home page is displayed");
	}
	

	@Then("Verify error message")
	public void verifyErrormessage() {
		System.out.println("password error");

	}

	
}
