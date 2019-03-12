import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Ex_Avi height=500 width=500>
</applet>
*/
public class Ex_Avi extends Applet implements ActionListener,ItemListener
{
	Button B1,B2;
	TextField T1,T2;
	Label L1,L2;
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox R1=new Checkbox("Add",false,cbg);
	Checkbox R2=new Checkbox("Swap",false,cbg);	
	String str1="",str2="";
	int s1,s2,s3,s4,s5;
	public void init()
	{
		B1=new Button("Add");
		B2=new Button("Swap");
		L1=new Label("Enter value of A: ");
		L2=new Label("Enter value of B: ");
		T1=new TextField(10);
		T2=new TextField(10);
		
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(R1);
		add(R2);
		add(B1);
		add(B2);
		B1.addActionListener(this);
		B2.addActionListener(this);
		R1.addItemListener(this);
		R2.addItemListener(this);
	}
public void itemStateChanged(ItemEvent ie)
{
  str1=String.valueOf(R1.getState());
  str2=String.valueOf(R2.getState());
  repaint();
}	
public void actionPerformed(ActionEvent ae)
{
   if(ae.getSource()==B1&&str1=="true"&&str2=="false")
   {
     s1=Integer.valueOf(T1.getText());
	 s2=Integer.valueOf(T2.getText());
	 s3=Integer.valueOf(s1)+Integer.valueOf(s2);
   }
   else if(ae.getSource()==B2&&str2=="true"&&str1=="false");
   {
	   s4=Integer.valueOf(T1.getText());
	   s5=Integer.valueOf(T2.getText());
       s4=s4+s5;
	   s5=s4-s5;
	   s4=s4-s5;
   }   
repaint();
}
public void paint(Graphics g)
{
g.drawString("Sum= "+s3,100,200);
g.drawString("After Swap,Value of A= "+s4,100,230);
g.drawString("Value of B= "+s5,100,260);
}
}   