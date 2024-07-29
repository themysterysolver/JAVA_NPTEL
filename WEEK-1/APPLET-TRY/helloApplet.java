//Applet in java.applet has been deprecated and marked for removal
import java.applet.Applet;
import java.awt.Graphics;

public class helloApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello world",150,150);
    }
}