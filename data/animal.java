class animals {
    void name(){
        System.out.println("lion");
    }
}
class ani extends animals {
     void breed(){
        System.out.println("cross");

     }    
}

public class animal {
      public static void main(String[] args) {
        ani emp = new ani();
        emp.name();
        emp.breed();
      
    }
    
}
    
