package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	// Read Data from Excel file convert it into collections
	public static List<Map<String, String>> redData(String fileName, String sheetName) {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();
		// Read the Excel file
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);

			// Load the File into Excel class
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			// Read Data from specific excel file sheet
			XSSFSheet sh = wb.getSheet(sheetName);
			// Get the Total row and column having data
			int totalRow = sh.getPhysicalNumberOfRows();
			int totalColumn = sh.getRow(0).getPhysicalNumberOfCells();
			// Use for loop and copy data
			for (int r = 1; r < totalRow; r++) {
				// Initialize map for each row

				Map<String, String> rowData = new HashMap<String, String>();
				for (int c = 0; c < totalColumn; c++) {
					String columnName = sh.getRow(0).getCell(c).getStringCellValue();
					String columnData = sh.getRow(r).getCell(c).getStringCellValue();
					rowData.put(columnName, columnData);
				}
				// Strong each Map into main arraylist
				data.add(rowData);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;

	}

	// Read Data from Excel file convert it into 2D arrays
	public static String[][] redExcelData(String fileName, String sheetName) {
		String[][] excelData = null;
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);
			// Load the File into Excel class
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			// Read Data from specific excel file sheet
			XSSFSheet sh = wb.getSheet(sheetName);
			// Get the Total row and column having data
			int totalRow = sh.getPhysicalNumberOfRows();
			int totalColumn = sh.getRow(0).getPhysicalNumberOfCells();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return excelData;

	}

}
