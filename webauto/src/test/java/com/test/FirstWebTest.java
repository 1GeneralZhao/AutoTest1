package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstWebTest {
	public static void main(String []args) {
		//openChrome();
		//openFireFox();
		openIeExplorer();
	}
	
	public static void openChrome() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		//打开ChromeDriver浏览器
		ChromeDriver chromeDriver = new ChromeDriver();
		//打开百度
		chromeDriver.get("https://www.baidu.com");
	}
	
	public static void openFireFox() {
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		//打开firebox浏览器
		FirefoxDriver fireFoxDriver = new FirefoxDriver();
		//打开百度
		fireFoxDriver.get("https://www.baidu.com");
	}

	public static void openIeExplorer() {
		//取消IE安全设置（忽略IE的Protected Mode的设置）
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
		InternetExplorerDriver ieDriver = new InternetExplorerDriver(capabilities);
		ieDriver.get("https://www.baidu.com");
		
	}
}
