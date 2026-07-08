class college {
    void stuDetail(String name){
        System.out.println("NAME :"+name);
    }
    void stuDetail(String name,int noofdays){
        System.out.println("NAME"+name+ " "+"NO OF DAYS"+noofdays);

    }
}

public class attendance{
    public static void main(String[] args) {
        college b=new college();
        b.stuDetail("ASWIN J");
        b.stuDetail("MANI",85);
    }
    
}
