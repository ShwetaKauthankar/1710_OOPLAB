import java.sql.*;
import org.mariadb.jdbc.Driver;

public class Main {
	static final String DB_LINK = "jdbc:mariadb://localhost/oop";

	public static void main(String[] args) throws Exception {
		Connection con=null;
		try{
			new Driver();
			con = DriverManager.getConnection(DB_LINK, "root","shweta");
			Statement smt=con.createStatement();
			String sql = "UPDATE Student SET Rollno=? WHERE Name=shweta";
			 
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, "1710");

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing user was updated successfully!");
			}
			con.close();
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}

	}

}
