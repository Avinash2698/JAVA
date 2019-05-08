<html>
<head>
   <title>Signin</title>
</head>
<body>
   <form action="index_action.jsp" method=POST>
     <table border=0 align=center>
	 <tr><td>Email id:</td><td><input type=text name=T6 ></td></tr>
	 <tr><td>Password:</td><td><input type=password name=T7 ></td></tr>
	 <tr><td></td><td><a href="http://localhost:8080/Avinash/Signup.jsp">Signup</a></td></tr>
	 <tr><td></td><td><input type=submit value=Signin></td></tr>
	 <tr><td></td><td><% out.println("Incorrect username or password"); %></td></tr>
	 
	 </table>
   </form>
</body>
</html>   