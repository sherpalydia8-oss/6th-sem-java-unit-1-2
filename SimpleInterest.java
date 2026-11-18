
import javax.swing.*;
import java.awt.event.*;

public class SimpleInterest {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Interest");

        JLabel l1 = new JLabel("Principal:");
        JLabel l2 = new JLabel("Rate:");
        JLabel l3 = new JLabel("Time:");
        JLabel l4 = new JLabel("Simple Interest:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();

        JButton button = new JButton("Calculate");

        l1.setBounds(30, 30, 100, 30);
        t1.setBounds(130, 30, 150, 30);

        l2.setBounds(30, 70, 100, 30);
        t2.setBounds(130, 70, 150, 30);

        l3.setBounds(30, 110, 100, 30);
        t3.setBounds(130, 110, 150, 30);

        l4.setBounds(30, 150, 100, 30);
        t4.setBounds(130, 150, 150, 30);

        button.setBounds(100, 200, 120, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText());
                double t = Double.parseDouble(t3.getText());

                double si = (p * r * t) / 100;

                t4.setText(String.valueOf(si));
            }
        });

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(l4);
        frame.add(t4);
        frame.add(button);

        frame.setSize(330, 280);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
