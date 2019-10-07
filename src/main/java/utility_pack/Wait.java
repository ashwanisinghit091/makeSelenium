package utility_pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	
	
	public static void hold(WebDriver Driver,WebElement we) {
		
		
		WebDriverWait wait=new WebDriverWait(Driver,15);
		wait.until(ExpectedConditions.visibilityOf(we));
	}

	
	public static void hold1(WebDriver Driver,By we) {
		
		
		WebDriverWait wait=new WebDriverWait(Driver,15);
		wait.until(ExpectedConditions.textToBe(we, "Examples with xpath and Css (ID, Name, Text and Links)"));
	}	
	
}
