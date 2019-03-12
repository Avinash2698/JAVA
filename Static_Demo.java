class Static_Demo
{
 int a=10;
 static int b;
 public void disp()
 {
 System.out.println("a= "+a);
 System.out.println("b= "+b); 
 }
 public void show()
{
System.out.println("b= "+b);
}
public void input()
{
b=50;
}
public static void main(String args[])
{
Static_Demo p= new Static_Demo();
Static_Demo q= new Static_Demo();
p.show();
p.input();
p.disp();
p.show();
q.show();
q.input();
q.disp();
q.show();
p.b=100;
p.disp();
q.disp();
}
}
 