import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Face height=500 width=500>
</applet>
*/
public class Face extends Applet implements ActionListener
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
	g.drawLine(200,100,300,100);
	
	
}
}	
	