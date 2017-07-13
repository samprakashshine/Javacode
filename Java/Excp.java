class Excp
{
    public static void main(String args [])
    {
        try
        {
            try{
        int arr[]={3,4,5};
        System.out.println(arr[3]);
            }
            catch(Exception x){}
        finally
        {
                System.out.println("Plz check index");

        }
        }
    
    catch(ArrayIndexOutOfBoundsException ar){}
    catch(Exception e){}
finally    {
                System.out.println("Plz check ur index");
    }
    }

}