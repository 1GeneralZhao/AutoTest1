package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocate {
	private static ChromeDriver chromeDriver;
	public static void main(String []args){
		openChrome();
		//chromeDriver.findElement(By.id("kw")).sendKeys("��Ѷ����");  //id Ψһ��
		//chromeDriver.findElement(By.id("su")).click();
		//chromeDriver.findElement(By.name("wd")).sendKeys("��Ѷ����");   //name�ظ�
		//chromeDriver.findElement(By.className("s_ipt")).sendKeys("��Ѷ����");
		//chromeDriver.findElement(By.className("s_bn")).click();
		//chromeDriver.findElement(By.linkText("��������")).click();
		//chromeDriver.findElement(By.partialLinkText("����")).click();
		//chromeDriver.findElement(By.cssSelector("#kw")).sendKeys("��Ѷ����");
		//chromeDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("��Ѷ����");
		//chromeDriver.findElement(By.cssSelector(".bg.s_btn")).click();
		//chromeDriver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("��Ѷ����");
		//chromeDriver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off']")).sendKeys("��Ѷ����");
	}
	
	
	public static void openChrome() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		//��ChromeDriver�����
		chromeDriver = new ChromeDriver();
		//�򿪰ٶ�
		chromeDriver.get("https://www.baidu.com");
	}

}
