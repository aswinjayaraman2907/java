class youtubetype {
    void youtubetypeDetail() {
        System.out.println(" YOUTUBE");
    }
}
class coding extends youtubetype {
    void codingDetail() {
        System.out.println("1: JAVA ");
    }
}
class cooking extends youtubetype {
    void cookingDetail() {
        System.out.println(" 2: ALWAYS WELCOMES YOU ");
    }
}
class cartoon extends youtubetype {
    void cartoonDetail(){
        System.out.println("3: DORA");
    }

    
  
    
}
public class youtube {
    public static void main(String[] args) {
        cartoon c = new cartoon();
        cooking k = new cooking();
        coding s = new coding();

        c.youtubetypeDetail();
        c.cartoonDetail();
        k.youtubetypeDetail();
        k.cookingDetail();
        s.youtubetypeDetail();
        s.codingDetail();
    }
}

