import java.awt.*;
import java.awt.event.*;
class Form extends Frame
{
    TextField name,pass;
    Choice C=new Choice();
	List Li = new List(5);
	Checkbox C1,C2,C3,C4;
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox R1=new Checkbox("Male",false,cbg);
	Checkbox R2=new Checkbox("Female",false,cbg);
    Button b1;
    Form()
    {
        
        setVisible(true);
        setSize(400,400);
        setTitle("Form");
 
        Label n=new Label("Name:",Label.RIGHT);
        n.setBounds(10,10,150,250);
        Label p=new Label("password:",Label.RIGHT);
        p.setBounds(10,30,100,200);
		
        name=new TextField(10);
        pass=new TextField(10);
        pass.setEchoChar('$');


        b1=new Button("OK");
        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
        this.add(b1);
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
        name.setBounds(200,100,90,20);
        pass.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
 
    }
}