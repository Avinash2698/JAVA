<html>
<body>
<form action="Message_Delete.jsp" method=POST>
<%@ page import="java.sql.* "%>
<%!
String name,s1,s2;
%>
 <a href="http://localhost:8080/Avinash/inbox_action.jsp">Back</a>
<%
    s2=request.getQueryString();
    name=(String)session.getAttribute("sessname");
	s1="read";
    Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps;
 try
		{	

			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files/Apache Software Foundation/Tomcat 8.5/webapps/Avinash/Email.accdb");
			st=con.createStatement();
			rs=st.executeQuery("select * from inbox where e_id='"+s2+"' ");
			                             out.println("<table align=center cellspacing=10px cellpadding=10px>");
			                             while(rs.next())
			                               { String s3=rs.getString("status");
											   %> <% if(s1.equals(s3))
											   {%>
<%out.println("<input type=hidden value="+rs.getString("From")+" name='c1'><input type=hidden value="+rs.getString("Message")+" name='c2'><input type=hidden value="+rs.getInt("e_id")+" name='c3'><tr><td>From:</td><td>"+rs.getString("From")+"</td></tr><tr><td>Subject</td><td>"+rs.getString("Subject")+"</td></tr><tr><td>Message:</td><td><textarea rows=5 cols=50 disabled>"+rs.getString("Message")+"</textarea></td></tr><tr><td></td><td><input type=submit value='Delete Message'></td></tr>");%>
											  <% }%>
										  <%
										   }
										   
			out.println("</table>");
		}
		catch(Exception e)
		{ 
		}	
	ps=con.prepareStatement("update inbox set status='"+s1+"'where sender='"+name+"' ");
    ps.executeUpdate();
    ps.close();	
%>
</form>
</body>
</html>

