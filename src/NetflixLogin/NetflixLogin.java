package NetflixLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NetflixLogin extends BaseClass{
	
	public NetflixLogin(WebDriver driver) {
		super(driver);
	}
	
	
	public NetflixLogin ProvideUserInfo() throws Exception{
		
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc");
		 WebElement e =   driver.findElement(By.xpath("//button[contains(.,'Sign In')]"));
		    
		    Actions a = new Actions(driver);
		    a.doubleClick(e);
		    a.build();
		    a.perform();
		 
		    
		   return new NetflixLogin(driver);
		
	}

	public NetflixLogin LaunchTheWebsite() {
		driver.get("https://www.netflix.com");
		
		return new NetflixLogin(driver);
	
	
	}
	
	public NetflixLogin ClickOnSignInLink() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		return new NetflixLogin(driver);
	}
	
	
	
	
	
	
}
