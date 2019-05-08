import java.io.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Ex_entry extends Frame implements ActionListener 
{ 
Label L1,L2,L3,L4,L5; 
TextField T1,T2,T3,l6,l7,l8,l9,l10; 
Checkbox R1,R2; 
Checkbox C1,C2,C3; 
List l1; 
CheckboxGroup cbg=new CheckboxGroup(); 
Button B1,B2; 
Ex_entry() 
{ 
L1=new Label("Name"); 
T1=new TextField(20); 
L2=new Label("Passowrd"); 
T2=new TextField(20); 
L3=new Label("Gender"); 
R1=new Checkbox("MALE",cbg,true); 
R2=new Checkbox("FEMALE",cbg,false); 
L4=new Label("Hobbies"); 
C1=new Checkbox("Cricket"); 
C2=new Checkbox("Football"); 
C3=new Checkbox("Vollyball"); 
L5=new Label("City"); 
l1=new List(0,true); 
B1=new Button("Submit"); 
B2=new Button("Cancel"); 
l6=new TextField(""); 
l7=new TextField(""); 
l8=new TextField(""); 
l9=new TextField(""); 
l10=new TextField(""); 
add(L1); 
L1.setBounds(250,300,50,20); 
add(T1); 
T1.setBounds(310,300,100,20); 
add(L2); 
L2.setBounds(450,300,70,20); 
add(T2); 
T2.setBounds(530,300,100,20); 
add(L3); 
L3.setBounds(250,350,70,50); 
add(R1); 
R1.setBounds(330,350,50,50); 
add(R2); 
R2.setBounds(390,350,60,50); 
add(L4); 
L4.setBounds(250,380,60,50); 
add(C1); 
C1.setBounds(320,380,60,50); 
add(C2); 
C2.setBounds(320,410,60,50); 
add(C3); 
C3.setBounds(320,440,60,50); 
add(L5); 
L5.setBounds(250,480,60,50); 
add(l1); 
l1.setBounds(310,490,70,60); 
l1.add("Lucknow"); 
l1.add("Jaipur"); 
l1.add("Ajmer"); 
l1.add("Amritsar"); 
l1.add("Mumbai"); 
add(B1); 
add(B2); 
B1.setBounds(310,580,80,30); 
B2.setBounds(310,620,80,30); 
B1.addActionListener(this); 
B2.addActionListener(this); 
setLayout(null); 
} 
public void actionPerformed(ActionEvent e) 
{ 
if(e.getSource()==B1) 
{ 
add(l6); 
l6.setBounds(310,680,100,30); 
add(l7); 
l7.setBounds(310,720,100,30); 
add(l8); 
l8.setBounds(310,760,100,30); 
add(l9); 
l9.setBounds(510,680,100,30); 
add(l10); 
l10.setBounds(510,720,100,30); 
l6.setVisible(true); 
l7.setVisible(true); 
l8.setVisible(true); 
l9.setVisible(true); 
l10.setVisible(true); 
 
l6.setText(T1.getText()); 
l7.setText(T2.getText()); 
l8.setText(l1.getSelectedItem()); 
if(C1.getState()==true) 
{l9.setText(""+"Cricket");} 
if(C2.getState()==true) 
{l9.setText(""+"Football");} 
if(C3.getState()==true) 
{l9.setText(""+"Volleyball");} 
if(R1.getState()==true) 
{l10.setText("MALE");} 
if(R2.getState()==true) 
{l10.setText("FEMALE");} 
} 
 
if(e.getSource()==B2) 
{ 
l6.setVisible(false); 
l7.setVisible(false); 
l8.setVisible(false); 
l9.setVisible(false); 
l10.setVisible(false); 
T1.setText(""); 
T2.setText(""); 
C1.setState(false); 
C2.setState(false); 
C3.setState(false); 
} 
} 
public static void main(String s[]) 
{ 
Ex_entry ob=new Ex_entry(); 
ob.setVisible(true); 
}
}
