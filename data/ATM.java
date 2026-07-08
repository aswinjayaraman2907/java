class bank {
    void bankDetail(int amount){
        System.out.println("AMOUNT"+amount);
    }
    void bankDetail(int amount,String type){
        System.out.println("AMOUNT"+amount+ " "+"TYPE"+type);

    }
}

public class ATM {
    public static void main(String[] args) {
        bank b=new bank();
        b.bankDetail(100000);
        b.bankDetail(500000,"savings");
    }
    
}
