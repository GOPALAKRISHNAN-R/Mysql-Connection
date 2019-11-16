import java.sql.*;

/**
 * Simple Java program for MySql Connectivity
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class MySqlCon 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/testDb","root","password");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from user");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
