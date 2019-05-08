import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Welcome extends Frame
  {
     Welcome(String s1)
       {
         Label l1 =new Label();
         setSize(250,250);
         l1.setBounds(120,120,70,20);
         l1.setText("                      Welcome   "+s1);
         add(l1);
      }
 }
public class logindb extends Frame{
	
  Label l1 ;
     Label l2;
     TextField un;
      TextField pas;
      Button b1;
      Button b2;
      Welcome w;
     logindb()
       {
         l1=new Label("username : ");
         l2=new Label("password : ");
         un=new TextField();
         pas=new TextField();
         b1=new Button("OK");
         b2=new Button("CANCEL");

          pas.setEchoChar('$');     
         l1.setBounds(50,50,80,20);
        l2.setBounds(50,90,80,20);
        un.setBounds(150,50,80,20);
        pas.setBounds(150,90,80,20);
        b1.setBounds(70,150,70,20);
        b2.setBounds(170,150,70,20);

     add(l1);
      add(l2);
       add(b1);
        add(b2);
         add(un);
         add(pas);
       setLayout(null);
      setVisible(true);
      setSize(500,500);
 
b1.addActionListener
               ( 
           new ActionListener()
                               {
                public void actionPerformed(ActionEvent e)
                  {
                     try
		{	
			Connection con;
			Statement st;
			ResultSet rs;
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			System.out.println("test");
			con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/My Pc/Desktop/jdbc/access21.accdb");
			System.out.println("test");
			st=con.createStatement();
			rs=st.executeQuery("select * from user");
			while(rs.next())
			{
		          if(pas.getText().equals(rs.getString(2)));
			{
                         setVisible(false);
                       w=new Welcome(rs.getString(1));
                       w.setVisible(true);
                         }
}
			con.close();
		}
		catch(Exception f)
                      { 
                       System.out.println(f);
                      }
	         }
                       
                       }
                  );
				 }
            
     
     
     
        public static void main(String args[])
	       {	
		new logindb();
       } }