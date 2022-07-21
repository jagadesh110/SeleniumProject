package testrun;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
	File file = new File("D:\\testdata\\Testdata5.xls");
	FileInputStream fis =new FileInputStream(file);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet =workbook.getSheetAt(0);
	String celvalue1 =sheet.getRow(0).getCell(0).getStringCellValue();
	String celvalue2 =sheet.getRow(0).getCell(1).getStringCellValue();
	String celvalue3 =sheet.getRow(1).getCell(0).getStringCellValue();
	String celvalue4 =sheet.getRow(1).getCell(1).getStringCellValue();
	System.out.println(celvalue1);
	System.out.println(celvalue2);
	System.out.println(celvalue3);
	System.out.println(celvalue4);
	workbook.close();
	fis.close();
	}
	

}
