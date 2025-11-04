import java.util.LinkedList;
import java.util.Scanner;

public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list1 = new LinkedList<>();
        
Scanner sc = new Scanner(System.in);

// for (int i = 0; i < 5; i++) {
// list.add(sc.next());
    
// }


// System.out.println(list);



list1.addFirst("Bani");
list1.addFirst("Sidhu");
list1.addLast("b");
list1.add("a list");
System.out.println(list1);
System.out.println(list1.size());




for (int i = 0; i < list1.size(); i++) {
    System.out.print(list1.get(i)+" -> ");
}
System.out.println("Null");


// list1.removeFirst();
System.out.println(list1);
// list1.removeLast();
System.out.println(list1);
list1.remove(1);
System.out.println(list1);


}
}
