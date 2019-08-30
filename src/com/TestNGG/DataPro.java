package com.TestNGG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {

	@Test(dataProvider="getData")
	public void login(String uid,String pwd)
	{
		System.out.println("User Id="+uid);
		System.out.println("Password="+pwd);
	}
	@DataProvider(name="getData")
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="FirstID";
		data[0][1]="FirstPwd";
		
		data[1][0]="SecondID";
		data[1][1]="SecondPWD";
		return data;
	}
	
}
