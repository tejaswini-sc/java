import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class student{
	
	private static final String url = "jdbc:mysql://localhost:3306/student";
	private static final String username = "root";
	private static final String password= "teju";
	private static final String INSERT_QUERY = "Insert into student(id,name,email,branch,cgpa) "
			+ "values(?,?,?,?,?)";
	
//	private static final String UPDATE_QUERY = "Update student set ";
	
	private static Connection con;
	private static PreparedStatement pstmt;
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			addStud();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void addStud() throws SQLException {
		pstmt = con.prepareStatement(INSERT_QUERY);
		
		System.out.println("enter the studnet id");
		int id= sc.nextInt();
		
		System.out.println("enter the studnet name");
		String name= sc.next();
		
		System.out.println("enter the studnet email");
		String email= sc.next();
		
		System.out.println("enter the branch");
		String branch=sc.next();
		
		System.out.println("enter cgpa");
		float cgpa=sc.nextFloat();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, email);
		pstmt.setString(4, branch);
		pstmt.setFloat(5, cgpa);
		
		int res = pstmt.executeUpdate();
		System.out.println(res);	
	}
}
