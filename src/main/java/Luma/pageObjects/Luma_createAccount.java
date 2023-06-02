package Luma.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.AbstractComponents.ResuasbleElements;

public class Luma_createAccount extends ResuasbleElements  {

	WebDriver driver;
	public Luma_createAccount(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="email_address")
	WebElement emailAddress;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="password-confirmation")
	WebElement passwordConfirmation;
	
	@FindBy(css=".action.submit.primary")
	WebElement createAccButton;
	
	public void createAccountAction(String fName,String lName, String email, String passwordValue) throws InterruptedException
	{
		
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		emailAddress.sendKeys(email);
		password.sendKeys(passwordValue);
		passwordConfirmation.sendKeys(passwordValue);
		createAccButton.click();
	}
	

}
