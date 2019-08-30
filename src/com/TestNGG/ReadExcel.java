package com.TestNGG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;

public class ReadExcel {
	public static void main(String args[]) throws IOException{
		File src=new File("C:\\Users\\user\\Desktop\\Data.Xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(0);
		
		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		
		System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	}
	}

