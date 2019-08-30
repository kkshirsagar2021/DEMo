package com.selectConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\IMPFiles\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		 driver.findElement(By.xpath("//*[@id='content']/button")).click();
		 Thread.sleep(3000);
		 Alert alert = driver.switchTo().alert();
		 String print = alert.getText();
		 System.out.println(print);
		 alert.accept();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='content']/button")).click();
		 Thread.sleep(3000);
		 alert.dismiss();
		 driver.close();
	}

}
