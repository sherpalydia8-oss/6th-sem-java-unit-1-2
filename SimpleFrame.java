import javax.swing.*;

public class SimpleFrame {

    SimpleFrame() {
        JFrame frame = new JFrame();

        frame.setTitle("My First Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleFrame();
    }
}