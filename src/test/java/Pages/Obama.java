package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Obama {
	public WebDriver driver;

	public Obama(WebDriver driver) {
		this.driver = driver;
	}

	public Obama ToVideo() {
		driver.findElement(By.xpath("//*[@data-nav='search_filter_videos']")).click();

		return this;
	}

	/*public Trump trumpsearch (WebDriver driver){

		driver.findElement(By.xpath("//input[@id='search-query']")).sendKeys("Trump");
		driver.findElement(By.xpath("//*[@id='global-nav-search']/span/button")).click();
		return new Trump(driver);
	}*/

}
