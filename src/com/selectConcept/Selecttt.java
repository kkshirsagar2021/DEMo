package com.selectConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecttt {

	public static void main(String[] args) {
		@Test
		 void setUpp(){
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		/*Alert alt=driver.switchTo().alert();
		alt.dismiss();*/
		WebElement ele=driver.findElement(By.xpath("(//*[@name='dropdown'])"));	
		Select dropdown=new Select(ele);
		dropdown.selectByVisibleText("Manual Testing");
		driver.close();
		}
	}

}
