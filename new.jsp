<html>
<body>
Hello To All<br>
<%!
      int x=111,i,X;
%>
<%!
           public String disp()
               {
			        return "Hello World";
			   }		   
%>
<br>
         Output=<%disp();%>
<br>
          Output of x=<%=X%><br>
<%
            for(int i=1;i<=10;i++)
                  {
                        %>
                   Value of I=<b><font color=red><%=i%></font></b><br>
                        <%
                  }
%>				  
</body>
</html>