package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample3 extends Base{

	public static void main(String[] args) {
	
		WebDriver driver = getDriver();
		
		loadUrl("http://demo.guru99.com/test/drag_drop.html");
	//	WebElement txtUsename = driver.findElement(By.id("email"));
	//	type(txtUsename,"Rajitha");
	//	WebElement txtPassword = driver.findElement(By.id("pass"));
	//	type(txtPassword,"Veeraiah");
	//	attribute(txtPassword);
		WebElement drag = driver.findElement(By.id("credit2"));
		WebElement drop = driver.findElement(By.id("bank"));
		drag(drag,drop);
	//	WebElement mouse = driver.findElement(By.xpath("//a[text()='COURSES']"));
	//	actions(mouse);
	//	quitBrowser();
	}
}
