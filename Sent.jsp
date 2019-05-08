<html>
<body>
<form>
<a href="http://localhost:8080/Avinash/Home_Left.jsp">HOME</a>
<%@ page import="java.sql.* "%>
<%!
String name;
%>
 
<%
   
    name=(String)session.getAttribute("sessname");
    Connection con=null;
	Statement st=null;
	ResultSet rs=null;
 try
		{	

			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files/Apache Software Foundation/Tomcat 8.5/webapps/Avinash/Email.accdb");
			st=con.createStatement();
			rs=st.executeQuery("select * from sent where Host = '"+name+"'");
					   
			out.println("<table align=center cellspacing=10px cellpadding=10px><tr><th>To</th><th>Subject</th><th>Message</th></tr>");
			                             while(rs.next())
			                               {
											   %>
<%out.println("<tr><td>"+rs.getString("To")+"</td><td>"+rs.getString("Subject")+"</td><td><textarea rows=5 cols=50 disabled>"+rs.getString("Message")+"</textarea></td></tr><tr><td></td></tr>");%>
			                               <%
										   }
										   
			out.println("</table>");		
		}
		catch(Exception e)
		{ 
		}		
%>
</form>
</body>
</html>