import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class day1 {
	
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="teju";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("connection established");
			
			Statement stm = conn.createStatement();
			
			String query="select *from course where course_title = 'java'";
			
			ResultSet res = stm.executeQuery(query);
			System.out.println("excute query");
			
			while(res.next()) {
				int ccode =res.getInt("course_code");
				String title=res.getString("course_title");
				int credit =res.getInt("credit_value");
				
				System.out.println(ccode+" "+" "+title+" "+credit+" ");				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}