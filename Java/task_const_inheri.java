class base //constructor cannot be inherited
{
  base()
  {
    System.out.println("im inherited");
  }
}
class der extends base
{
public static void main(String... a)
{
  new der().base();
} 
} 
