import java.util.*;
class Student
{
    int rollno;
    String name;
    String dept;
    Student(int rollno,String name,String dept)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;

    }
   public String toString()
    {
        return name+""+rollno+""+dept;
    }
}
class Department
{
    String name;
    List<Student> stud;
    Department(String name,List<Student> stud)
    {
this.name=name;
this.stud=stud;
    }
    List<Student> getStudents()
    {
        return stud;
    }
}
class CompositionTest{
public static void main(String[] args) {
Student student1=new Student(1, "Student1", "Department1");
Student student2=new Student(2, "Student2", "Department1");
Student student3=new Student(3, "Student3", "Department1");

List<Student> students=new ArrayList<Student>();
students.add(student1);
students.add(student2);
students.add(student3);

Department dept=new Department("Department", students);

List<Student> stu=dept.getStudents();

System.out.println(stu);


}
}
