import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Student extends Frame implements ActionListener

{
	TextField t1,t2;
	Button b1;
	int s1;
	String s2;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
   Student()
      {
		Label l1= new Label("Roll No:",Label.CENTER);
		t1= new TextField();
		t1.setText("100");
		l1.setBounds(100,75,100,25);
		t1.setBounds(200,75,100,25);
		
		Label l2= new Label("Name:",Label.CENTER);
        t2= new TextField(10);
		t2.requestFocus();
		l2.setBounds(100,125,100,25);
        t2.setBounds(200,125,100,25);
		
	    b1= new Button("Save");
		b1.setBounds(150,175,100,25);
		
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		
		
		 
		b1.addActionListener(this);
		
		setSize(900,700); 
        setLayout(null); 
        setVisible(true); 
		
		try
		{
			
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			System.out.println("test");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/INFO_Table.accdb");
			

			st=con.createStatement();
			rs=st.executeQuery("select * from INFO where Rno=(select max(Rno) from INFO)");
			   if(rs.next()==true)       
			   {
				   int i;
				   i=Integer.parseInt(rs.getString("Rno"));
				   i++;
				   
				   t1.setText(""+i);
			   }
			   else
			   {
				   t1.setText("100");
			   }
		}
       catch(Exception e)
	   { 
	      System.out.println(e);
	   } 
   }


	  public void actionPerformed(ActionEvent ae)
	  {
		 if(ae.getSource()==b1)
		 {
			 
              try
		   {
			
			
			   s1=Integer.parseInt(t1.getText());
			   s2=t2.getText();
			   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			   System.out.println("test");
			   con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/INFO_Table.accdb");
						
			   ps=con.prepareStatement("insert into INFO(Rno,Sname) values("+s1+",'"+s2+"')");
               ps.executeUpdate();
               t2.requestFocus(); 
               t2.setText("");			   
  		    
			rs=st.executeQuery("select * from INFO where Rno=(select max(Rno) from INFO)");
			   if(rs.next()==true)
			   {
				   int i;
				   i=Integer.parseInt(rs.getString("Rno"));
				   i++;

				   t1.setText(""+i);
				   t2.requestFocus();
			   }
			   else
			   {
				   t1.setText("100");
			   }
			}
           catch(Exception e)
	         { 
	           System.out.println(e);
	         }         			 
		 }			 
	  }

   
   public static void main(String args[])
       {  
        Student S=new Student();
       }
 }
