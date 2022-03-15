package pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.ApplicationHeaderPage;
import pom.LoginPage;

public class ActiTime_TestNg {

WebDriver driver;
 //LoginPage loginpage;
@BeforeMethod
public void loginpage()
{
	System.setProperty("webdriver.chrome.driver", "F:\\data\\Test\\AutoMation\\Selenium\\Study Material Selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://localhost:8083/login.do"); 
}
@Test
public void login(WebDriver driver)
{
	
	LoginPage loginPage=new LoginPage(driver); 
	loginPage.sendUserName();
	loginPage.sendPasswordName();
	loginPage.ClickOnkeepMeLogin();  
}
@Test
public void headerpage(WebDriver driver) throws InterruptedException
{
	ApplicationHeaderPage t=new ApplicationHeaderPage(driver);  
	t.clickonreports();
	t.clickonusers();
	t.clickonworkSchdule();
	
}
@AfterMethod
public void close(WebDriver driver)
{
	driver.close();
}
}
