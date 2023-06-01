package Luma.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import Luma.AbstractComponents.ResuasbleElements;

public class Luma_ItemPage extends ResuasbleElements{
	
	
	WebDriver driver;
	public Luma_ItemPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="[id*=item-172]")
	WebElement size;
	
	@FindBy(xpath="//div[contains(@aria-labelledby,'color-93')]//div[1]")
	WebElement color;
	
	@FindBy(id="product-addtocart-button")
	WebElement cartBtnItem;
	
	public void finalAddToCart()
	{
		size.click();
		color.click();
		cartBtnItem.click();
	}
	
	
	
}
