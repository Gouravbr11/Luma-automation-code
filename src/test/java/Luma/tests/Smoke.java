package Luma.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Luma.TestComponents.BaseTestLuma;
import Luma.pageObjects.Luma_LandingPage;
import Luma.pageObjects.Luma_SignOut;
import Luma.pageObjects.Luma_createAccount;
import Luma.pageObjects.Luma_homePage;

public class Smoke extends BaseTestLuma{
	
	Luma_LandingPage lp;
	Luma_createAccount crAcc;
	Luma_SignOut lsignout;
	//create account 
	@Test(dataProvider = "createAccInputs",groups= {"smoke"})
	public void create_account(String fName,String lName, String email, String passwordValue ) throws InterruptedException 
	{
		 lp=new Luma_LandingPage(driver);
		 crAcc=lp.create_accLink();
		crAcc.createAccountAction(fName, lName, email, passwordValue);
	}
	
	@DataProvider(name="createAccInputs")
	public Object[][] createAccDatas()
	{
		return new Object[][] {{"fafa","duplesisa","fafaduplesisa@gmail.com","Password123"},{"fafb","duplesisb","fafbduplesisb@gmail.com","Password123"}};
	}
	
	@Test(groups= {"smoke"})
	public void signOut() throws InterruptedException {
		 lp=new Luma_LandingPage(driver);
		lp.signInMtd("gouravgod09@gmail.com","zhCKb84!EBpWzdY");
		Thread.sleep(4000);
		lsignout.signOut();
		
	}

}
