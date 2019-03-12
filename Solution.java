class A
{
final int p=10;
void var()
{
p++;
System.out.println(+p);
}
void display()
{
System.out.println("Hi");
}
}
class B extends A
{
void display()
{
super.display();
System.out.println("Bye");}}
class solution
{
public static void main(String args[])
{
B ob=new B();
ob.var();
ob.display();
}}