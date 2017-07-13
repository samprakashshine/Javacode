//call by value
class Valu//call by reference is not possible in the java;
{
int a=100;
void call(int a)
{
    a+=a;//here the local value only change
    System.out.println(a);
}
void pass(Valu v)
{
    v.a=v.a+80;//here global value change
    System.out.println(a);
}
public String toString()
{
    return ""+a+"";
}
public static void main(String... ar)
{
    Valu v=new Valu();
    v.call(70);
    v.pass(v);
    System.out.println(v);
}
}
