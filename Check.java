import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Check.java height=500 width=500>
</applet>
*/
public class Check extends Applet implements ItemListener
{
  Checkbox C1,C2,C3,C4;
  
  public void init()
      {
            C1=new Checkbox("Select All");
			C2=new Checkbox("A");
			C3=new Checkbox("B");
			C4=new Checkbox("C");
			
			
			add(C1);
			add(C2);
			add(C3);
			add(C4);
			
			C1.setBounds(50,30,10,10);
			C2.setBounds(50,50,10,10);
			C3.setBounds(50,70,10,10);
			C4.setBounds(50,90,10,10);
			
			C1.addItemListener(this);
            C2.addItemListener(this);
            C3.addItemListener(this);
			C4.addItemListener(this);
	  }
	  
  public void itemStateChanged(ItemEvent ie)
      {
          str1=String.valueOf(C1.getState());
          if(str1=="true")
              {
			    C2.setState(true);
                C3.setState(true);
                C4.setState(true);				
			  }	
          else
              {
			   C2.setState(false);
                C3.setState(false);
                C4.setState(false);
			  }
  repaint();
			  