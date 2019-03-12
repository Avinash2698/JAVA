import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Text.java height=500 width=500>
</applet>
*/
public class Text extends Applet implements ActionListener,ItemListener
{
Checkbox C1,C2,C3;
Button B;
TextField T1,T2,T3,T4,T5;
String str1,str2,str3,s,s1,s2,s3,s4;
     public void init()
      {
            C1=new Checkbox("Yearly");
			C2=new Checkbox("Halfyearly");
			C3=new Checkbox("Quartyearly");
			T1=new TextField(10);
		    T2=new TextField(10);
			T3=new TextField(10);
		    T4=new TextField(10);
			B=new Button("Ok");
			T5=new TextField(10);
			
			
			add(C1);
			add(C2);
			add(C3);
			add(T1);
			add(T2);
            add(T3);
			add(T4);
			add(B);
			add(T5);
			
			
			B.addActionListener(this);
			C1.addItemListener(this);
            C2.addItemListener(this);
            C3.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
  str1=String.valueOf(C1.getState());
  str2=String.valueOf(C2.getState());
  str3=String.valueOf(C3.getState());
  if(str1=="true"&&str2=="false"&&str3=="false")
  {
	  T2.setEditable(false);
	  T3.setEditable(false);
      T4.setEditable(false);
  }
  else if(str1=="false"&&str2=="true"&&str3=="false")
  {
	  T3.setEditable(false);
      T4.setEditable(false);
  }
  else if(str1=="false"&&str2=="false"&&str3=="true")
  {
	  T1.setEditable(true);
	  T2.setEditable(true);
	  T3.setEditable(true);
      T4.setEditable(true);
  }
  repaint();
}	
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==B&&str1=="true"&&str2=="false"&&str3=="false")
   {
      T2.setEditable(false);
	  T3.setEditable(false);
      T4.setEditable(false);
	  s=T1.getText();
      T5.setText(s);	  
   }
   else if(ae.getSource()==B&&str1=="false"&&str2=="true"&&str3=="false")
   {
	   T3.setEditable(false);
       T4.setEditable(false);
	   s=T1.getText();
	   s1=T2.getText();
	   s4=String.valueOf(Integer.valueOf(s)+Integer.valueOf(s1));
	   T5.setText(s4);
   }
   else if(ae.getSource()==B&&str1=="false"&&str2=="false"&&str3=="true")
   {
	   T1.setEditable(true);
	  T2.setEditable(true);
	  T3.setEditable(true);
      T4.setEditable(true);
	  s=T1.getText();
	  s1=T2.getText();
      s2=T3.getText();
	  s3=T4.getText();
	  s4=String.valueOf(Integer.valueOf(s)+Integer.valueOf(s1)+Integer.valueOf(s2)+Integer.valueOf(s3));
	  T5.setText(s4);
   }
   repaint();
}
}