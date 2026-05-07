import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class day1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static final String url ="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="teju";
		
		Connection conn=null;
		Statement stm=null;
		ResultSet res=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			
			 conn = DriverManager.getConnection(url, username, password);
			System.out.println("connection established");
			
			 stm = conn.createStatement();
			
			String query="select *from course";
			
			 res = stm.executeQuery(query);
			System.out.println("excute query");
			
			printQuery(res);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {

			try {
				if(res!=null)
					res.close();
				else if(stm!=null)
					stm.close();
				else if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void printQuery(ResultSet res) throws SQLException {
		while(res.next()) {
			int ccode =res.getInt("course_code");
			String title=res.getString("course_title");
			int credit =res.getInt("credit_value");
			
			System.out.println(ccode+" "+" "+title+" "+credit+" ");				
		}
	}
}