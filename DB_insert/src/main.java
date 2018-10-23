import java.sql.*;
import org.mariadb.jdbc.Driver;

public class main {
	static final String DB_LINK = "jdbc:mariadb://localhost/oop";

	public static void main(String[] args) throws Exception {
		Connection con=null;
		try{
			new Driver();
			con = DriverManager.getConnection(DB_LINK, "root","shweta");
			Statement smt=con.createStatement();
			String sql = "INSERT INTO Student (Rollno, Name) VALUES (?, ?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, "1710");
			statement.setString(2, "Shweta");
		 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
		    con.close();
		    
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}

	}

}
