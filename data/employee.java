class emp {
    void empDetail(int salary){
        System.out.println("NAME :"+salary);
    }
    void empDetail(String salary,int bonas){
        System.out.println("salary"+salary+ " "+"bonas"+bonas);

    }
}

public class employee{
    public static void main(String[] args) {
        emp b=new emp();
        b.empDetail(478987);
        b.empDetail("3465555",85);
    }
    
}
