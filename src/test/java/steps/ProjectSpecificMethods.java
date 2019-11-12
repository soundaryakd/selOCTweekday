package steps;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	public void closeBrowser() {
		driver.close();

	}

}
