package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement mobileNumber;

	@FindBy (xpath="//input[@id='continue']")
	private WebElement continuebutton;

	@FindBy (xpath="//input[@id='ap_password']")
	private WebElement passward;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
    private WebElement signInSubmit;
	
	public LoginPage (WebDriver driver) 
	{
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	public void mobileNumber(){
	mobileNumber.sendKeys("9130062542");
	}
	public void continuebutton(){
	continuebutton.click();
	}
	public void passward(){
	passward.sendKeys("vishAL@1235");
	}
	public void signInSubmit12(){
	signInSubmit.click();
	}
}	

