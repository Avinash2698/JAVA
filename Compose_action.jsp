 <html>
 <body>
<%@ page import="java.sql.*" %>
<%!
String s1,s2,s3,name,s4;
String s5[];
%>
<%
name=(String)session.getAttribute("sessname");
s1=request.getParameter("T10");
s2=request.getParameter("T11");
s3=request.getParameter("T12");
s4="unread";
s5 = s1.split(";");
%>
<%
    Connection con=null;
	Statement st=null;
	PreparedStatement ps,ps2;
 try
			  {
				    
				    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			        con=DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files/Apache Software Foundation/Tomcat 8.5/webapps/Avinash/Email.accdb");
			      for(int i=0;i<s5.length;i++)
				  {  st=con.createStatement();
				   	ps=con.prepareStatement("insert into sent(To,Subject,Message,Host) values('"+s5[i]+"','"+s2+"','"+s3+"','"+name+"')");
					ps2=con.prepareStatement("insert into inbox(From,Subject,Message,sender,status) values('"+name+"','"+s2+"','"+s3+"','"+s5[i]+"','"+s4+"')");
                    ps.executeUpdate();
				  ps2.executeUpdate(); }
              }
 catch(Exception e)
	         { 
	         }
%>
           <table border=0 align=center>
		 <tr><td><a href="http://localhost:8080/Avinash/Home_Left.jsp">HOME</a></td></tr>
         <tr><td><% out.println("Message Sent Successfully"); %></td></tr>
		   </table>
</body>
</html>
			 