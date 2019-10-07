package Functions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageIObject.HomePage;






public class FHomePage {
	private static final String String = null;
	public static WebDriver Driver;
	public static HomePage hp;
	public FHomePage(WebDriver Driver){
		
		this.Driver=Driver;
		HomePage hp=new HomePage(Driver);
	}
	

	public WebElement FScope() {
		
		
	return	hp.Scope();
	}
	
	
public Boolean FElementIsDisplayed(WebElement we) {
	
		
	return	hp.Selenum_Java(we).isDisplayed();
	}
	
public Boolean FElementIsDisplayedPython(WebElement we) {
	
	
	return	hp.Selenium_Python(we).isDisplayed();
	}
	
	public void FElementClickSeleniumJava(WebElement we) {
	
		
		hp.Selenum_Java(we).click();
	}
public void FElementClickSeleniumProtactor(WebElement we) {
	
		
		hp.Protactor(we).click();
	}

public void FElementClickSeleniumPython(WebElement we) {
	
	
	hp.Selenium_Python(we).click();
}
	
public static String  FElementGetTextSeleniumJava(WebElement we) {
	
		
	String CourseHeading_Heading = hp.Selenum_Java(we).getText();
	 return CourseHeading_Heading;
	}

public static String  FElementGetTextSeleniumPython(WebElement we) {
	
	
	String CourseHeading_Heading = hp.Selenium_Python(we).getText();
	 return CourseHeading_Heading;
	}

public static String  FElementGetTextSeleniumProtactor(WebElement we) {

	
String CourseHeading_Heading1 = hp.Selenum_Java(we).getText();
 return CourseHeading_Heading1;
}

public int FElementLinksSize(WebElement we) {
	
	
	List<WebElement> li=hp.Links(we);
	
	return li.size();
}


public void FElementSearchText() {
	
	
	hp.Search().sendKeys("Locators");
	hp.Search().sendKeys(Keys.ENTER);
}









}
