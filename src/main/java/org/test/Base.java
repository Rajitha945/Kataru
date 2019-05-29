package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	static WebDriver driver;
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
	}
  public static void loadUrl(String url) {
	  driver.get(url);
    }
  public static void type(WebElement element, String name) {
	   element.sendKeys(name); 
    }
  public static void attribute(WebElement element) {
	  String attribute = element.getAttribute("value");
	  System.out.println(attribute);
  }
  public static void btnLogin(WebElement element) {
	  element.click();
  }
  public static void actions(WebElement element) {
	  Actions acc = new Actions(driver);
	  acc.moveToElement(element).perform();
  }
  public static void drag(WebElement element1,WebElement element2) {
	  Actions acc = new Actions(driver);
	  acc.dragAndDrop(element1,element2).perform();
  }
  public static void quitBrowser() {
	  driver.quit();
  }
  
  
}

