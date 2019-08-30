package com.selectConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.navigate().refresh();
		WebElement element=driver.findElement(By.xpath("//*[@name='dropdown']"));
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText("Manual Testing");
		driver.close();
	}

}
