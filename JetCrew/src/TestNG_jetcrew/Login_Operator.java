package TestNG_jetcrew;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Login_Operator {
	private WebDriver driver;
	private String BaseUrl;
	
  @Test
  public void f() throws InterruptedException {
		PageFactory.OpenLoginForm(driver);
		Thread.sleep(5000);
		PageFactory.FillInEmailField(driver, "test11094@gmail.com");
		Thread.sleep(5000);
		PageFactory.FillInPasswordField(driver, "123456");
		
		
		PageFactory.ClickOnLoginButton(driver);
		Thread.sleep(4000);	 
  
		WebElement mainelement = driver.findElement(By.xpath("html/body/div[4]/header/div/div[2]/nav/ul/li[7]/span/a"));
		Actions action = new Actions(driver);
		action.moveToElement(mainelement).perform();
		Thread.sleep(4000);
		WebElement subelement = driver.findElement(By.xpath("html/body/div[4]/header/div/div[2]/nav/ul/li[7]/ul/li[4]/a"));
		action.moveToElement(subelement).click().perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	  BaseUrl = "http://devjetcrew:jetcrew100@dev.jetcrew.co/";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Moving to base URL
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(BaseUrl);
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
