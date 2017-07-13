import java.util.*;

class District
{
    String dist_name;
District(String dist_name)
{
    this.dist_name=dist_name;
}
public String toString()
{
    return dist_name;
}
    
}

class Array_to_Array_List
{
        public static void main(String args[])
    {
        String city_state [] = {"Tamilnadu", "Chennai"};//creating array
        String new_array[]={"kerala","karnataka"};
        ArrayList<String> arrlis=new ArrayList<String>();//creating list
        arrlis.add("kolkatta");//adding element to array
        
        ArrayList<String> s = new ArrayList<String> (Arrays.asList(city_state));//converting array to array list
        System.out.println("" +s);
        s.addAll(arrlis);//adding two string arraylist
        District district1 = new District ("namakkal");
        District district2 = new District ("Erode");
        ArrayList<District> dist = new ArrayList<District>();//creating object arraylist
         ArrayList<District> dist1 = new ArrayList<District>();
       
        dist.add(district1);
        dist1.add(district2);
        System.out.println(" " +dist1);
        dist.addAll(dist1);//adding two object array list
        System.out.println(" " +dist);
        //below are the process to add one string array list and one object arraylist
        List<String> strings = new ArrayList<>(dist.size());//converting object arraylist to string array list
        for (Object object : dist)
        {
            strings.add(Objects.toString(object,null));            
        }
        s.addAll(strings); //adding converted arraylist
     
        System.out.println(" " +s);
        Collections.addAll(s,new_array);//adding a array to a arraylist
        System.out.println(" " +s);

        
        }
    }
