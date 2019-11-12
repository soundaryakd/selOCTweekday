package week4.day1;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


		public class CreateLead extends LearnParameters {
			@BeforeClass
			public void data() {
			 fiName = "CreateLead";
			}
			
			@Test(dataProvider="fetchData")

			public  void runCreateLead(String cmpName, String fName, String lName) {
				
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementById("createLeadForm_companyName").sendKeys(cmpName);
				driver.findElementById("createLeadForm_firstName").sendKeys(fName);
				driver.findElementById("createLeadForm_lastName").sendKeys(lName);
				driver.findElementByName("submitButton").click();
				
		}
			/*@DataProvider(name="fetchData")
			public String[][] setData(){
				String[][] data=new String[2][3];
				data[0][0]="TestLeaf";
				data[0][1]="Soundarya";
				data[0][2]="Kadirvel";
				data[1][0]="CTS";
				data[1][1]="Divya";
				data[1][2]="Kadirvel";
				return data;*/
				
			}
			
			
		










