import java.awt.*;

class Example extends Frame
{
 Example()
 {
  Button b1= new Button("Ok");
  Label l1= new Label("Name:",Label.RIGHT);
  Label l2= new Label("Password:",Label.RIGHT);
  Label l3= new Label("Gender:",Label.RIGHT);
  Label l4= new Label("Hobbies:",Label.RIGHT);
  Label l5= new Label("City:",Label.RIGHT);
  Label l6= new Label("Semester:",Label.RIGHT);
  Label l7= new Label("Comments:",Label.RIGHT);
  Checkbox c1= new Checkbox("A");
  Checkbox c2= new Checkbox("B");
  Checkbox c3= new Checkbox("C");
  TextArea a1= new TextArea();
  TextField t1= new TextField();
  TextField t2= new TextField();
  Choice ch1= new Choice();
  List li1= new List();
  Checkbox r1=new Checkbox();
  
  r1.setBounds(225,175,50,25);
  l1.setBounds(100,75,100,25);
  l2.setBounds(100,125,100,25);
  l3.setBounds(100,175,100,25);
  l4.setBounds(100,225,100,25);
  l5.setBounds(100,275,100,25);
  l6.setBounds(100,325,100,25);
  l7.setBounds(100,375,100,25);
  
  
  t1.setBounds(225,75,100,25);
  t2.setBounds(225,125,100,25);
    
  c1.setBounds(225,225,50,25);     c2.setBounds(300,225,50,25);     c3.setBounds(375,225,50,25); 

  ch1.setBounds(225,275,100,25);
 
  li1.setBounds(225,325,100,25);
  
  a1.setBounds(225,375,300,200);  b1.setBounds(250,600,50,25);
  
  add(l1);  
  add(l2);  
  add(l3);  
  add(l4);  
  add(l5);  
  add(l6);  
  add(l7);  
  add(c1);  
  add(c2);  
  add(c3);  
  add(a1);  


  add(t1); 
  add(t2);  
  add(b1);  
  add(ch1);
  add(li1);  
  add(a1);
  add(b1);
  add(r1);
  
  t2.setEchoChar('$');

  ch1.addItem("Delhi");ch1.addItem("Jaipur");ch1.addItem("Mumbai");ch1.addItem("Chennai");ch1.addItem("Kolkata");
  
  li1.add("1");li1.add("2");li1.add("3");li1.add("4");li1.add("5"); li1.add("6");li1.add("7");li1.add("8");
  
  setSize(900,700); 
  setLayout(null); 
  setVisible(true);  
}
  
public static void main(String args[]){  
Example f=new Example();
}
}   
  