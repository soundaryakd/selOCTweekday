package week2.day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		Actions builder= new Actions(driver);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform();
	}

}
