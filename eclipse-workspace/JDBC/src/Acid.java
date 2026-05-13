import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Acid {

    static final String url = "jdbc:mysql://localhost:3306/employee";
    static final String username = "root";
    static final String password = "teju";

    private static final String DEBIT_QUERY =
            "UPDATE employee SET salary = salary - ? WHERE emp_name = ?";

    private static final String CREDIT_QUERY =
            "UPDATE employee SET salary = salary + ? WHERE emp_name = ?";
	private static final String DISPLAY_QUERY = "SELEct * from employee";

    private static Connection con;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, username, password);

            // Start transaction
            con.setAutoCommit(false);
            
            display();
            transaction();
            
            display();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static int updateSender(String sender, int amt) throws SQLException {

        PreparedStatement pstmt = con.prepareStatement(DEBIT_QUERY);

        pstmt.setInt(1, amt);
        pstmt.setString(2, sender);

        return pstmt.executeUpdate();
    }

    private static int updateReceiver(String receiver, int amt) throws SQLException {

        PreparedStatement pstmt = con.prepareStatement(CREDIT_QUERY);

        pstmt.setInt(1, amt);
        pstmt.setString(2, receiver);

        return pstmt.executeUpdate();
    }

    private static void transaction() {

        try {

            System.out.println("Enter sender name:");
            String sender = sc.next();

            System.out.println("Enter receiver name:");
            String receiver = sc.next();

            System.out.println("Enter amount:");
            int amt = sc.nextInt();

            int res1 = updateSender(sender, amt);

            int res2 = updateReceiver(receiver, amt);

            if (res1 > 0 && res2 > 0) {

                con.commit();

                System.out.println("Transaction Successful");
            } else {

                con.rollback();

                System.out.println("Transaction Failed");
            }

        } catch (Exception e) {

            try {
                con.rollback();
                System.out.println("Transaction Rolled Back");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        }
    }
    
    public static void display() throws SQLException {
    	PreparedStatement pstmt =con.prepareStatement(DISPLAY_QUERY);
    	 ResultSet res = pstmt.executeQuery();

    	    System.out.println("-------------------------------------------");
    	    System.out.println("ID\tNAME\tDEPARTMENT\tSALARY");
    	    System.out.println("-------------------------------------------");

    	    while (res.next()) {

    	        int id = res.getInt("emp_id");
    	        String name = res.getString("emp_name");
    	        String dept = res.getString("department");
    	        int salary = res.getInt("salary");

    	        System.out.println(id + "\t" + name + "\t" + dept + "\t\t" + salary);
    	    }  	
 
    }
}