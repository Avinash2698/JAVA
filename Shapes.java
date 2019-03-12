import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Shapes height=500 width=500>
</applet>
*/
public class Shapes extends Applet  implements ActionListener
{
   Button B1,B2,B3,B4;
  public void init()
	{
		B1=new Button("Square");
		B2=new Button("Rectangle");
		B3=new Button("Oval");
		B4=new Button("Kite");
		add(B1);
		add(B2);
		add(B3);
		add(B4);
		B1.setBounds(50,250,50,50);
		B2.setBounds(250,250,50,50);
		B3.setBounds(450,250,50,50);
		B4.setBounds(650,250,50,50);
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		setLayout(null);
	}
  public void actionPerformed(ActionEvent ae)
  {
	  if(ae.getSource()==B1)
	  {
		  
		  }
	  else if(ae.getSource()==B2)
	  {
		  }
	  else if(ae.getSource()==B3)
	  {
		  
	  }
	  
  }  
public void paint(Graphics g)
{
	g.drawRect(50,80,100,100);
	g.drawRect(250,80,150,100);
	g.drawOval(450,80,100,100);
	g.drawLine(650,120,680,80);
	g.drawLine(680,80,710,120);
	g.drawLine(650,120,680,160);
	g.drawLine(680,160,710,120);
}
}	
	