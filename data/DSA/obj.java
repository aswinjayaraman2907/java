import java.util.ArrayList;
public class obj {
    public static void main(String[] args) {
        ArrayList<Object>list=new ArrayList<>();
        list.add(10);
        list.add("apple");
        list.add(20);
        list.add("Banana");

        System.out.println("Array List"+list);
        System.out.println("get list"+list.get(2));

        list.set(2, "orange");
        System.out.println("New set"+list);
        System.out.println("Index of value"+list.indexOf("Banana"));

        list.remove(2);
        System.out.println("Remove : "+list);

    }

    
}


    

