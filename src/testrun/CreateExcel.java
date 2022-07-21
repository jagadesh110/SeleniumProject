package testrun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.sql.Driver;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CreateExcel {

	public static void main(String[] args) throws Exception {


		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("testdata");
		sheet.createRow(0);
		
	
	sheet.getRow(0).createCell(0).setCellValue(true);
	sheet.getRow(0).createCell(1).setCellValue(true);
	sheet.createRow(4);
	sheet.getRow(4).createCell(0).setCellValue(true);
	sheet.createRow(5);
	sheet.getRow(10).createCell(0).setCellValue(true);	
	sheet.getRow(10).createCell(1).setCellValue("hello");
	sheet.getRow(10).createCell(2).setCellValue("jaga");
		File file =new File("D:\\testdata\\Testdata_priya.xlsx");  
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		
		
	
		
	}

}
