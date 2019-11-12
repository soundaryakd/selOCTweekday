package week1.day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.findElementByXPath("//button[@id='home']").click();
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		Point location = driver.findElementByXPath("//button[@id='position']").getLocation();
		System.out.println(location);
		String cssValue = driver.findElementByXPath("//button[@id='color']").getCssValue("color");
		System.out.println(cssValue);
		Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
		System.out.println(size);
	}

}
