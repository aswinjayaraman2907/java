import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ASWIN J");
        names.add("sheik");
        names.add("salman");
        names.add("mani");
        names.add("Atthi");

        System.out.println("Array List"+names);
        System.out.println("Get list"+names.get(2));


        names.set(2, "RCAS");
        System.out.println("NEW SET LIST"+names);
        System.out.println("INDEX OF SALMAN"+names.indexOf("salman"));
        names.remove("mani");
        System.out.println("REMOVE LIST"+names.remove("mani"));



    }
}