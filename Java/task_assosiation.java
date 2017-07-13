class College {
private String name;

College(String name) {
this.name = name;
}

public String getName() {
return name;
}
}


class Student {
private String name;

Student(String name) {
this.name = name;
}

public String getName() {
return name;
}

}



class AssociationTest {

public static void main(String[] args) {
College college = new College("KSR");
Student student = new Student("John");
System.out.println(student.getName() + " is a student of " + college.getName() + " college");
}
}