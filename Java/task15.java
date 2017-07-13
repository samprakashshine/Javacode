//Array
import java.util.*;
class arrayy

{
   static  int c;
    static int call(int a[][])//multi dimentional array
    {
        c=a[0][0];
        return c;
    }
public static void main(String... ar)
{
    int a[][]={{10,20},{30,40}};
    char[] s={'a','b','c','d'};
char[] p=new char[10];

System.out.println(call(a));//passing array to method
    
    for (int i=0;i<2;i++)
    {
        for (int j=0;j<2;j++)
        {

        
        System.out.println(a[i][j]);//printing array
    }
}
System.arraycopy(s,1,p,0,1);//array copy
System.out.println(new String(p));//printing char array
Class y=a.getClass();
String name=y.getName();//getting array class name
System.out.println(name);
}
}

