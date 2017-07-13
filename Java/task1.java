
//*Legal declarations of the main function in Java
class main
{
    public static void main(String... a)//working
    //private static void main(String ar[])//not working
    //static void main(String[] ar)//not working (the return type must void becuase the main method doesnot return values)
    //public void main(String a[])// not working(static must need because main function is always variable)
    {
        System.out.println(a[5]);
    }
}