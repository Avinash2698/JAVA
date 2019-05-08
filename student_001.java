import java.sql.*;
import java.io.*;
public class Ex_ins
{
       {
	         try
			       {
				           DataInputStream ob=new DataInputStream(System.in);
						    int rn;
							String s1,ad1;
							System.out.println("Enter Roll No: ");
							rn=Integer.parseINt(ob.readLine());
							System.out.println("Enter Name: ");
							s1=Integer.parseINt(ob.readLine());
							System.out.println("Enter Address: ");
							ad1=Integer.parseINt(ob.readLine());
							Connection con;
							PreparedStatement ps;
							Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			     	        con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/SCV.accdb");
							ps=con.prepareStatement("insert into student values("+rno+",'"+s1+"','"+ad1+"')");
							ps.executeUpdate();
							ps.close();
							con.close();
					}
             catch(Exception e)
                    {}
        }
}		