<%!
   int rno;
%>
<%
     rno=Integer.parseInt(request.getQueryString());
     out.println("Value= "+rno);
%>	 