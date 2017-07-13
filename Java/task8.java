
//private constructor
class pcons
{
  //int a;
  //String b;
 public pcons(int a)// cannot acses the private constructor from other class,even not pass any value;

{
  System.out.println("iam private"+a);
}
public  pcons()
{
  System.out.println("iam  private");
}
}
class main{ 

  public static void main(String... a)
  {
pcons obj=new pcons(10);


  }
  }//the main difference b/w the constructor and method is the class name and the method name will be same.