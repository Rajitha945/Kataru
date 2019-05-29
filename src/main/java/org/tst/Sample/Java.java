package org.tst.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://mvnrepository.com/artifact/org.apache.poi/poi/3.8-beta4");
}
}
