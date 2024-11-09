import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver, url, user, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb12634";
		user = "root";
		password = "root";
		String deleteQuery = "delete from employee where id =?"; //? is named or positional parameter
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter id : ");
		int id = in.nextInt();
		
		
				
		//1.Loading Driver
		//Class.forName(driver); //Optional
		
		//2.Establish Connection
		Connection con = DriverManager.getConnection(url, user, password);//returns connection Object
		
		//3.Create PreparedStatement Object
		PreparedStatement st = con.prepareStatement(deleteQuery);
		st.setInt(1, id);
		
		
		//4.Process Query (SELECT)
		int status = st.executeUpdate();
		
		if(status >= 1){
			System.out.println("Success");
		}else {
		
			System.out.println("Failed");
		}
		//5.close Resources
		
		st.close();
		con.close();
	}

}
