package Luma.AbstractComponents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResuasbleElements {
	
	
	WebDriver driver;
	public ResuasbleElements(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}



	public void hoverActions(WebElement hoverElement) {
		Actions a=new Actions(driver);
		a.moveToElement(hoverElement).build().perform();
	}
	
	public void scrollMtd( ) {
		
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	}

}
