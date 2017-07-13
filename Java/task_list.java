import java.util.*;//Arraylist
class Animals
{
    String name,color,type;
    int leg;
    public  Animals(String name,String color,String type,int leg)
    {
        this.name=name;
        this.color=color;
        this.type=type;
        this.leg=leg;
    }
  
}
class main
{
    public static void main(String... ar)
    {
        List <Animals> list=new ArrayList <Animals>();
        Animals a1= new Animals("tiger","yello","mamals",4);
        Animals a2= new Animals("crow","black","bird",2);
        list.add(a1);
        list.add(a2);
        for(Animals a:list)
        System.out.println(a.name+""+a.color+""+a.type+""+a.leg);

    }
}