class phonetype {
    void phonetypeDetail() {
        System.out.println("  android");
    }
}
class phonetype1 extends phonetype {
    void type1Detail() {
        System.out.println("1: i phone ");
    }
}
class phonetype2 extends phonetype {
    void type2Detail() {
        System.out.println(" 2: keypad ");
    }
}
public class phone {
    public static void main(String[] args) {
        phonetype2 d = new phonetype2();
        phonetype1 n = new phonetype1();

        d.phonetypeDetail();
        d.type2Detail();
        n.phonetypeDetail();
        n.type1Detail();
    }
}

