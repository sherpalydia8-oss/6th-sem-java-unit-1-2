
import java.awt.Color;
import javax.swing.JFrame;

public class ShapesClass {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Shapes shape = new Shapes();
        shape.setBackground(Color.BLUE);
        frame.add(shape);

        frame.setVisible(true);
    }
}