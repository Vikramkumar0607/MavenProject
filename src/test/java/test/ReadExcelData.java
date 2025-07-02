package test;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtilities;

public class ReadExcelData {

	public static void main(String[] args) {
		List<Map<String, String>> data =ExcelUtilities.redData("TestData.xlsx", "Sheet1");
		System.out.println(data);
 
	}

}
