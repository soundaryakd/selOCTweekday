package week4.day1;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;
	public class LearnParameters {
		
			public  static ChromeDriver driver;
			public static String fiName;
			@Parameters({"url","username","password"})
			@BeforeMethod
			public void login(String url,String uName, String pword) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			    driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElementById("username").sendKeys(uName);
				driver.findElementById("password").sendKeys(pword);
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				
				
			}
			@AfterMethod
			public void close() {
				driver.close();
				
			}
			
			

		}





