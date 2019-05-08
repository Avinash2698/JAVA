<html>
<body>
<%@ page import="java.sql.* "%>

<table border=0 align=center>
<tr><td><a href="http://localhost:8080/Avinash/Compose.jsp">Compose</a></td></tr>
<%!
  String s=null;
%>
<% 
    String name=(String)session.getAttribute("sessname");   
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
 try
		{	

			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files/Apache Software Foundation/Tomcat 8.5/webapps/Avinash/Email.accdb");
			st=con.createStatement();
			rs=st.executeQuery("select count(*) from inbox where sender = '"+name+"' and status='unread' ");
		        while(rs.next())
				{
					 s = rs.getString(1);
				}
		}
		catch(Exception e)
		{ 
		}
%>			
<tr><td><a href="http://localhost:8080/Avinash/inbox_action.jsp"">inbox</a>(<%out.println(s);%>)</td></tr>
<tr><td><a href="http://localhost:8080/Avinash/Sent.jsp">Sent</a></td></tr>
<tr><td><a href="http://localhost:8080/Avinash/trash.jsp">Trash</a></td></tr>
</table>
</body>
</html>
