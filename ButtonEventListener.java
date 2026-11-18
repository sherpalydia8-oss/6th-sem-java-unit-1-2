import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonEventListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        JFrame newFrame = new JFrame("Message");
        newFrame.setSize(200, 150);
        newFrame.setLayout(null);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel messageLabel = new JLabel("Button clicked!");
        messageLabel.setBounds(50, 30, 100, 30);

        newFrame.add(messageLabel);
        newFrame.setVisible(true);
    }
}