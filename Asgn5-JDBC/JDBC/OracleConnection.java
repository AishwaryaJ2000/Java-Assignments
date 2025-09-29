package JDBC;
import java.sql.Connection;
import java.sql.DriverMangers;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnection{
	private static final String DriverMangers = null;

	public static void main(String[]args) throws Exception {
		Class.forName("Oracle.jdbc.driver.OracleDriver");
		Connection con = DriverMangers.getConnection("jdbc:Oracle:then:@localhost:1521:Oracle","System","123");
		Statement st = 	con.createStatement();
		String query = "Select * From employee";
		ResultSet rs =st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		rs.close();
		st.close();
		con.close();
		
	}
}