
class JavaArrays2 {

public static void main(String[] args) {

System.out.println("Hello World");
hello();
delete();
}

static void delete() {
int a[] = { 10, 20, 30, 40, 50 };
int del = 20;
System.out.println("To be deleted value "+ del);
System.out.println("Before Delete");
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
if (a[i] == del) {
a[i]=0;
// for (int j = i; j < (a.length - 1); j++) {
// a[j] = a[j + 1];
//}
}
}
System.out.println("After Deleting");
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
}
}



static void hello() {
System.out.println("Hello");
}
}