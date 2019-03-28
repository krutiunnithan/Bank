package XYZ;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ReadExcelFile(String filePath) throws IOException {
		
		FileInputStream fis = new FileInputStream(filePath);
		wb = new XSSFWorkbook(fis);
		
	}
	
	public int rowCount(int sheetNumber) {
		
		int rows = wb.getSheetAt(sheetNumber).getLastRowNum();
        rows++;
		return rows;
	}
	
	
	public String data(int sheetIndex, int r, int c) {
		
		sheet = wb.getSheetAt(sheetIndex);
		String s = sheet.getRow(r).getCell(c).getStringCellValue();
		return s;
		
	}
	
    public int num(int sheetIndex, int r, int c) {
		
		sheet = wb.getSheetAt(sheetIndex);
		int s = (int) sheet.getRow(r).getCell(c).getNumericCellValue();
		return s;
		
	}
	
}
