package Luma.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import Luma.pageObjects.Luma_LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestLuma {
	
	protected WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//Luma//Files//All.properties");
	p.load(fis);
	String browserName=p.getProperty("browser");
	
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	}
	else
	{
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	return driver;
	}
	
	@BeforeTest(alwaysRun = true)
	public void launchUrl() throws IOException
	{
		
		driver=initializeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	
	
}
