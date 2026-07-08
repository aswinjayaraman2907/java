class rcas {
    void collegeDetail() {
        System.out.println("COLLEGE NAME : Rathinam");
    }
}
class staff extends rcas {
    void staffDetail() {
        System.out.println(" staff : inform to student monday is holiday");
    }
}
class student extends staff {
    void studentDetail() {
        System.out.println(" student : on monday is holiday informed by management");
    }
}
public class college {
    public static void main(String[] args) {
        student s = new student();
        s.collegeDetail();
        s.staffDetail();
        s.studentDetail();
    }
}
