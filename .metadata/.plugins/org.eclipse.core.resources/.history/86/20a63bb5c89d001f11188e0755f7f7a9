import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionMgt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edubridge";
		user = "root";
		password = "root";
		
		String query1 = "update accounts set balance = balance - 2000 where accno = 112233";
		String query2 = "update accounts set balance = balance + 2000 where accno = 112345";
		
		//Class.forName(driver);)
	
		Connection con = DriverManager.getConnection(url, user, password);//returns connection Object
		
		//1. disable autocommit
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		
		//2.Add to batch
		st.addBatch(query1);
		st.addBatch(query2);
		
		//3.Execute batch
		int[] result = st.executeBatch();
		
		if(result[0] == 1 && result[1] == 1) {
			con.commit();
			System.out.println("transaction Success");
		}else {
			con.rollback();
			System.out.println("Transaction Failed");
		}
	 st.close();
	 con.close();
	
	}

}
