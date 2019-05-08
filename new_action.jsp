<%!
  String s1,s2;
%>
<%   
s1=request.getParameter("T1");
s2=request.getParameter("T2");
out.println("Name= "+s1+"  And Email ="+s2);
 %>
