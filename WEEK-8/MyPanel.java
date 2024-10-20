import java.awt.*;

public class MyPanel {
    public static void main(String[] args) {
        Frame f = new Frame("My first use of Panel on Frame!!");
        f.setSize(250, 250);              // Set the size of the frame
        f.setBackground(Color.CYAN);
        f.setLayout(null);                // Use null layout for manual positioning

        Panel p = new Panel();
        p.setBounds(100, 100, 50, 50);    // Set the position and size of the panel
        p.setBackground(Color.ORANGE);

        f.add(p);                         // Add panel to the frame
        f.setVisible(true);               // Make the frame visible
    }
}