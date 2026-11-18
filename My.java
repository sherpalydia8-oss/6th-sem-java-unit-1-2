import java.awt.*;
import javax.swing.JComponent;

public class My extends JComponent {

    public void paintComponent(Graphics g) {

        Font sansbold14 = new Font("SansSerif", Font.BOLD, 14);

        g.setFont(sansbold14);

        String message = "Hello, Programmer!!";

        g.drawString(message, 75, 100);
    }
}