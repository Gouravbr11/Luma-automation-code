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

public class Luma_ProductsPage extends ResuasbleElements{

	WebDriver driver;
	public Luma_ProductsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="ol[class='products list items product-items']")
	List<WebElement> allprod;
	
	@FindBy(css=".action.towishlist")
	WebElement wishlist;
	
	
	
	
	By nameLink=By.cssSelector(".product-item-link");
	By photo=By.cssSelector(".product-image-photo");
	
	public Luma_WishlistPage getProduct(String prodName) throws InterruptedException
	{
		
		WebElement prodCard=allprod.stream().filter(p->p.findElement(nameLink).getText().equals(prodName)).findFirst().orElse(null);
		WebElement image=prodCard.findElement(photo);
		Actions a=new Actions(driver);
		a.moveToElement(image).build().perform();
		//hoverActions(image);
		Thread.sleep(2000);
		wishlist.click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Luma_WishlistPage wp=new Luma_WishlistPage(driver);
		return wp;
		
	}

}
