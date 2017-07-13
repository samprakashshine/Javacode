abstract class first
{
    //abstract void hai();//when creating abstract no abstract method is used;
    void first1()
    {
        System.out.println("constructor");
    }
}
class sec extends first{
    void hai()
   {
        System.out.println("hai");

    }
    public static void main(String... a)
    {
first f=new first(){} ;//abstrac run as anonymous class
        f.first1();
    }
}
