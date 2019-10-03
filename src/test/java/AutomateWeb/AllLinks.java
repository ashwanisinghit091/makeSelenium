package AutomateWeb;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base_Pack.Base;
import Locators.Home_Page;

import pageIObject.HomePage;
import pageIObject.SearcResultPage;
import utility_pack.Screens;
import utility_pack.Wait;




//private static   Logger log  = LogManager.getLogger(Search_Job.class.getName())   ;
public class AllLinks extends Base{
	

private static Logger log=LogManager.getLogger(AllLinks.class.getName());
	
@Test()
	public static void FindLinks() {
	//Home_Page hm=new Home_Page(Driver);
	
	HomePage hp=new HomePage(Driver);
	Screens s=new Screens(Driver);
	
	
		
	WebElement wb=hp.Scope();
	//System.out.println(hm.Scope());
//	Home_Page hm1=new Home_Page(wb);
	//System.out.println(hm.Selenium_Java().size());
	
	//Assert.assertTrue(hp.Selenum_Javas(wb).size()>0);
	Assert.assertTrue(hp.Selenum_Java(wb).isDisplayed());
	log.debug("Selenium java is successfully loaded");
	//hm.Selenium_Java().get(0).click();
	
	
	
	
hp.Selenum_Java(wb).click();
log.debug("Selenium java option is clicked  successfully loaded");
	String CourseHeading_Heading=hp.Selenum_Java(wb).getText();
	
	
	
List<WebElement> li=hp.Links(wb);
	
	System.out.println(CourseHeading_Heading+" have no. of links"+li.size());
			
//	Assert.assertTrue((wb.findElements(By.xpath("//a/h2[text()='Protractor Tutorials']")).size())>0);
	
	hp.Protactor(wb).click();
	log.debug("protactor options are successfully loaded");
	
	String CourseHeading_Heading1=hp.Protactor(wb).getText();
	
	

List<WebElement> li1=hp.Links(wb);
	
	System.out.println(CourseHeading_Heading1+" have no. of links"+li1.size());
	log.info("No. of links successfully printed");
	
	
Assert.assertTrue((hp.Selenium_Python(wb)).isDisplayed());
log.debug("selenium python option is loaded successfully");

hp.Selenium_Python(wb).click();
log.debug("selenium python option is clicked successfully");

String CourseHeading_Heading3=hp.Selenium_Python(wb).getText();

List<WebElement> li2=hp.Links(wb);

System.out.println(CourseHeading_Heading3+" have no. of links"+li2.size());
log.debug("selenium python option is loaded successfully");
	

	}

@Test()
public static void  Search()
{
	HomePage hp=new HomePage(Driver);
	
	hp.Search().sendKeys("Locators");
	hp.Search().sendKeys(Keys.ENTER);
	SearcResultPage sp=new SearcResultPage(Driver);
	Wait.hold(Driver, sp.Results());
WebElement we1=	sp.Results();
int ResultLinkSize=sp.ResultsLinks(we1).size();
for(int i=0;i<ResultLinkSize;i++) {
	
String LocatorName=sp.ResultsLinks(we1).get(i).getText();
if(LocatorName.equalsIgnoreCase("Examples with xpath and Css (ID, Name, Text and Links)")) {
	log.debug("Link Name is successfully Matched");

	sp.ResultsLinks(we1).get(i).click();
	break;
}






	
	
	
	
}

System.out.println(Driver.getTitle());
Assert.assertEquals(Driver.getTitle(), "Examples with xpath and Css (ID, Name, Text and Links) | Selenium Easy");
log.debug("linked is successfully clicked and Page Title is successfully matched");
}


}

