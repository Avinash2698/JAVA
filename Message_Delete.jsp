 <html>
 <body>
<%@ page import="java.sql.*" %>
<%!
String s1,s2,s3,name;
%>
<%
name=(String)session.getAttribute("sessname");
s1=request.getParameter("c1");
s2=request.getParameter("c2");
s3=request.getParameter("c3");

%>
<%
    Connection con=null;
	Statement st=null;
	PreparedStatement ps,ps2;
 try
			  {
				    
				    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			        con=DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files/Apache Software Foundation/Tomcat 8.5/webapps/Avinash/Email.accdb");
				   	ps=con.prepareStatement("insert into trash(to_email,message,from_email) values('"+s1+"','"+s2+"','"+name+"')");				
				    ps2=con.prepareStatement("Delete from inbox where e_id ="+s3+"");
                    ps.executeUpdate();
					ps2.executeUpdate();
              response.sendRedirect("inbox_action.jsp");
			  }
 catch(Exception e)
	         { 
	         }
%>
           
</body>
</html>
			 