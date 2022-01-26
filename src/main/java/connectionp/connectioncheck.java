package connectionp;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectioncheck {
	
	public static Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","4222");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
