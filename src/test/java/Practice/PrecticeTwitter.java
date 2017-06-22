package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.HomePage;
import Pages.Obama;

public class PrecticeTwitter {
	

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://twitter.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage hp = new HomePage(driver);
		hp.toLogin();
		Obama o = hp.toSearch();
		o.ToVideo();
		o.trumpsearch(driver);
	}

}
