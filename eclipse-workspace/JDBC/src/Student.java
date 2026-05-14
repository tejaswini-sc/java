import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Student{
	
	private static final String url = "jdbc:mysql://localhost:3306/student";
	private static final String username = "root";
	private static final String password= "teju";
	private static final String INSERT_QUERY = "Insert into student(id,name,email,branch,cgpa) "
			+ "values(?,?,?,?,?)";
	
	private static final String UPDATE_QUERY = "Update student set img=? where id=?";
	private static final String path = "C:\\Users\\tejas\\eclipse-workspace\\JDBC\\img\\Screenshot 2026-03-15 211927.png";	
	
	private static Connection con;
	private static PreparedStatement pstmt;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			
			addStud();

			updateStud();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void updateStud() throws SQLException, FileNotFoundException {
		PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY);
		System.out.println("enter the student id to add img");
		int id=sc.nextInt();
		
		FileInputStream fis = new FileInputStream(path);
		pstmt.setBinaryStream(1, fis);		
		pstmt.setInt(2, id);
		
		int res = pstmt.executeUpdate();
		System.out.println(res);
		
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
