package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("soundaryak@gmail.com");
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input").sendKeys("Append");
	    driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input").sendKeys("TestLeaf");
	    driver.findElementByXPath("//input[@value='Clear me!!']").clear();
	    boolean enabled = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input").isEnabled();
	    if(enabled==true) {
	    	System.out.println("Edit field is enabled");
	    }
	    else {
	    	System.out.println("Edit field is disbled ");
	    }
	}
	

}
