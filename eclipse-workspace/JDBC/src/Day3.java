import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Day3 {
	static final String url = "jdbc:mysql://localhost:3306/student";
	static final String username="root";
	static final String password="teju";
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			String query="update course set credit_value=? where course_code=?";
			
			int cc=sc.nextInt();
			int cv=sc.nextInt();
			
			PreparedStatement ptsmt =con.prepareStatement(query);
			
			ptsmt.setInt(1,cv);
			ptsmt.setInt(2,cc);
			
			int executeUpdate = ptsmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
