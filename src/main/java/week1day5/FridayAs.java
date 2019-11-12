package week1day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FridayAs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		//Enter Username
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		//Enter password
		driver.findElementById("password").sendKeys("leaf@12");
	    //Click login
		//Click on vendor and search vendor
		driver.findElementById("buttonLogin").click();
		//driver.findElementByClassName("btn btn-default btn-lg").click();
		//driver.findElementByLinkText("Search for Vendor").click();
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-default btn-lg']"))).click();
		/*driver.findElementByXPath("//button[@class='btn btn-default btn-lg']").click();
		driver.findElementByXPath("//a[@href='/vendors/search']").click();
		////enter vendor name
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		//search
		driver.findElementById("buttonSearch").click();
		//logout
		driver.findElementByClassName("navbar-toggle").click();
		driver.findElementByLinkText("Log Out").click();
		//close the browser
		driver.close();*/
		

	}

}
