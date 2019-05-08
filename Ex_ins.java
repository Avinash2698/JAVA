 import java.sql.*;
import java.io.*;
public class Ex_ins
{
	public static void main(String a[])
	 
       {
	         try
			       {
				           DataInputStream ob=new DataInputStream(System.in);
						    int rn;
							String s1,ad1;
							System.out.println("Enter Roll No: ");
							rn=Integer.parseInt(ob.readLine());
							System.out.println("Enter Name: ");
							s1=(ob.readLine());
							System.out.println("Enter Address: ");
							ad1=(ob.readLine());
							Connection con;
							PreparedStatement ps;
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");	     	        con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/INFO_Table.accdb");
ps=con.prepareStatement("insert into Student(roll,sname,sadd) values("+rn+",'"+s1+"','"+ad1+"')");
ps.executeUpdate();
ps.close();
							con.close();
					} catch(Exception e){}}}
