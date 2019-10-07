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
import Functions.FHomePage;
import Functions.FResultPage;


import pageIObject.HomePage;
import pageIObject.SearcResultPage;
import utility_pack.Screens;
import utility_pack.Wait;




//private static   Logger log  = LogManager.getLogger(Search_Job.class.getName())   ;
public class AllLinks extends Base{
	

private static Logger log=LogManager.getLogger(AllLinks.class.getName());
	
@Test()
	public static void FindLinks() {
	
	Screens s=new Screens(Driver);
	
	FHomePage fp=new FHomePage(Driver);
		
	WebElement we=fp.FScope();

	Assert.assertTrue(fp.FElementIsDisplayed(we));
	log.debug("Selenium java is successfully loaded");
	
	
	
	
	
    fp.FElementClickSeleniumJava(we);
    log.debug("Selenium java option is clicked  successfully loaded");
	System.out.println(fp.FElementGetTextSeleniumJava(we)+" have no. of links"+fp.FElementLinksSize(we));
	fp.FElementClickSeleniumProtactor(we);
	log.debug("protactor options are successfully loaded");
	System.out.println(fp.FElementGetTextSeleniumProtactor(we)+" have no. of links"+fp.FElementLinksSize(we));
	log.info("No. of links successfully printed");	
    Assert.assertTrue(fp.FElementIsDisplayedPython(we));
    log.debug("selenium python option is loaded successfully");
    fp.FElementClickSeleniumPython(we);
    log.debug("selenium python option is clicked successfully");
    System.out.println(fp.FElementIsDisplayedPython(we)+" have no. of links"+fp.FElementLinksSize(we));
    log.debug("selenium python option is loaded successfully");
	

	}

@Test()
public static void  Search()
{
	//HomePage hp=new HomePage(Driver);
	FHomePage fp=new FHomePage(Driver);
	fp.FElementSearchText();
	FResultPage frp=new FResultPage(Driver);
   frp.Result(Driver);
    frp.ResultLink();
    frp.correctLinkClick(log);
    frp.VerifyPage(log);
}


}

