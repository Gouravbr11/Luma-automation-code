package Luma.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Luma.TestComponents.BaseTestLuma;
import Luma.pageObjects.Luma_LandingPage;
import Luma.pageObjects.Luma_createAccount;
import Luma.pageObjects.Luma_homePage;

public class Smoke extends BaseTestLuma{
	
	Luma_LandingPage landPage;
	Luma_createAccount crAcc;
	//create account 
	@Test(dataProvider = "createAccInputs")
	public void create_account(String fName,String lName, String email, String passwordValue ) throws InterruptedException 
	{
		 landPage=new Luma_LandingPage(driver);
		 crAcc=landPage.create_accLink();
		crAcc.createAccountAction(fName, lName, email, passwordValue);
	}
	
	@DataProvider(name="createAccInputs")
	public Object[][] createAccDatas()
	{
		return new Object[][] {{"fafa","duplesisa","fafaduplesisa@gmail.com","Password123"},{"fafb","duplesisb","fafbduplesisb@gmail.com","Password123"}};
	}

}
