import javax.swing.*;

public class EventMainClass {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Press the button");
        label.setBounds(60, 30, 150, 30);
        frame.add(label);

        JButton button = new JButton("Click");
        button.setBounds(80, 100, 100, 40);
        frame.add(button);

        ButtonEventListener listener = new ButtonEventListener();
        button.addActionListener(listener);

        frame.setVisible(true);
    }
}