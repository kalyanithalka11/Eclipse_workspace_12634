import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class GetAllEmployeeByName {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12634";
		user = "root";
		password = "root";
		String selectQuery = "select * from employee where name = ?"; //? is named or positional parameter
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter employee name: ");
		String name = in.next();
		
		//1.Loading Driver
		//Class.forName(driver); //Optional
		
		//2.Establish Connection
		Connection con = DriverManager.getConnection(url, user, password);//returns connection Object
		
		//3.Create PreparedStatement Object
		PreparedStatement st = con.prepareStatement(selectQuery);
		st.setString(1, name);
		
		//4.Process Query (SELECT)
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getDouble("mobile"));
			System.out.println(rs.getFloat("salary"));
			System.out.println("-----------------------");
		}else {
			System.out.println("No employee found");
		}
		//5.close Resources
		rs.close();
		st.close();
		con.close();
	}

}
