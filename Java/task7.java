
//defult constracter\\ also act as the no arg constructor
class dcons
{
  int a;
  String b;
    dcons()//this is default constructor ,//this is also called as no argument constractor;

{
  System.out.println("print me first");
}
void method()
{
  System.out.println("iam not consrtuctor"+a+""+b);//all method act as defult constractor in printing defualt value;
}

  public static void main(String... a)//only 2 .. dots are not valid
 
  {
dcons obj=new dcons();
obj.method();

  }
  }