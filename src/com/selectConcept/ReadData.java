package com.selectConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("D:\\Data.Xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheetAt(0);
		Row row=sh.getRow(0);
		Cell cell=row.getCell(0);
		System.out.println(cell);
		System.out.println(sh.getRow(0).getCell(0));

	}

}
