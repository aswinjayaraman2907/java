import java.util.LinkedList;
public class tarin {
public static void main(String[] args) {
    LinkedList<String>Pass = new LinkedList<>();

    Pass.add("A");
    Pass.add("B"); 
    Pass.add("C");
    Pass.add("D");
    Pass.add("E");

    System.out.println("Linked List:" + Pass);
    Pass.removeFirst();
    Pass.addLast("F");
    Pass.set(2, "Z");

    System.out.println("New List:" + Pass);
    
}
}