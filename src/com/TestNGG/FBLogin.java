package com.TestNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBLogin {

	//@Test(dataprovider="testdata")
	@Test
	public void login(String email,String pass)
	{
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
	}
	
		

	}

}
