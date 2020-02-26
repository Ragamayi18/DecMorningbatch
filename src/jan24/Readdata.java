package jan24;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws Throwable {
		//read data from file
		FileInputStream fi=new FileInputStream("D://Book1.xlsx");
		
		//get wrokbook from file
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from wb
		
		XSSFSheet ws=wb.getSheet("Login");
		//get firstrow  from sheet
		XSSFRow row=ws.getRow(0);
		//count no of rows in sheet
		int rc=ws.getLastRowNum();
		
		//count no of columns from row
		int cc=row.getLastCellNum();
		System.out.println("no of rows are::"+rc+"  "+"no of columns in row are::"+cc);
		
		//get first column second row data
		String username=ws.getRow(5).getCell(0).getStringCellValue();
		
		//get second column second row data
		String password=ws.getRow(6).getCell(1).getStringCellValue();
		System.out.println(username+"    "+password);
		fi.close();
		wb.close();
			}
	}


