package Pages;


import org.openqa.selenium.By;
import Pages.Obama;
import org.openqa.selenium.WebDriver;


public class SignIn {

public WebDriver driver;
	
	public SignIn(WebDriver driver){
		this.driver = driver;
	}

	public Obama toSearch(){
		driver.findElement(By.xpath("//input[@id='search-query']")).sendKeys("Obama");
		driver.findElement(By.xpath("//*[@id='global-nav-search']/span/button")).click();
	return new Obama(driver);
}
	


}
