package Luma.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import Luma.AbstractComponents.ResuasbleElements;

public class Luma_LandingPage extends ResuasbleElements{
	
	
	WebDriver driver;
	public Luma_LandingPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css=".authorization-link [href*='login']")
	WebElement signIn;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="send2")
	WebElement signInBtn;
	
	
	@FindBy(xpath ="(//ul//li)[3]")
	WebElement createLink;
	
	public Luma_createAccount create_accLink() {
		createLink.click();
		Luma_createAccount crAcc=new Luma_createAccount(driver);
		return crAcc;
	}
	
	
	



	public Luma_homePage signInMtd(String emailId, String passw) {
		signIn.click();
		email.sendKeys(emailId);
		password.sendKeys(passw);
		signInBtn.click();
		Luma_homePage hp=new Luma_homePage(driver);
		return hp;
	}

}
