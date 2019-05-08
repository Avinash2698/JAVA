<html>
<body>
<%@ page import="java.sql.* "%>
<%!
String name,s1,s2;
%>
 <a href="http://localhost:8080/Avinash/Home_Left.jsp">Back</a>
<%
     
    name=(String)session.getAttribute("sessname");
	s1="unread";
	s2="read";
    Connection con=null;
	Statement st=null;
	ResultSet rs=null;
 try
		{	

			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files/Apache Software Foundation/Tomcat 8.5/webapps/Avinash/Email.accdb");
			st=con.createStatement();
			rs=st.executeQuery("select * from inbox where sender = '"+name+"'");
			out.println("<table align=center cellspacing=10px cellpadding=10px><tr><th>From</th><th>Subject</th></tr>");
			                             while(rs.next())
			                               { %> 
									   <%
									      String s3=rs.getString("status"); 
     									   if(s3.equals(s1))
											   { %>
<%out.println("<tr><td><b><a href=http://localhost:8080/Avinash/message.jsp?"+rs.getInt("e_id")+">"+rs.getString("From")+"</a></b></td><td>"+rs.getString("Subject")+"</td></tr>");%>
											   <% } %>									 
									
<%  
       String s4=rs.getString("status");
       if(s4.equals(s2))

{ %>
<%out.println("<tr><td><a href=http://localhost:8080/Avinash/message.jsp?"+rs.getInt("e_id")+">"+rs.getString("From")+"</a></td><td>"+rs.getString("Subject")+"</td></tr>");%>

   
<% }%>									<%
										   }
										   
			out.println("</table>");		
		}
		catch(Exception e)
		{ 
		}		
%>
</html>
</body>
