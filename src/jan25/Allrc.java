package jan25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Allrc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fi=new FileInputStream("D://Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("login");
		XSSFRow row=ws.getRow(0);
		int rc=ws.getLastRowNum();
		int cc=row.getLastCellNum();
		System.out.println("no of rows are::"+rc+" "+"no of columns are::"+cc);
				for(int i=1;i<rc;i++)
		{
			String user=ws.getRow(i).getCell(0).getStringCellValue();
			String pass=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(user+" "+pass);
			
			//write pass into results columns
			ws.getRow(i).createCell(2).setCellValue("pass");
		}
		fi.close();
		FileOutputStream fo=new FileOutputStream("E:\\mrngbatchxlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		}

}
