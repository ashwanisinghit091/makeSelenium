package utility_pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screens {
	public static WebDriver Driver;
	private static Logger Log=LogManager.getLogger(Screens.class.getName());

	public Screens(WebDriver Driver){
		
		this.Driver=Driver;
		
	}
	
	
	public static void Screenshot(String s) {
		
		File src=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("D://error1"+s+".png"));
			Log.info("Screenshot saved successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.error("File Not Found");
			
		}
	}
	
}
