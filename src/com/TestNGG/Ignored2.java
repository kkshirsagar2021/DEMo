package com.TestNGG;

import org.testng.annotations.Test;

public class Ignored2 {

	@Test(enabled=false)
	public void sow()
	{
		System.out.println("Class 2");
	}
}
