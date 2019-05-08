import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SCV3 extends Frame implements ItemListener
{

	Label l1,l2,l3;
	CheckboxGroup cbg=new CheckboxGroup();
	Choice C=new Choice();
	Choice C1=new Choice();
	Choice C2=new Choice();
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	ResultSet rs1=null;
	ResultSet rs2=null;
	PreparedStatement ps=null;
	SCV3()
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
		
				
		
        
		Label l3= new Label("Select Village:",Label.CENTER);
		C2.add("Please Select Village");
		 
		 l1.setBounds(100,75,100,25);
		 C.setBounds(200,75,150,25);
		 C1.setBounds(200,125,150,25);
		 l2.setBounds(100,125,100,25);
		 l3.setBounds(100,175,100,25);
		 C2.setBounds(200,175,150,25);
		 add(l1);
		 add(C);
		 add(l2);
		 add(C1);
		 add(l3);
		 add(C2);
		 
		C.addItemListener(this);
		C1.addItemListener(this);
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
			
			
			 
		  }
		  catch(Exception e)
		{ 
		   System.out.println(e);
		}		
		 }
			if(ie.getSource()==C1)
			{
				try{
					String s5;
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			System.out.println("test");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/SCV.accdb");
			System.out.println("test");
			st=con.createStatement();
			s5=C1.getSelectedItem();
			rs2=st.executeQuery("select V_name from Village where C_name='"+s5+"'");
			while(rs2.next())
			{
				
				C2.addItem(rs2.getString("V_name"));
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
        SCV3 S=new SCV3();
       }

}