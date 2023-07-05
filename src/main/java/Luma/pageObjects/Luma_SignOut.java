package Luma.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import Luma.AbstractComponents.ResuasbleElements;

public class Luma_SignOut extends ResuasbleElements{
	
	
	WebDriver driver;
	public Luma_SignOut(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="span[class='customer-name']")
	WebElement profileDrpdwn;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	WebElement signOutBtn;
	
	public void signOut() {
		profileDrpdwn.click();
		signOutBtn.click();
	}
	
	
	
}
