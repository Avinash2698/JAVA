import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SCV1 extends Frame implements ActionListener
{
    TextField t1;
	Label l1;
	CheckboxGroup cbg=new CheckboxGroup();
	Choice C=new Choice();
	Button b1;
	String s1,s2;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	String str,str2;
	SCV1()
	{  
	    Label l1= new Label("Select State:",Label.CENTER);
		C.add("Please Select State");
		
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
	

		Label l2= new Label("Enter City:",Label.CENTER);
		 t1= new TextField();
		 l1.setBounds(100,75,100,25);
		 C.setBounds(200,75,150,25);
		 t1.setBounds(200,125,100,25);
		 l2.setBounds(100,125,100,25);
		 b1= new Button("Save");
		 b1.setBounds(150,175,100,25);
		 add(l1);
		 add(C);
		 add(l2);
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
				    s2=C.getSelectedItem();
				    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			        System.out.println("test");
			        con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Java/Database/jdbc/SCV.accdb");
			        st=con.createStatement();
				    s1=t1.getText();
			     	ps=con.prepareStatement("insert into City(S_name,C_name) values('"+s2+"','"+s1+"')");
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
        SCV1 S=new SCV1();
       }
}

