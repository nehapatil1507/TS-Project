package com.ijmeet.utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class DProvider {

	@DataProvider(name = "data")
	public Object[][] dataprovideTest() throws IOException {
     
		return ExcelReaderFile.loadSheet("D:\\MyBook.xlsx", "FruitSheet");

	}
}
