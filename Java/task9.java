
//constructor chaining
class chain
{
  
 chain()//working

{
  this(5);
  System.out.println("iam calling a");
}
 chain(int a)
{
  this(6,7);
  System.out.println("iam  calling b"+a);
}
chain(int a,int b)
{
  System.out.println("iam the finishing"+a+""+b);
}
}
class main
{

  public static void main(String... a)
  {
new chain();//this line used for constructor chaining;
new chain(5,8);// constuctor can be call by new only;this line used for cxonstructor over loading
  }
  }