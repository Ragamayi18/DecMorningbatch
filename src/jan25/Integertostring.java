package jan25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Integertostring {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("D://Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum();
		for(int i=1;i<=rc;i++) 
		{
		String username=ws.getRow(i).getCell(0).getStringCellValue();
	if(wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
	{
	//get numeric cell from wb
	int celldata=(int)wb.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
	//convert celldata integer values into string type
	String password=String.valueOf(celldata);
	System.out.println(username+"  "+password);
	}
	ws.getRow(i).createCell(2).setCellValue("Iam so lazy to wakeup");
		}
		fi.close();
	FileOutputStream fo=new FileOutputStream("E://mrng1.xlsx");
	wb.write(fo);
	fo.close();
	wb.close();

	}

}
