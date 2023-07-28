package Luma.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Luma.TestComponents.BaseTestLuma;
import Luma.jsonFilesParse.JsonToHashmap;
import Luma.pageObjects.Luma_ItemPage;
import Luma.pageObjects.Luma_LandingPage;
import Luma.pageObjects.Luma_ProductsPage;
import Luma.pageObjects.Luma_WishlistPage;
import Luma.pageObjects.Luma_homePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEndTest extends BaseTestLuma {
	
	
	@Test(dataProvider = "parameters", enabled =true)
	public void endToEnd1(HashMap<String,String> datas) throws InterruptedException {
		
		Luma_LandingPage lp=new Luma_LandingPage(driver);
		Luma_homePage hp=lp.signInMtd(datas.get("email"),datas.get("pass"));
		Luma_ProductsPage pp=hp.clickOnProducts();
		Luma_WishlistPage wp=pp.getProduct(datas.get("productName"));
		wp.hoverProduct();
		Luma_ItemPage ip=wp.cartBtnMtd();
		ip.finalAddToCart();
		
		
		
		
	}
	
	
	@Test
	public void subscribeNewsletters()
	{
		Luma_homePage hp=new Luma_homePage(driver);
		String successMsg=hp.subscribeNews("gouravbr13@gmail.com");
		Assert.assertEquals(successMsg, "Thanks you for your subscription.");
	}
	
	@DataProvider(name="parameters")
	public Object[][] allParameters() throws IOException
	{
		List<HashMap<String,String>> data=JsonToHashmap.hashmapConverter();
		return new Object[][] {{data.get(0)},{data.get(1)}};
	}
	
	

}
