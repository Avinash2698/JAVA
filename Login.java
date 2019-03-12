import java.awt.*;
import java.awt.event.*;
 class Login extends Frame implements ActionListener
{
	TextField t1,t2;
	Button b1;
	String s1,s2;
   Login()
      {
		Label l1= new Label("Name:",Label.CENTER);
		t1= new TextField();
        l1.setBounds(100,75,100,25);
		t1.setBounds(200,75,100,25);
		
		Label l2= new Label("Password:",Label.CENTER);
        t2= new TextField(10);
		l2.setBounds(100,125,100,25);
        t2.setBounds(200,125,100,25);
		
	    b1= new Button("LOGIN");
		b1.setBounds(150,175,100,25);
		
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		
		
		t2.setEchoChar('$');
		 
		b1.addActionListener(this);
		
		setSize(900,700); 
        setLayout(null); 
        setVisible(true); 
	  }
	  public void actionPerformed(ActionEvent ae)
	  {
		  if(ae.getSource()==b1)
		  {
			  s1=t1.getText();
			  s2=t2.getText();
			  if(s1=="ABC" && s2=="123")
			  {
				  Login1 L1=new Login1("Hello Avinash");
				  L1.setVisible(true);
	              this.dispose();		  
			  }
			  else
			  {
				  this.dispose();
			  }
		  }
	  }
   public static void main(String args[])
       {  
        Login L=new Login();
       }
}  