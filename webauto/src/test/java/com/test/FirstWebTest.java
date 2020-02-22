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
		//��ChromeDriver�����
		ChromeDriver chromeDriver = new ChromeDriver();
		//�򿪰ٶ�
		chromeDriver.get("https://www.baidu.com");
	}
	
	public static void openFireFox() {
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
		//��firebox�����
		FirefoxDriver fireFoxDriver = new FirefoxDriver();
		//�򿪰ٶ�
		fireFoxDriver.get("https://www.baidu.com");
	}

	public static void openIeExplorer() {
		//ȡ��IE��ȫ���ã�����IE��Protected Mode�����ã�
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
		InternetExplorerDriver ieDriver = new InternetExplorerDriver(capabilities);
		ieDriver.get("https://www.baidu.com");
		
	}
}
