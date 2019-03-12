import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Ex_Face height=500 width=500>
</applet>
*/
public class Ex_Face extends Applet implements ActionListener
{
	Button B1;
	public void init()
	{
		B1=new Button("Red");
		add(B1);
		B1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==B1)
		{
			setBackground(Color.red);
		}
	}
public void paint(Graphics g)
{
	g.drawLine(100,200,200,200);
	g.drawLine(100,200,50,250);
	g.drawLine(200,200,250,250);
	g.drawLine(0,250,300,250);
	g.drawLine(0,250,0,250);
	g.drawLine(300,250,300,300);
	g.drawLine(0,300,300,300);
	g.fillOval(45,300,25,25);
	g.fillOval(240,300,25,25);
	
}
}	
	