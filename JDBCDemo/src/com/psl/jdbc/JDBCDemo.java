package src.com.psl.jdbc;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo {
	
	static Connection con= null;
	public static Connection getConnection(){
		try {
			
			/// We have imported the 3rd party driver.
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdB", "root", "root");
			
			System.out.println("Connection is established to Mysql....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// We have obtained the Connection to mysql DB
		
		return con;
		
	}
	
	private static void insertData(Connection con){
		
		//Run-time data assignment and insertion, used for DML.
		java.sql.PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into emp values (?,?)");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter ID: ");
			int id = s.nextInt();
			
			System.out.println("Enter Name: ");
			String name = s.next();
			
			// Adding the data in run-time using prepared statement
			ps.setInt(1, id);
			ps.setString(2, name);
			
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		
		String CreateQuery = "create table emp (id INT(10), name varchar(10))";
		String InsertQuery  = "insert into emp value(102, 'Roy')";
		String SelectQuery  = "select * from emp";
		
		
		Connection con = getConnection();
		
		insertData(con);
		
		/*try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// Returns a Statement Object
		// Mainly useful for DDL queries
		// java.sql.Statement stmt = con.createStatement();
     }
		

}
