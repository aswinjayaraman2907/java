import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);

        System.out.println("Array List"+num);
        System.out.println("Get list"+num.get(2));


        num.set(2, 1000);
        System.out.println("NEW SET LIST"+num);
        System.out.println("INDEX OF 40"+num.indexOf(40));
        num.remove(5);
        System.out.println("REMOVE LIST"+num.remove(50));



    }
}