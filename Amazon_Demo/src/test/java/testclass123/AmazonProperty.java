package testclass123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProperty {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\data\\Test\\AutoMation\\Selenium\\chromedriver.exe");
	File file = new File ("C:\\Java\\Amazon_Demo\\Amazon\\Amazon.properties");
	WebDriver driver = new ChromeDriver();
	Properties pro = new Properties();
	FileInputStream f=null;
	try {
		f= new FileInputStream (file);
	}
	catch (FileNotFoundException e){
	e.printStackTrace();
	}
	try {
	pro.load(f);
	}
	catch (IOException t) {
	t.printStackTrace();
	}
	finally {
	System.out.println("hi fhgjk");	
	}
	driver.get(pro.getProperty("url"));
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys((pro.getProperty("username")));
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys((pro.getProperty("passward")));
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();	
}
}
