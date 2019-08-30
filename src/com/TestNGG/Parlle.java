package com.TestNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parlle {
	@Test
	public void getFireFox()
	{
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		System.out.println("Get Firefox Method reunning on Thread"+Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}
	@Test
	public void getChrome()
	{
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		System.out.println("Get Chrome Method Running on Thread"+Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}
	
}
