package Locators;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public static WebDriver Driver;
	
	public static WebElement wb;
	public Home_Page(WebDriver Driver){
		
		this.Driver=Driver;
		PageFactory.initElements(Driver, this.Driver);
	}
	

	
	@FindBy(css=".tabbable-line")
	WebElement Scope;
	
	@FindAll(@FindBy(xpath="//a/h2[text()='Selenium Java']"))
	List<WebElement> Selenium_Java1;
	
	
	
	@FindBy(xpath="//div[@class='item-list']/ul/li")
	List<WebElement> Links;
	
	@FindBy(xpath="//a/h2[text()='Protractor Tutorials']")
	List<WebElement> Protactor;
	
	
	
	@FindBy(xpath="//a/h2[text()='Selenium Python']")
	List<WebElement> Selenium_Python;
	
	
	
	
	public WebElement Scope() {
		return Scope;
	}
	
	public  List<WebElement> Selenium_Java() {
		return Selenium_Java1;
	}

}
