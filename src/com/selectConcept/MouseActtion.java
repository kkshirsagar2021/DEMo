package com.selectConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActtion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.softwaretestingmaterial.com/selenium-tutorial/");
		driver.findElement(By.xpath("//*[@class='align-right secondary popover-button']")).click();
		WebElement mainmanu=driver.findElement(By.xpath("(//*[@itemprop='name'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(mainmanu);
		WebElement submenu=driver.findElement(By.xpath("(//*[@itemprop='name'])[3]"));
		act.moveToElement(submenu);
		act.click().build().perform();
		driver.close();
		

	}

}
