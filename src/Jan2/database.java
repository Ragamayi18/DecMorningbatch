package Jan2;

import java.sql.DriverManager;

import org.testng.annotations.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class database {

	
	@Test
	public void testDB() throws Throwable {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql:33060/students","root","Ragamayi18");
		System.out.println("coonect to mysql");
		Statement smt=(Statement) con.createStatement();
		
		
		
		}	}