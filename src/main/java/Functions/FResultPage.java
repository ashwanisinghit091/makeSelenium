package Functions;





import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageIObject.SearcResultPage;
import utility_pack.Wait;



public class FResultPage {

	public static int size;
	public  static WebDriver Driver;
	public static SearcResultPage sp;
	public static WebElement  we1;
	
	public FResultPage(WebDriver Driver){
		
		this.Driver=Driver;
		 sp=new SearcResultPage(Driver);
	}
	
	public WebElement Result(WebDriver Driver) {
		
		
		Wait.hold(Driver, sp.Results());
	 we1=	sp.Results();
	return we1;
	}
	
	public void  ResultLink() {
		
		System.out.println(sp.ResultsLinks(we1).size()+"why");
	 size= sp.ResultsLinks(we1).size();
		
	}	
	
	public void correctLinkClick(Logger log) {
		
		System.out.println(size+"itni size h");
		for(int i=0;i<size;i++) {
			
			String LocatorName=sp.ResultsLinks(we1).get(i).getText();
			
			if(LocatorName.equalsIgnoreCase("Examples with xpath and Css (ID, Name, Text and Links)")) {
				
				log.debug("Link Name is successfully Matched");
				sp.ResultsLinks(we1).get(i).click();
				break;
			}
	}
		
	}
		public void VerifyPage(Logger log) {
			;
			Wait.hold1(Driver, By.xpath("//div[@class='section-title']"));

String s=Driver.findElement(By.xpath("//div[@class='section-title']")).getText();
System.out.println(s);
Assert.assertEquals(s, "Examples with xpath and Css (ID, Name, Text and Links)");
log.debug("linked is successfully clicked and Page Title is successfully matched");
			
		
		
	
}}
