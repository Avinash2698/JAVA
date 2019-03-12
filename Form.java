import java.awt.*;
import java.awt.event.*;
public class Form extends Frame implements ActionListener
{
    Label L1,L2,L3,L4,L5,L6,L7;
	TextField T1,T2;
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox R1=new Checkbox("Male",false,cbg);
	Checkbox R2=new Checkbox("Female",false,cbg);
	Checkbox C1,C2,C3,C4;
	Choice C=new Choice();
	List Li = new List(5);
	TextArea T;
	Button B;

	
	public Form()
	{
	    
        
		L1=new Label("Name: ",L1.RIGHT);
		L2=new Label("Password: ",L2.RIGHT);
		L3=new Label("Gender: ",L3.RIGHT);
		L4=new Label("Hobby: ",L4.RIGHT);
		L5=new Label("City: ",L5.RIGHT);
		L6=new Label("State: ",L6.RIGHT);
		L7=new Label("Comments: ",L7.RIGHT);
		
		
		T1=new TextField(10);
		T2=new TextField(10);
		T2.setEchoChar('$');
		
		C4=new Checkbox("Select All");
		C1=new Checkbox("Cricket");
		C2=new Checkbox("Badminton");
		C3=new Checkbox("Video Games");
		
		C.add("Please Select City");
		C.add("Amritsar");
		C.add("Vijayawada");
		C.add("Jaipur");
		C.add("Mumbai");
		C.add("Chennai");
		C.add("Cochin");
		C.add("Banglore");
		
		
		Li.add("AndhraPradesh");
		Li.add("Punjab");
		Li.add("Maharastra");
		Li.add("Rajasthan");
		Li.add("Tamilnadu");
		Li.add("Kerala");
		Li.add("Karnataka");
		
		T=new TextArea(10,20);
		
		B=new Button("OK");
		
		L1.setBounds(10,10,100,20);
		T1.setBounds(40,10,100,20);
		L2.setBounds(10,30,100,20);
		T2.setBounds(40,10,100,200);
		L3.setBounds(10,50,100,20);

		L4.setBounds(10,70,100,20);
		
		setVisible(true);
        setSize(500,850);
		setLayout(null);
			
		
	}	
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	
	public static void main(String a[])
	{
		Form ob=new Form();
	}
}






	   