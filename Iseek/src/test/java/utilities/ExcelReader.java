package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static XSSFWorkbook wbook;
	static XSSFSheet sheet;
	
	static File src = new File("C:\\Users\\Sunny\\.jenkins\\workspace\\Iseek\\Iseek\\src\\test\\TestData\\Data.xlsx");
	
	public static Object[][] getTestData(String Sheetname) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try {
			wbook = new XSSFWorkbook(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sheet = wbook.getSheet(Sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum(); i++) {
			for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
}
