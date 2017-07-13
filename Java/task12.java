//rough programe
class Student
{
String name;
int rollno;
int age;
boolean present=true;

public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void displayName(){
    if (present==true);{
System.out.println(getName());
    }
}
}

class StudentTest{
public static void main(String args[]){
Student std=new Student();
std.setName("john");
std.displayName();

}
}