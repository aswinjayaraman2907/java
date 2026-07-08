import java.util.ArrayList;
public class student {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(70);
        num.add(30);
        num.add(50);
        num.add(50);
        num.add(60);
        num.add(60);

        System.out.println("Array List"+num);
        System.out.println("Get list"+num.get(0));


        num.set(1, 50);
        System.out.println("NEW SET "+num);
        
        num.remove(4);
        System.out.println("REMOVE LIST"+num);
        System.out.println("Final List"+num);



    }
}