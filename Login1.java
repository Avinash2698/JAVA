import java.awt.*;
import java.awt.event.*;
class Login1 extends Frame implements ActionListener
{
	TextField t1;
	Button b1;
   Login1(String str)
      {
          t1= new TextField("HELLO AVINASH");
		  t1.setBounds(300,100,150,35);
		  t1.setText(str);
		  
          b1=new Button("EXIT");		  
	      b1.setBounds(300,150,150,35);
		  
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
			  System.exit(0);
		  }
	  }
	  public static void main(String args[])
       {  
        Login1 L1=new Login1("Hello Avinash");
       }
}	  