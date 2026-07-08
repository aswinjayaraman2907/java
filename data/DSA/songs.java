import java.util.LinkedList;
public class songs {
public static void main(String[] args) {
    LinkedList<String>sog = new LinkedList<>();

    sog.add("song 1");
    sog.add("song 2"); 
    sog.add("song 3");
    sog.add("song 4");
    sog.add("song 5");

    System.out.println("Linked List:" + sog);
    sog.removeFirst();
    sog.addLast("song 6");
    sog.set(2, "songs5");

    System.out.println("New List:" + sog);
    
}
}