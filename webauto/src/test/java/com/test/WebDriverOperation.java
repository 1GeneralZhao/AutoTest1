package com.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;






public class WebDriverOperation {
	private static ChromeDriver chromeDriver;
	
	public static void main(String []args) throws InterruptedException {
		openChrome();
	//	chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //隐式等待
//		System.out.print("The current url:"+chromeDriver.getCurrentUrl());
//		System.out.print("\nThe title of current html:"+chromeDriver.getTitle());
//		System.out.print("\nThe pageSource of html:"+ chromeDriver.getPageSource());
//		chromeDriver.quit();
//		chromeDriver.findElement(By.id("kw")).sendKeys("mooc慕课");
//		chromeDriver.findElement(By.id("su")).click();
//		System.out.println("Open the current handle:"+chromeDriver.getWindowHandle());
//		Thread.sleep(2000);
//		chromeDriver.findElement(By.xpath("//a[text()='官方']")).click();
//		System.out.println("Open the current handle:"+chromeDriver.getWindowHandle());
//		System.out.println("Open all current handle:"+chromeDriver.getWindowHandles());
		//Thread.sleep(3000);
		//chromeDriver.close();
		//chromeDriver.manage().window();
	//	Options options = chromeDriver.manage();
//		Dimension dimension = options.window().getSize();
//		System.out.println("Height of the window:"+dimension.getHeight());
//		System.out.println("Width of the window:"+dimension.getWidth());
//		
//		System.out.println(options.window().getPosition().getX());
//		System.out.println(options.window().getPosition().getY());
		
//		Navigation navigation = chromeDriver.navigate();
//		navigation.to("http://www.jd.com");
//		
//		navigation.refresh();
//		
//		Thread.sleep(2000);
//		
//		//navigation.back();
//		//Thread.sleep(2000);
//		//navigation.forward();
		
//		chromeDriver.get("https://www.baidu.com");
//		chromeDriver.findElement(By.id("kw")).sendKeys("MOOC");
//		chromeDriver.findElement(By.id("su")).click();
//		//Thread.sleep(2000);
//		//显示等待
//		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver,5);
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='官方']")));
//		chromeDriver.findElement(By.xpath("//a[text()='官方']")).click();
/*		chromeDriver.get("file:///C:/Users/32577/Desktop/Alert.html");
		chromeDriver.findElement(By.xpath("//input[@id=\"btn\"]")).click();
		Thread.sleep(3000);
		Alert alert = chromeDriver.switchTo().alert();
		//alert.accept();
		//alert.dismiss();
		System.out.println(alert.getText());
		*/
//		chromeDriver.get("file:///C:/Users/32577/Desktop/Alert.html");
//		chromeDriver.findElement(By.xpath("//input[@id=\"queren\"]")).click();
//		Thread.sleep(3000);
//		Alert alert = chromeDriver.switchTo().alert();
//		
//		//alert.accept();
//		//alert.dismiss();
//		System.out.println(alert.getText());
/*		//windows 切换最新窗口   34课   待调整
		chromeDriver.get("https://www.jd.com/");
		chromeDriver.findElement(By.xpath("//a[@class=\"navitems-lk\"]")).click();
		Set<String> handles = chromeDriver.getWindowHandles();
		for(String handle : handles) {
			chromeDriver.switchTo().window(handle);
			//System.out.println(chromeDriver.getTitle());
			if(chromeDriver.getTitle().equals("京东(JD.COM)-正品低价、品质保障、配送及时、轻松购物！"))
			{
				break;
			}
			
		}
		Alert alert = chromeDriver.switchTo().alert();
		alert.dismiss();
		*/
		/*
		chromeDriver.get("http://www.baidu.com");
		chromeDriver.findElement(By.xpath("//div[@id='u1']/a[@name='tj_settingicon']")).click();
		chromeDriver.findElement(By.xpath("//div[@class='bdpfmenu']/a[text()=\"高级搜索\"]")).click();
		Thread.sleep(2000);
		WebElement webElement = chromeDriver.findElement(By.xpath("//select[@name='gpc']"));
		
		Select select = new Select(webElement);
		select.selectByIndex(3);
		*/
		/*
		chromeDriver.get("https://www.fliggy.com/?ttid=seo.000000574&seoType=origin");
		chromeDriver.findElement(By.xpath("//div[@class='calendar-input-wrap']//input[@type='text']")).sendKeys("2020-02-21");
		*/
		/*
		chromeDriver.get("https://www.12306.cn/index/");
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) chromeDriver;
		javascriptExecutor.executeScript("document.getElementById(\"train_date\").removeAttribute(\"readonly\")");
		Thread.sleep(2000);
		chromeDriver.findElement(By.id("train_date")).clear();
		chromeDriver.findElement(By.id("train_date")).sendKeys("2020-02-10");
		*/
		chromeDriver.get("http://www.treejs.cn/v3/demo/cn/exedit/drag.html");
		WebElement sourceElement = chromeDriver.findElement(By.id("treeDemo_2_span"));
		WebElement targetElement = chromeDriver.findElement(By.id("treeDemo_3_span"));
		Actions actions = new Actions(chromeDriver);
		actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
	}
	
	
	
	public static void openChrome() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		//打开ChromeDriver浏览器
		chromeDriver = new ChromeDriver();
		//打开百度
		//chromeDriver.get("https://www.baidu.com");
	}

}
