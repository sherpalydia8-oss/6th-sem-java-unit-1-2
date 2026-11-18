import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CheckBoxExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("CheckBox and RadioButton Example");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // CheckBoxes
        JCheckBox checkBox1 = new JCheckBox("Engineering");
        JCheckBox checkBox2 = new JCheckBox("BCA");
        JCheckBox checkBox3 = new JCheckBox("BscIT");

        // Radio Buttons
        JRadioButton radioButton1 = new JRadioButton("Engineering");
        JRadioButton radioButton2 = new JRadioButton("BCA");
        JRadioButton radioButton3 = new JRadioButton("BscIT");

        // ButtonGroup for RadioButtons
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        JButton button = new JButton("Show Selected");

        JLabel label = new JLabel("Selected: None");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StringBuilder selected = new StringBuilder("Selected: ");
                if (checkBox1.isSelected()) {
                    selected.append("Engineering ");
                }

                if (checkBox2.isSelected()) {
                    selected.append("BCA ");
                }

                if (checkBox3.isSelected()) {
                    selected.append("BscIT ");
                }
                if (radioButton1.isSelected()) {
                    selected.append("| Radio: Engineering");
                } 
                else if (radioButton2.isSelected()) {
                    selected.append("| Radio: BCA");
                } 
                else if (radioButton3.isSelected()) {
                    selected.append("| Radio: BscIT");
                }

                label.setText(selected.toString());
            }
        });
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}