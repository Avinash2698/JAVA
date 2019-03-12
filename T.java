public class T extends Thread
{
 public static void main(String a[])
 {
  Thread th = currentThread();
  System.out.println("Status= "+th);
  th.setName("My");
  th.setPriority(8);
  System.out.println("Status= "+th);
}
}  