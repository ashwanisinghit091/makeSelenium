package pageIObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
public static WebDriver Driver;
	public HomePage(WebDriver Driver){
		
		
		this.Driver=Driver;
	}
	
	
	static By Search=By.cssSelector(".input-group input");
	
	 static By Scope=By.cssSelector(".tabbable-line");
	 static By  Selenum_Java  =By.xpath("//a/h2[text()='Selenium Java']");
	 static By Links= By.xpath("//div[@class='item-list']/ul/li");
	 static By Protactor=By.xpath("//a/h2[text()='Protractor Tutorials']");
	 static By Selenium_Python=By.xpath("//a/h2[text()='Selenium Python']");
	
	
	
	public static WebElement Scope() {
		return 	Driver.findElement(Scope);}
	
	
	public static WebElement Protactor(WebElement wb) {
		return 	wb.findElement(Protactor);}
	
	public static WebElement Selenium_Python(WebElement wb) {
		return 	wb.findElement(Selenium_Python);}
	

	

	public static  WebElement Selenum_Java(WebElement wb) {
		return 	wb.findElement(Selenum_Java);}
	
	public static List<WebElement> Selenum_Javas(WebElement wb) {
		return 	wb.findElements(Selenum_Java);}
	

	public static  List<WebElement> Links(WebElement wb) {
		return 	wb.findElements(Links);}
	
	public static  WebElement Search() {
		return 	Driver.findElement(Search);}
	
	
	
}
