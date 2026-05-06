// package eclipse-workspace.JDBC.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Stduentdb {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "teju";
		try {
			// 1 load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load driver");
			
			// 2 Establish connection 
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("esatablish connection");
			
			//	create sql statement
			Statement stmt = con.createStatement();
			
			String query = "SELECT id, firstName, lastName, age FROM student";
			ResultSet res = stmt.executeQuery(query);
			
			while(res.next()) {
				int id =res.getInt("id");
				String fname = res.getString("firstName");
				String lname= res.getString("lastName");
				int age = res.getInt("age");
				System.out.printf("%-2d %-6s %-7s %-2d%n", id, fname, lname, age);
			}
			
			res.close();
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
