import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnListBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement id = driver.findElementById("dropdown1");
		Select nl=new Select(id);
		nl.selectByIndex(3);
		WebElement id1 = driver.findElementByName("dropdown2");
		Select nl1=new Select(id1);
		nl1.selectByVisibleText("Selenium");
		WebElement id2 = driver.findElementByName("dropdown3");
		Select nl2=new Select(id2);
	    nl2.selectByValue("3");
	    WebElement id3 = driver.findElementByClassName("dropdown");
		Select nl3=new Select(id3);
		List<WebElement> options = nl3.getOptions();
		int size=options.size();
		nl3.selectByIndex(size-1);
		
		

	}

}
