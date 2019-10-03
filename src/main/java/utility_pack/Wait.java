package utility_pack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	
	
	public static void hold(WebDriver Driver,WebElement we) {
		
		
		WebDriverWait wait=new WebDriverWait(Driver,6);
		wait.until(ExpectedConditions.visibilityOf(we));
	}

	
	
}
