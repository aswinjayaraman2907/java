class run{
    void order(){
        System.out.println("food");
    }
}
class fod extends run{
    void order(){
        System.out.println("pizza");
    }
}
public class food {
    public static void main(String[] args) {
        run o=new fod();
        o.order(); 
    }
}
