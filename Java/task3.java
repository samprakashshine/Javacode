
//main method over loading
class coment
{
     public static void main(String a[])
    {
        System.out.println("hai");
    }
    public static void main(String a[])//main method can be over load but it consume all comment in first one(main) only-it only runs;
  
    {

        System.out.println("hello");
    }
   
    public static void main(String a2,String b2,String c2)
    {
        System.out.println("bye");
    }
}