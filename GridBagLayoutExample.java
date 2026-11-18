import java.awt.*;
import javax.swing.*;
public class GridBagLayoutExample{
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill =GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Button 1"),
        gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Button 2"),
        gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; 
        panel.add(new JButton("Button 3"),
        gbc);
        frame.add(panel);
        frame.setVisible(true);
    }
}