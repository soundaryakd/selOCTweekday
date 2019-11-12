package week2.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		WebElement drag = driver.findElementByXPath("//li[text()='Item 1]'");
		WebElement drop = driver.findElementByXPath("(//li[text()='Item 4']");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();
}
}