package jan25;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writedata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//printing the data to notepad 
		File f=new File("D://mrng.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("iam learning java");
		bw.newLine();
		bw.write("iam learning manual");
		bw.newLine();
		bw.write("iam learning selenium");
		bw.flush();
		bw.close();
	}

}
