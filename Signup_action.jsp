<%@ page import="java.sql.*" %>
<%!
  String s1,s2,s3,s4,s5;
%>
<% 
s1=request.getParameter("T1");
s2=request.getParameter("T2");
s3=request.getParameter("T3");
s4=request.getParameter("T4");
s5=request.getParameter("T5");
%>
<%
	Connection con=null;
	PreparedStatement ps=null;
	try
			  {
				    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			        con=DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files/Apache Software Foundation/Tomcat 8.5/webapps/Avinash/Email.accdb");
				   	ps=con.prepareStatement("insert into Entry(E_name,emailid,password,contactno,gender) values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
                    ps.executeUpdate();
              }
			  catch(Exception e)
	         { 
	         } 
response.sendRedirect("index.jsp");
%>  
