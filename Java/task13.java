//to string()
class Animals
{
String name;
int legs;
int life;

/*public String getname() 
{
        return name+""+legs+""+life;//insted of using getname we can use toString;
    }*/
    public String toString()
    {
        return name+""+legs+""+life;
    }

    public void setName(String name,int legs,int life )
     {
        this.name = name;
        this.legs=legs;
        this.life=life;
    }

}

class StudentTest{
public static void main(String args[]){
Animals std=new Animals();
std. setName("john",4,50);
/*System.out.println(std.getname());*///the difference b/w the line length is the adv in toString;
System.out.println(std);

}
}