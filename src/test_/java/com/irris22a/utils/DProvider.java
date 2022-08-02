package com.irris22a.utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class DProvider {

	@DataProvider(name = "datas")
	public Object[][] dataprovideTest() throws IOException {
     
		return ExcelReaderFile.loadSheet("D:\\MyBook.xlsx", "FruitSheet");

	}
}
