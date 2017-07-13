abstract class Person
{
String name;
String gender;
void welcome(){
System.out.println("concrete method");
}
abstract void work();
Person(String name,String gender)//this method does not work as constructor
{
this.name=name;
this.gender=gender;
}
public String toString()
{
return (name+" "+gender);
}
}

class Employee extends Person
{
int employeeid;
Employee(int id,String name,String gender)
{
super(name,gender);
this.employeeid=id;
//this.name=name;
//this.gender=gender;
}
Employee (String name,String gender)
{
super(name,gender);
}

public void work()
{
if(employeeid>=1 && employeeid<5)
{
System.out.println("employee");
}
else if(employeeid>=5)
{
System.out.println("student");
}

else if (employeeid == 0)
{
System.out.println(employeeid+"guest");
}

//System.out.println("abstract method");
}
public String toString()
{
return (employeeid+" "+name+" "+gender);
}

public void welcome()
{
System.out.println("overided");
}
public static void main(String args[])
{
Person emp=new Employee(01,"santhosh","male");//object not created to the person but for employee;
Person emp1=new Employee(02,"nirmal","male");//abstract class cannot create object;
Person emp2=new Employee("sir","male");
System.out.println(emp);
System.out.println(emp1);
System.out.println(emp2);
emp.work();
emp.welcome();
emp1.work();
emp1.welcome();
emp2.work();
emp2.welcome();
}
}