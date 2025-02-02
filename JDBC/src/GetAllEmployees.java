import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetAllEmployees {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12634";
		user = "root";
		password = "root";
		String selectQuery = "select * from employee";
		
		//1.Loading Driver
		//Class.forName(driver); //Optional
		
		//2.Establish Connection
		Connection con = DriverManager.getConnection(url, user, password);//returns connection Object
		
		//3.Create Statement Object
		Statement st = con.createStatement();
		
		//4.Process Query (SELECT)
		ResultSet rs = st.executeQuery(selectQuery);
		
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getDouble("mobile"));
			System.out.println(rs.getFloat("salary"));
			System.out.println("-----------------------");
		}
		//5.close Resources
		rs.close();
		st.close();
		con.close();
	}

}
