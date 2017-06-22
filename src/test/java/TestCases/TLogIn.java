package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.HomePage;


public class TLogIn {
		
	WebDriver driver = new FirefoxDriver();

	@Test
	public void twitterLogIn(){
		driver.get("https://twitter.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage Hp = new HomePage(driver);
		Hp.toLogin();
		driver.close();
	}
	
	

}
