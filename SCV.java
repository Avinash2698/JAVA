import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SCV extends Frame implements ActionListener
{
    TextField t1;
	Label l1;
	Button b1;
	String s1;
	Connection con=null;
	Statement st=null;
	PreparedStatement ps=null;
	SCV()
	{  
	     Label l1= new Label("Enter State:",Label.CENTER);
		 t1= new TextField();
		 l1.setBounds(100,75,100,25);
		 t1.setBounds(200,75,100,25);
		 b1= new Button("Save");
		 b1.setBounds(150,175,100,25);
		 add(l1);
		 add(t1);
		 add(b1);
		 
		b1.addActionListener(this);
		
		setSize(900,700); 
        setLayout(null); 
        setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
	   if(ae.getSource()==b1)
		 {
              try
			  {
				    s1=t1.getText();
				    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			        System.out.println("test");
			        con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/SCV.accdb");
			        st=con.createStatement();
				   	ps=con.prepareStatement("insert into State(S_name) values('"+s1+"')");
                    ps.executeUpdate();
              }
			  catch(Exception e)
	         { 
	           System.out.println(e);
	         } 
		 }	  
	}
	public static void main(String args[])
       {  
        SCV S=new SCV();
       }
}
