package pack123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeDemo {

public static void main(String[] args) throws IOException {
	
 System.setProperty("webdriver.chrome.driver", "F:\\data\\Test\\AutoMation\\Selenium\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 File file = new File ("C:\\Java\\ActiTime_Demo\\ActiTime\\ActitimeProperties");
  Properties pro=new Properties ();
 FileInputStream f=null;
 try {
	 f=new FileInputStream (file);
 }
 catch (FileNotFoundException e){
	 e.printStackTrace();
 }
 try {
	 pro.load(f);
 }
 catch (IOException e) {
  e.printStackTrace();
 }
 
 driver.get(pro.getProperty("url"));
 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(pro.getProperty("user"));
 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pro.getProperty("passward"));
 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
 File file1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 File r=new File("F:\\data\\Test\\AutoMation\\Selenium\\Study Material Selenium\\Screenshots\\login.jpg");
 org.openqa.selenium.io.FileHandler.copy(file1, r);
}
}
