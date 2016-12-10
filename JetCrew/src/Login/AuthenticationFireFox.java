package Login;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AuthenticationFireFox {
   public static void main(String[] args) throws IOException {
	WebDriver driver;
	String BaseUrl;
	BaseUrl = "http://dev.jetcrew.co/";
	
	//Opening FireFoxDriver
	driver = new FirefoxDriver();
	//Maximizing browsers window 
	driver.manage().window().maximize();
	
	//Running script to go through authentication
	Runtime.getRuntime().exec("C:\\Users\\Aleksandr\\JetCrew\\authentication.exe");
	
	//Moving to base URL
	driver.get(BaseUrl);
   }
}
