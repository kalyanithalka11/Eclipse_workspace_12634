package snippet;

public class callableStatementdemo {
	package jdbc;

	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class CallableStementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver,url,user,password;
		driver="com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/db123";
		user = "root";
		password = "Sairam@1439";
		String procedure ="{call getAllemployee()}";
		
		Class.forName(driver);
		
		Connection con= DriverManager.getConnection(url,user,password);
		
		CallableStatement st= con.prepareCall(procedure);
		
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("salary"));
			System.out.println(rs.getString("gender"));
			System.out.println(rs.getLong("city"));
			}
		rs.close();
		st.close();
		con.close();
		
	}
	}
}
