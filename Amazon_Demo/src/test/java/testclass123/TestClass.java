package testclass123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginPage;

public class TestClass 
{
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "F:\\data\\Test\\AutoMation\\Selenium\\Study Material Selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/ap/signin");
	
	driver.manage().window().maximize();
	
	LoginPage loginpage = new LoginPage(driver);
	
	loginpage.mobileNumber();
	loginpage.continuebutton();  
	loginpage.passward();
	loginpage.signInSubmit();
	}
	
}
