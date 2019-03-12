import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Ex_App height=500 width=500>
</applet>
*/
public class Ex_App extends Applet implements ActionListener
{
	Button B;
	TextField T1,T2;
	Label L1,L2;
	String str1="",str2="";
	public void init()
	{
		B=new Button("OK");
		L1=new Label("Name: ");
		L2=new Label("Password: ");
		T1=new TextField(10);
		T2=new TextField(10);
		T2.setEchoChar('*');
		
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(B);
		B.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==B)
	   {  
          str1=T1.getText();
          str2=T2.getText();
          T1.setText("");
          T2.setText("");
          T1.requestFocus();
	   }
       repaint();
    }
  public void paint(Graphics g)
  {
    g.drawString("Ur Name= "+str1,100,200);	  
	g.drawString("Ur password= "+str2,100,240);
  }
}  