package NetflixLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NetflixLoginPage {
	
		  private WebDriver driver;
		  private String baseUrl;
		  private boolean acceptNextAlert = true;
		  private StringBuffer verificationErrors = new StringBuffer();

		  
		@BeforeMethod
		public void setUp() throws Exception {
			  
	        System.setProperty("webdriver.chrome.driver", "C://Users/Ben Karn/Desktop/New folder/chromedriver.exe");
		    driver = new ChromeDriver();
		    baseUrl = "https://www.netflix.com/";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }

		  @Test
		  public void testUntitled2() throws Exception {
		   // driver.get(baseUrl + "/");
		    //driver.manage().window().maximize();
		    //AssertJUnit.assertEquals("Netflix - Watch TV Shows Online, Watch Movies Online", driver.getTitle());
		   // driver.findElement(By.linkText("Sign In")).click();
		    //AssertJUnit.assertEquals("Netflix", driver.getTitle());
		    
		    NetflixLogin testNestflixLogin = new NetflixLogin(driver);
		    testNestflixLogin.LaunchTheWebsite();
		    testNestflixLogin.ClickOnSignInLink();
		    testNestflixLogin.ProvideUserInfo();
		    
		    
		    
		    
		    
		   // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		    //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc");
		    //driver.findElement(By.xpath("//button[contains(.,'Sign In')]")).click();
		    driver.quit();
		  }
		  
		  
		  
		  
		  
		  @Test
		  public void testanotherone() {
			  
		  }

		  
		@AfterMethod
		public void tearDown() throws Exception {
		    driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      Assert.fail(verificationErrorString);
		    }
		  }

		  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

		  private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }

		  private String closeAlertAndGetItsText() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
	}
		
