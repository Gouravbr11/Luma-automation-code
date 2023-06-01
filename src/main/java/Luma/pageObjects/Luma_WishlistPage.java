package Luma.pageObjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.AbstractComponents.ResuasbleElements;

public class Luma_WishlistPage extends ResuasbleElements {

	WebDriver driver;
	public Luma_WishlistPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(css=".product-image-photo")
	WebElement photo;
	
	@FindBy(xpath="//*[contains(@class,'tocart')]")
	WebElement cartBtn;
	
	
	public void hoverProduct()
	{
		Actions a=new Actions(driver);
		a.moveToElement(photo).build().perform();
	}
	
	public Luma_ItemPage cartBtnMtd()
	{
		cartBtn.click();
		Luma_ItemPage ip=new Luma_ItemPage(driver);
		return ip;
		
	}
	
	
	
	

}
