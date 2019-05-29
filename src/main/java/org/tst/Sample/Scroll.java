package org.tst.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	               "C:\\Users\\Lenovo\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
      //launch the browser
        WebDriver driver = new ChromeDriver();
      //url
        driver.get("http://demo.guru99.com/test/guru99home/");
      //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Linux"));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
      //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
       Element.click();
	}
}
