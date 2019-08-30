package com.selectConcept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {
	@Test(dataProvider="getdata")
	public void loginTest(String uid,String pwd)
	{
		System.out.println("User Is="+uid);
		System.out.println("Password="+pwd);
	}
	@DataProvider(name="getdata")
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="FirstUID";
		data[0][1]="FirstPWD";
		
		data[1][0]="SecondUID";
		data[1][1]="SecondPWD";
		
		return data;
	}

}


