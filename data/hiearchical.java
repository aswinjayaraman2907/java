class hospital {
    void hospitalDetail() {
        System.out.println("hospital NAME : rrs");
    }
}
class doctor extends hospital {
    void doctorDetail() {
        System.out.println(" patient is in critical ");
    }
}
class nurse extends hospital {
    void nurseDetail() {
        System.out.println(" nurse is another doctor ");
    }
}
public class hiearchical {
    public static void main(String[] args) {
        doctor d = new doctor();
        nurse n = new nurse();

        d.hospitalDetail();
        d.doctorDetail();
        n.hospitalDetail();
        n.nurseDetail();
    }
}

