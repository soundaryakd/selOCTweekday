package week3.day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Do not close me ']").click();
		Set<String> winSet = driver.getWindowHandles();
		ArrayList<String> winList = new ArrayList<String>(winSet);
		String parent = winList.get(0);
//		String secWin = winList.get(1);
//		String thirdWin = winList.get(2);
	     for (String st : winList) {
	    	 if(st!=parent) {
	    		 driver.switchTo().window(st).close();
	    	 }
			
		}
		//String title = driver.switchTo().window(secWin).getTitle();
		//System.out.println(title);
//		driver.switchTo().window(secWin).close();
//		driver.switchTo().window(thirdWin).close();
//		
	}

}
