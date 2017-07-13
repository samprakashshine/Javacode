
//constructor return value
class constr
{
   int constr()//this not shows any error but return no values at all;
   {
       System.out.println("i will not exucute");
       return 8;
   }
    public static void main(String a[])
    {

        System.out.println("iam main function");
        constr obj;
        obj=new constr();
        obj.constr();
    }
   
}