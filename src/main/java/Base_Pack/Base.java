package Base_Pack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static  WebDriver Driver;
	@BeforeMethod
	public void Invoke_Browser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver1.exe");
		
		Driver	=new ChromeDriver();
		Driver.get("https://www.seleniumeasy.com/");
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		
		
	}
	
	
}
