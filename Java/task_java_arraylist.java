
import java.util.ArrayList;

class javaarraylist {

static ArrayList<String> list;

public static void main(String[] args) {
create();
read();
update();
delete();
}

static void read() {
for (String s:  list) {
System.out.println(s);
// find an element
//list.contains("element1")) 
}
}

static void create() {
list = new ArrayList<String>();
list.add(0, "element0");
list.add(1, "element1");
list.add(2, "element2");
list.add(3, "element3");
list.add(4, "element4");
list.add(5, "element5");
}

static void update() {
int removepos = 3;
list.set(removepos, "element33");
read();
}

static void delete() {
//http://www.geeksforgeeks.org/remove-element-arraylist-java/
int removepos = 4;
list.remove(removepos);
read();
}
}