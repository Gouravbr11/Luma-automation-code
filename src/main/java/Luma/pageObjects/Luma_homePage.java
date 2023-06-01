package Luma.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.AbstractComponents.ResuasbleElements;

public class Luma_homePage extends ResuasbleElements{

	WebDriver driver;
	public Luma_homePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='content bg-white']//span[2]")
	WebElement products;
	
	@FindBy(id="newsletter")
	WebElement newsSubsribe;
	
	@FindBy(css="button[class*='subscribe']")
	WebElement subscribeBtn;
	
	@FindBy(xpath="//*[@data-ui-id='message-success']")
	WebElement successMsg;
	
	
	public Luma_ProductsPage clickOnProducts() throws InterruptedException {
		products.click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Luma_ProductsPage pp=new Luma_ProductsPage(driver);
		return pp;
	}
	
	public String subscribeNews(String email) {
		newsSubsribe.sendKeys(email);
		subscribeBtn.click();
		
		return successMsg.getText();
	}
	
	

}
