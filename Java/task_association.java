import java.util.*;
class Planets
{
    String name;
    Planets(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return (this.name);
    }
}
class Solar
{
String name;
List<Planets> sollist;
Solar(String name,List<Planets> sollist)
{
    this.name=name;
    this.sollist=sollist;
}
/*public List<Planets> toString()
{
    return (this.name+""+this.sollist);
}*/
public List<Planets> getnum()
{
    return sollist;
}
}
class Gx
{
   String name;
   List<Solar> gxlist;
   Gx (String name,List<Solar> gxlist)
   {
       this.name=name;
       this.gxlist=gxlist;
   }
   /*public List<Solar> toString()
   {
       return (this.name+""+this.gxlist);
   }*/
   public int tlNum()
   {
       int ref=0;
       for(Solar s:gxlist)
       {
           
           List<Planets> slist;
           slist=s.getnum();
           for (Planets p:slist)
           {
               ref++;
           }
       }
       return ref;
   }


   }


class Agri{
    public static void main(String... ar){
        Planets p1=new Planets("mercury");
        Planets p2=new Planets("earth");
        Planets p3=new Planets("zoxa");
        Planets p4=new Planets("xepro");
        List<Planets> solarlist=new ArrayList<Planets>();
        List<Planets> outerlist=new ArrayList<Planets>();
        solarlist.add(p1);
        solarlist.add(p2);
        outerlist.add(p3);
        outerlist.add(p4);
        Solar s1=new Solar("sun solar",solarlist);
        Solar s2=new Solar("outer solar",outerlist);
        List<Solar> gxlist=new ArrayList<Solar>();
        gxlist.add(s1);
        gxlist.add(s2);
        Gx g=new Gx("milky way",gxlist);
        System.out.println(g.tlNum());
        System.out.println(gxlist+""+solarlist+""+outerlist);
    }
}