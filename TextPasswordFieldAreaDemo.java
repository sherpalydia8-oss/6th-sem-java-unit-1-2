
import java.awt.*;
import javax.swing.*;

public class TextPasswordFieldAreaDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("TextField, PasswordField and TextArea Demo");

        f.setSize(350, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        f.add(new JLabel("Name"));
        JTextField tf = new JTextField(10);
        f.add(tf);

        f.add(new JLabel("Password"));
        JPasswordField pf = new JPasswordField(10);
        f.add(pf);
        f.add(new JLabel("Message"));

        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
        );
        f.add(scrollPane);


        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
