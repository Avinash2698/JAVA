import java.sql.*;
public class dbs
{
	public static void main(String args[])
	{	
		try
		{	
			Connection con;
			Statement st;
			ResultSet rs;
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			System.out.println("test");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/Avinash.accdb");
			System.out.println("test");
			st=con.createStatement();
			rs=st.executeQuery("select * from Office");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" , "+rs.getString(2));
			}
			con.close();
		}
		catch(Exception e){ System.out.println(e);}
	}
}
