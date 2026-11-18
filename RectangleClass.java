import javax.swing.JFrame;

public class RectangleClass {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Rectangle rect = new Rectangle();

        frame.add(rect);

        frame.setVisible(true);
    }
}