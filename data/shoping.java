class lap{
    void addDetail(String laptop){
        System.out.println("product"+laptop);
    }
    void addDetail1(String mobile,int price){
        System.out.println("product"+mobile+" "+price);
    }
}
public class shoping{
    public static void main(String[] args) {
        lap a=new lap();
        a.addDetail("dell");
        a.addDetail1(null, 0);

    }
}