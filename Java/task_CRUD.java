
import java.util.*;
class Book {
private int id;
private String name, author, publiser;
private int quantity;

public Book(int id, String name, String author, String publiser, int quantity) {
this.id = id;
this.name = name;
this.author = author;
this.publiser = publiser;
this.quantity = quantity;
}

public void setName(String name) {
this.name = name;
}

public String getName(){
return name;
}

@Override
public String toString() {
return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity;
}
}







class BookTest {
static List<Book> books = new ArrayList<Book>();

public static void main(String[] args) {
create();
read();
update();
delete();
}

static void create() {
System.out.println("Creating Books");
System.out.println("*****************************");
Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
//Adding Books to list 
books.add(b1);
books.add(b2);
books.add(b3);
System.out.println("Books Created");
books.forEach(x -> System.out.println(x));
}

static void read() {
System.out.println("Reading Books");
System.out.println("*****************************");
//books.forEach(System.out:rintln);
for (Book book:  books) {
System.out.println(book);
}
}

static void update() {
System.out.println("updating Books");
System.out.println("*****************************");
int updatepos = 0;
books.get(updatepos).setName("C sharp");
books.forEach(System.out::println);
//System.out.println(books.get(updatepos).getName());
//books.forEach(System.out:rintln);
//list.set(updatepos, "element33");
//read();
}

static void delete() {
System.out.println("Deleting Books");
System.out.println("*****************************");
int removepos = 2;
books.remove(removepos);
books.forEach(System.out::println);
}
}

