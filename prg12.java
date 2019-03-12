import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
<applet code=prg12 height=500 width=500>
</applet>
*/

public class prg12 extends Applet implements ActionListener
{
	Button b1;
	Button b2;
	Button b3;
	
	public void init()
	{
	b1=new Button("red");
	b2=new Button("blue");
	b3=new Button("Green");
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	add(b1);
	add(b2);
	add(b3);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
		setBackground(Color.red);
		}
		else if(ae.getSource()==b2)
		{
		setBackground(Color.blue);
		}
		else
		{
		setBackground(Color.green);
		}
	}
	
	public void paint(Graphics g)
	{
	showStatus("D");
	}
}
	