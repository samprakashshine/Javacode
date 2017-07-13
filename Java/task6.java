
//over riding main method
class override//main method can not be override becuase static methods cannot be override;
{
   void method()

{
  System.out.println("print me first");
}
}
 class next extends override
  {
  void method()
  {
    System.out.println("print me next");
  }
  }
  class main
    {
  public static void main(String... a)//only 2 .. dots are not valid
 
  {
 override obj=new next();
  obj.method();
  }
  }