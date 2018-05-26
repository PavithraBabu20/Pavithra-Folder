package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadFromExcel {
	@Test
	public Object[][] fetchData(String ExcelName) throws IOException {
	//open the workbook
	XSSFWorkbook wBook = new XSSFWorkbook("./data/"+ExcelName+".xlsx");
	//Go to the specific sheet
	XSSFSheet sheet = wBook.getSheetAt(0);
	//Access the rows
	int rowNum = sheet.getLastRowNum();
	System.out.println(rowNum);
	//Access the Columns
	int cellNum = sheet.getRow(0).getLastCellNum();
	Object[][] data = new Object[rowNum][cellNum];
	System.out.println(cellNum);
	//read Data and Print
    for (int i = 1; i<=rowNum;i++) {
    	XSSFRow row = sheet.getRow(i);
		for(int j=0;j<cellNum;j++) {
			XSSFCell cell = row.getCell(j);
			data[i-1][j] = cell.getStringCellValue();
			System.out.println(data);
		}
	}
    wBook.close();
	return data;
	
	}
}
