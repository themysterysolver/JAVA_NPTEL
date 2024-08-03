
class Former {
    public void display() {
        System.out.println("This is Former Class.");
    }
}
class Latter {
    public void display() {
        System.out.print("This is Latter Class.");
    }
}

public class W02_P1 {
    public static void main(String[] args) {
        Former a=new Former();	
        Latter b=new Latter();
        a.display();
        b.display();
    }
}