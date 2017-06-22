package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	
	/*public void toSignUp(){
		
		
	}*/
	
	// test c0mment
	
	  
	public SignIn toLogin(){
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Phone, email or username']")).sendKeys("rakibnissan@gmail.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("rakib@nissan");
		driver.findElement(By.xpath("//*[@type='submit'][@value='Log in']")).click();
	
	
		return new SignIn(driver);
	}
	
	
	
	public Obama toSearch(){
		driver.findElement(By.xpath("//input[@id='search-query']")).sendKeys("Obama");
		driver.findElement(By.xpath("//*[@id='global-nav-search']/span/button")).click();
	return new Obama(driver);
}

}
