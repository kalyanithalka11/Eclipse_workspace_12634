class fruits {
    String a = "Banana";
    String b = "Apple";
}
class fruit extends fruits {
   String a = "Sapota";
   String c = "Guva";
    
    void add(String a, String b) {
        System.out.println(a + b);
        System.out.println(this.a + this.b);
        System.out.println(super.a + super.b);
        System.out.println(a);
        System.out.println(b);
    }
}
public class Fruits{
    public static void main(String[] args) {
        fruit c = new fruit();
        c.add("guva", "Banana");
    }
}