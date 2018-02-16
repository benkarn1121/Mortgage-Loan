package FairLoanCredit;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class LoanOption  {
	

	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C://Users/Ben Karn/Desktop/New folder/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    baseUrl = "https://www.guaranteedrate.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitled2() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.manage().window().maximize();
	    assertEquals("Mortgages, Loans, Home Buying, Refinance Mortgage Company | Guaranteed Rate", driver.getTitle());
	    driver.findElement(By.linkText("Explore loan options")).click();
	    assertEquals("Guaranteed Rate", driver.getTitle());
	    
	    driver.findElement(By.xpath("//button[contains(.,'I want to buy a home')]")).click();
	    driver.findElement(By.xpath("//button[contains(.,'Home to live in')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(.,'Single family home')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='Zipcode']")).sendKeys("60008");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
	    driver.findElement(By.xpath("//button[contains(.,'20+Years')]")).click();
	    driver.findElement(By.xpath("//input[@id='PurchasePrice']")).sendKeys("300000");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='DownPayment']")).sendKeys("25000");
	    driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
	    driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(.,'No')]")).click();
	    driver.findElement(By.xpath("//button[contains(.,'Lowest interest rate')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(.,'Fair(580 - 639)')]")).click();
	    driver.findElement(By.xpath("//button[contains(.,'No')]")).click();
	    Thread.sleep(3000);
	    
	    
	    if(driver.getPageSource().contains("Here are your personalized results"))
	    {
	    	System.out.println("Text Present");
	    }
	    else 
	    {
	    	System.out.println("Text not Present");
	    }
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
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
