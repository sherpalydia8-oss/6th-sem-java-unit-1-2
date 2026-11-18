import java.awt.Graphics;
import javax.swing.JComponent;

public class MyComponent extends JComponent {

    public void paintComponent(Graphics g) {
        g.drawString("Hello Students", 70, 70);
    }
}