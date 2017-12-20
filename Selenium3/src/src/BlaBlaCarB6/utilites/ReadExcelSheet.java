package BlaBlaCarB6.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheet {
	
	XSSFWorkbook wb;
	XSSFSheet sheet ;
	public ReadExcelSheet(String excelPath) throws InvalidFormatException, IOException{
		File srcFile = new File(excelPath);
		FileInputStream fis = new FileInputStream(srcFile);
		wb = new XSSFWorkbook(fis);//Read excel file
		sheet = wb.getSheetAt(0);//get sheet
		wb.close();
	}
	
	public String getCellData(int sheetNumber, int row, int column){
		String data0 = null;
		sheet =wb.getSheetAt(sheetNumber);
		if(sheet.getRow(row).getCell(column) == null){
			data0= "";
		}else{
			data0 = sheet.getRow(row).getCell(column).getStringCellValue();
		}
		System.out.println("cell data ="+data0);
		return data0;
	}
	/**
	 * akale
	 * @param sheetIndex
	 * @return
	 */
	public int getRowCount(int sheetIndex){
		int rowCNT = wb.getSheetAt(sheetIndex).getLastRowNum();
		return rowCNT;
	}
	
	

}
