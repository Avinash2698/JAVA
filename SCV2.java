import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SCV2 extends Frame implements ActionListener,ItemListener
{
    TextField t1;
	Label l1,l2,l3;
	CheckboxGroup cbg=new CheckboxGroup();
	Choice C=new Choice();
	Choice C1=new Choice();
	Button b1;
	String s1,s2,s3;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	ResultSet rs1=null;
	PreparedStatement ps=null;
	SCV2()
	{  
	    Label l1= new Label("Select State:",Label.CENTER);
		C.add("Please Select State");
		
        
		Label l2= new Label("Select City:",Label.CENTER);
		C1.add("Please Select City");
		
		try
		{	
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			System.out.println("test");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/SCV.accdb");
			System.out.println("test");
			st=con.createStatement();
			rs=st.executeQuery("select * from State");
			while(rs.next())
			{
				C.addItem(rs.getString(1));
			}
			con.close();
		}
		catch(Exception e)
		{ 
		   System.out.println(e);
		}		
		
				
		
        
		Label l3= new Label("Enter Village:",Label.CENTER);
		 t1= new TextField();
		 
		 l1.setBounds(100,75,100,25);
		 C.setBounds(200,75,150,25);
		 C1.setBounds(200,125,150,25);
		 l2.setBounds(100,125,100,25);
		 l3.setBounds(100,175,100,25);
		 t1.setBounds(200,175,100,25);
		 b1= new Button("Save");
		 b1.setBounds(150,225,100,25);
		 add(l1);
		 add(C);
		 add(l2);
		 add(C1);
		 add(l3);
		 add(t1);
		 add(b1);
		 
		 C.addItemListener(this);
		 b1.addActionListener(this);
		
		setSize(900,700); 
        setLayout(null); 
        setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
    {
         if(ie.getSource()==C)
		 {
			 try
		  {	
		    String s4;
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			System.out.println("test");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/SCV.accdb");
			System.out.println("test");
			st=con.createStatement();
			s4=C.getSelectedItem();
			rs1=st.executeQuery("select C_name from City where S_name='"+s4+"'");
			while(rs1.next())
			{
				
				C1.addItem(rs1.getString("C_name"));
			}
			con.close();
		  }
		catch(Exception e)
		{ 
		   System.out.println(e);
		}		
		 }
    }	
	public void actionPerformed(ActionEvent ae)
	{
	   if(ae.getSource()==b1)
		 {
              try
			  {
				    s2=C.getSelectedItem();
					s3=C1.getSelectedItem();
				    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			        System.out.println("test");
			        con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/SCV.accdb");
			        st=con.createStatement();
				    s1=t1.getText();
			     	ps=con.prepareStatement("insert into Village(S_name,C_name,V_name) values('"+s2+"','"+s3+"','"+s1+"')");
                    ps.executeUpdate();
                    ps.close();
                    con.close();
			  }
			  catch(Exception e)
	         { 
	           System.out.println(e);
	         }   
		 }	  
	}
	public static void main(String args[])
       {  
        SCV2 S=new SCV2();
       }
}
