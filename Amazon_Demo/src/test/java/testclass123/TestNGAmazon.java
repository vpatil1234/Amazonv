package testclass123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.LoginPage;

public class TestNGAmazon 
{	
	WebDriver driver;	
	LoginPage a = new LoginPage(driver);
	@BeforeMethod 
	public void loginpage(){
	System.setProperty("webdriver.chrome.driver", "F:\\data\\Test\\AutoMation\\Selenium\\Study Material Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?showRememberMe=true&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=4QRF1GQ0FSP6REGPJSHG&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=eyJjaXBoZXIiOiJKYW9WbElQMklVQjd5c2J4Z05JWDFnPT0iLCJ2ZXJzaW9uIjoxLCJJViI6IlkyZThwaEJ0aDV2VGo3TG5yY3NqU0E9PSJ9&failedSignInCount=0&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1645217975000");
	}
	@Test 
	public void testamazon() throws InterruptedException {
	Thread.sleep(2000);
	a.mobileNumber();
	a.continuebutton();
	a.passward();
	a.signInSubmit();		
	}
}




