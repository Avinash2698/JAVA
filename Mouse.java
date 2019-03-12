import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
<applet code=Mouse.java height=500 width=500>
</applet>
*/
public class Mouse extends Applet implements MouseMotionListener
{
String s=" ";
int x,y;
public void init()  
{
    x=0;y=0;
   addMouseMotionListener(this);
   addMouseMotionListener(this);
}   
public void mouseMoved(MouseEvent me)
{
x=me.getx();
y=me.gety();
s+="Mouse Moved...at"+x+","+y;
repaint();
}
public void mouseDragged()
{
s="Mouse Dragged";
repaint();
}
public void paint(Graphics g)
{
g.drawString("s",100,200);
}
}