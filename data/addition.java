class add {
    void addDetail(int a,int b){
        System.out.println("sum ="+(a+b));
    
       
    }

    void addDetail(int a,int b,int c){
        System.out.println("sum ="+(a+b+c));
    }
   
}
public class addition {
    public static void main(String[] args) {
        add a=new add();
        a.addDetail(10,20);
        a.addDetail(10,20,30);
    }
    
}
