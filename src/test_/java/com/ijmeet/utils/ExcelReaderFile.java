package com.ijmeet.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReaderFile {
	public static Object[][] loadSheet(String FileNm, String sheetNm) throws IOException {

		Object[][] obj = null;

		FileInputStream fis = new FileInputStream(FileNm);
		Workbook wrkbk = new XSSFWorkbook(fis);
		Sheet sheet = wrkbk.getSheet(sheetNm);
		int rows = sheet.getLastRowNum();
		obj = new Object[rows][sheet.getRow(0).getLastCellNum()-1];

		for (int i = 1; i <=rows; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getLastCellNum();
			for (int j = 1; j < cells; j++) {
                 Cell cell=row.getCell(j);
                 
                 obj[i-1][j-1]=cell.getStringCellValue();	
			}
		}

		return obj;

	}
	
	@DataProvider(name = "data1")
	public Object[][] dataprovideTest() throws IOException {
     
		return ExcelReaderFile.loadSheet("D:\\MyBook.xlsx", "UserID_pASS");

	}


}
