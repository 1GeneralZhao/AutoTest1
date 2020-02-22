package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOperation {
		private static ChromeDriver chromeDriver;
		public static void main(String []args) throws InterruptedException{
			openChrome();
//			chromeDriver.findElement(By.id("kw")).sendKeys("MOOC");
//			Thread.sleep(5000);
//			chromeDriver.findElement(By.id("kw")).clear();
//			Thread.sleep(2000);
//			chromeDriver.findElement(By.id("kw")).sendKeys("中国大学慕课");
			WebElement webElement1 =chromeDriver.findElement(By.id("kw"));
			System.out.print("The labeling of element :"+ webElement1.getTagName());
			System.out.print("\nthe value of element :"+ webElement1.getAttribute("maxlength"));
			WebElement webElement2 = chromeDriver.findElement(By.xpath("//a[text()='hao123']"));
			System.out.print("\nThe text value of element :"+ webElement2.getText());
			System.out.print("\nWhether the element shows :"+ webElement2.isDisplayed());
		}
		
		
		public static void openChrome() {
			System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
			//打开ChromeDriver浏览器
			chromeDriver = new ChromeDriver();
			//打开百度
			chromeDriver.get("https://www.baidu.com");
		}

}
