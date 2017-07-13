// final key word
final class one
{
  void m1()
  {
System.out.println("iam first");
  }
}
 
//class two extends one//final class cannot inherited
class two 
{
  final int b=10;
  final int  c;
  static int d;
  two ()
{
  //b=15;//final value cannot alter;
  c=20;//constructer used to assign the value for final parameter;
  //d=20;
  //a=20;
  System.out.println(c);
}
  
final void m2()//final cannot override
{
  System.out.println("iam second");
}

}
class main extends two
{
  /*void m2()
{
  System.out.println("iam third");
}*/
static void three()//static method assign the final values
{
  d=30;
  System.out.println(d);
}

public static void main(String... a)
{
  new main().three();
  new main().m2();
  new two();
}
}