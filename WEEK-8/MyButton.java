import java.awt.*;
public class MyButton {
    public static void main(String[] args) {
        Frame f=new Frame("display button");
        Button b=new Button("Hello click me!!");
        f.add(b);
        f.setLayout(null);
        f.setSize(500,500);
        b.setBounds(40,40,100,100);
        f.setVisible(true);
    }
}
