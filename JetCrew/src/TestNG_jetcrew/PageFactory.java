package TestNG_jetcrew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageFactory {
public static WebElement element = null;
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	
	public static WebElement Loginlink(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='f-right responsive-nav']//a[contains(text(),'Log In')]"));
		return element;
	}
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	
	public static WebElement EmailInput(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@id='login-form']//input[contains(@name,'email')]"));
		return element;
	}
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	
	public static WebElement PasswordInput(WebDriver driver){
		element = driver.findElement(By.id("logpassword"));
		return element;
	}
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	
	public static WebElement LoginButton(WebDriver driver){
		element = driver.findElement(By.id("btnLogin"));
		return element;
	}
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	
	public static WebElement LoginNavigation(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[4]/header/div/div[2]/nav/ul/li[6]/span/a"));
		return element;
	}
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	
	
	public static WebElement LogoutLink(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/div[4]/header/div/div[2]/nav/ul/li[6]/ul/li[4]/a"));
		return element;
	}
	
	
	/*//Finding the LoginLink
	@FindBy(xpath="//div[@class='f-right responsive-nav']//a[contains(text(),'Log In')]")
	WebElement LoginLink;
	
	//Finding the Email input field
	@FindBy(id="email")
	WebElement EmailInput;
	
	//Finding the Passworf input field
	@FindBy(id="logpassword")
	WebElement PasswordInput;
	
	//Finding Login button
	@FindBy(id="btnLogin")
	WebElement LoginButton;
	
	//Finding User navigation link
	@FindBy(xpath="//div[@class='new-nav']//span[contains(@class,'inner-mega')]//a")
	WebElement LoginNavigation;
	
	//Finding Logout link
	@FindBy(xpath="//div[@class='container']//ul[contains(@class,'rit-menu')]//li[4]/a")
	WebElement LogoutLink;*/

	
	/*public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/

/*	//Clicking on Login link to open Login form
	public void clickLogInForm() {
		LoginLink.click();
	}
	
	//Clear email input field and enter Email
	public void EmailInput() {
		EmailInput.clear();
		EmailInput.sendKeys("test1109@gmail.com");
	}
	
	//Clear password input field and enter Password
	public void PasswordInput() {
		PasswordInput.clear();
		PasswordInput.sendKeys("123456");
	}
	
	//Click on Login button
	public void LoginButton() {
		LoginButton.click();
	}
	
	public void LoginNav(String LoginNavigataion) {
		
	}
	
	public void LogOut() {
		
	}*/
	
	/**
	 * Click on search button
	 * @param driver
	 */

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void FillInEmailField(WebDriver driver, String origin) {
		element = EmailInput(driver);
		element.clear();
		element.sendKeys(origin);
		
	}
	/**
	 * Click on search button
	 * @param driver
	 */
	
	public static void FillInPasswordField(WebDriver driver, String origin) {
		element = PasswordInput(driver);
		element.clear();
		element.sendKeys(origin);
	}
	/**
	 * Click on search button
	 * @param driver
	 */
	
	public static void ClickOnLoginButton(WebDriver driver) {
		element = LoginButton(driver);
		element.click();
	}
	
	/**
	 * Click on search button
	 * @param driver
	 */
	
	public static void MoveToMenu(WebDriver driver) {
		Actions action = new Actions (driver);
		element = LoginNavigation(driver);
		action.moveToElement(element).perform();
	}
	
	/**
	 * Click on search button
	 * @param driver
	 */
	
	public static void Logout(WebDriver driver) {
		Actions action = new Actions (driver);
		element = LogoutLink(driver);
		action.moveToElement(element).click().perform();
	}

	public static void OpenLoginForm(WebDriver driver) {
		element = Loginlink(driver);
		element.click();
		
	}
}

