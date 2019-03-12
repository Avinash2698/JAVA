import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Ex_Radio height=500 width=500>
</applet>
*/
public class Ex_Radio extends Applet implements ItemListener
{
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox R1=new Checkbox("Male",true,cbg);
	Checkbox R2=new Checkbox("FeMale",true,cbg);
	String s1="",s2="";
	public void init()
	{
	add(R1);
	add(R2);
	R1.addItemListener(this);
	R2.addItemListener(this);
	
	}
public void itemStateChanged(ItemEvent ie)
{
	s1=String.valueOf(R1.getState());
	s2=String.valueOf(R2.getState());
	repaint();
}
public void paint(Graphics g)
{
	g.drawString("Male= "+s1,100,200);
	g.drawString("Female= "+s2,100,240);
}
}	
	