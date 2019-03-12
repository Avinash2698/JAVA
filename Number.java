class Number
{
 int a,b,c;
 public void accept(int m)
 {
   System.out.println("First accept Called");
   a=m;
 }
public void accept(int m,int n)
 {
  System.out.println("Secont accept called");
    a=m;
	b=n;  
  }
public void accept(int m,int n,int p)
 {System.out.println("Third accept called");
  a=m;
b=n;
c=p;
}
public void disp()
{
System.out.println("a= "+a);
System.out.println("b=  "+b);
System.out.println("c= "+c);
}
public static void main(String args[])
{
Number n=new Number();
n.accept(5);
n.disp();
n.accept(10,15,20);
n.disp();
n.accept(40,60);
n.disp();
}
}  