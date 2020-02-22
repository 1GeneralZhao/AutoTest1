package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocate {
	private static ChromeDriver chromeDriver;
	public static void main(String []args){
		openChrome();
		//chromeDriver.findElement(By.id("kw")).sendKeys("腾讯课堂");  //id 唯一性
		//chromeDriver.findElement(By.id("su")).click();
		//chromeDriver.findElement(By.name("wd")).sendKeys("腾讯课堂");   //name重复
		//chromeDriver.findElement(By.className("s_ipt")).sendKeys("腾讯课堂");
		//chromeDriver.findElement(By.className("s_bn")).click();
		//chromeDriver.findElement(By.linkText("抗击肺炎")).click();
		//chromeDriver.findElement(By.partialLinkText("肺炎")).click();
		//chromeDriver.findElement(By.cssSelector("#kw")).sendKeys("腾讯课堂");
		//chromeDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("腾讯课堂");
		//chromeDriver.findElement(By.cssSelector(".bg.s_btn")).click();
		//chromeDriver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("腾讯课堂");
		//chromeDriver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off']")).sendKeys("腾讯课堂");
	}
	
	
	public static void openChrome() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		//打开ChromeDriver浏览器
		chromeDriver = new ChromeDriver();
		//打开百度
		chromeDriver.get("https://www.baidu.com");
	}

}
