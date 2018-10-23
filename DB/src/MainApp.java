import java.sql.*;
import org.mariadb.jdbc.Driver;

public class MainApp {
	static final String DB_LINK = "jdbc:mariadb://localhost/oop";

	public static void main(String[] args) throws Exception {
		Connection con=null;
		try{
			new Driver();
			con = DriverManager.getConnection(DB_LINK, "root","shweta");
			Statement smt=con.createStatement();
			String sampleQuery = "Select * from student";
			ResultSet results=smt.executeQuery(sampleQuery);
			while(results.next()){
				System.out.println("RollNo:" + results.getNString(1) + "     " + "Name:" + results.getString(2) + "     " + "Age:" + results.getNString(3));
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}

	}

}
