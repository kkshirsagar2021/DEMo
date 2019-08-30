package com.TestNGG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class Para {
	@Test
	@Parameters("browser")
	public void paramet(String browser){
		if(browser.equals("chrome"))
		{
			System.out.println("open in Chrome Browser");
		}
	}

}
