package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static XSSFWorkbook wbook;
	static XSSFSheet sheet;
	static String data;
	
	static File src = new File("C:\\Users\\Sunny\\git\\Iseek_WebApp\\Iseek_WebApp\\Iseek\\src\\resources\\TestData\\Data.xlsx");
	
	public static String getTestData(String Sheetname, int Row) {
		
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
		short cellcount = sheet.getRow(0).getLastCellNum();
		for(int i=0; i<cellcount; i++) {
			data = sheet.getRow(Row).getCell(i).getStringCellValue();	
		}
		return data;
	}
}
