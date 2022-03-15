package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage 
{
	private WebDriver driver;
	@FindBy (xpath="//a[@class='content tt_selected selected']")
	private WebElement timeTrack;
	

	@FindBy (xpath="//a[@class='content tasks']")
	private WebElement tasks;
	
	@FindBy (xpath="//a[@class='content reports']")
	private WebElement reports;
	

	@FindBy (xpath="//a[@class='content users']")
	private WebElement users;
	

	@FindBy (xpath="//a[@class='content calendar']")
	private WebElement workSchdule;
	
	public ApplicationHeaderPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this); 
	this.driver=driver;
    }
	
	public void  clickonreports() {
	reports.click();	
	}
	public void  clickonusers() {
	users.click();	
	}
	public void  clickonworkSchdule() {
	workSchdule.click();	
	}
}
