package week2.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/drop.html");
	WebElement drag = driver.findElementById("draggable");
	WebElement drop = driver.findElementById("droppable");
	Actions builder=new Actions(driver);
	builder.dragAndDrop(drag, drop).perform();
	
	
}
}
