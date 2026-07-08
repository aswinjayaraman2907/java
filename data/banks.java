class bank {
    void bankDetail(){
        System.out.println("BANK NAME : SBI");
    }
}
class an extends bank {
    void accountDetail(){
        System.out.println("ACCOUNT NO :234");
    }
}
class at extends an {
    void typeDetail(){
        System.out.println("ACCOUNT TYPE : SAVING");
    }
}
class intrest extends at{
    void interstDetail(){
         System.out.println("75%");

    }
}
public class banks {
    public static void main(String[] args) {
        intrest n = new intrest();
        n.bankDetail();
        n.accountDetail();
        n.typeDetail();
        n.interstDetail();
    }
    
}
