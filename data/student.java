class employee {
    void employeeDetail(){
        System.out.println("NAME :  RCAS");
    }
}
class role extends employee {
     void roleDetail(){
        System.out.println("MANAGER ");

     }    
}
class dep extends role {
     void depDetail(){
        System.out.println("DEVELOPER");

     }    
}

public class student {
    public static void main(String[] args) {
        dep emp = new dep();
        emp.employeeDetail();
        emp.roleDetail();
        emp.depDetail();
    }
    
}
