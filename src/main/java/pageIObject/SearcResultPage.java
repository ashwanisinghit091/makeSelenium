package pageIObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearcResultPage {
public static WebDriver Driver;
	public SearcResultPage(WebDriver Driver){
		
		this.Driver=Driver;
	}
	
	
	
	 static By Results=By.xpath("//section[@class='col-sm-8']");
	 static By ResultsLinks=By.tagName("a");
	
	public static  WebElement Results() {
		return 	Driver.findElement(Results);}
	

	public static  List<WebElement> ResultsLinks(WebElement we) {
		return 	we.findElements(ResultsLinks);}
}
