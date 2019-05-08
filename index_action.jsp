<%@ page import="java.sql.*" %>
<%!
  String s1,s2,s4;
%>
<%
    s1=request.getParameter("T6");
	session.setAttribute("sessname",s1); 
    s2=request.getParameter("T7");
    Connection con=null;
	Statement st=null;
	ResultSet rs=null;
 try
		{	
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files/Apache Software Foundation/Tomcat 8.5/webapps/Avinash/Email.accdb");
			st=con.createStatement();
			rs=st.executeQuery("select * from Entry where emailid='"+s1+"' ");
			while(rs.next())
			{
			   s4=rs.getString("password");
			}
			
			  if(s2.equals(s4))
			 {	 			  
		            
		      response.sendRedirect("Home.jsp");
			 }
			 else
			 {
				 response.sendRedirect("Signup2.jsp");
			 }
			
		}
		catch(Exception e)
		{ 
		}
%>


