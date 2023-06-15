package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
public static WebDriver browser(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win-UEFI\\eclipse-workspace\\Baseclass\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get(url);
	return driver;
	
}
public static void inputelement(WebElement elementname,String value) {
	elementname.sendKeys(value);

}
public static void clickelement(WebElement elementname) {
	elementname.click();
	

}
}
