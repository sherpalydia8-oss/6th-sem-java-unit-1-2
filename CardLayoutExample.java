import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.*;

public class CardLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("CardLayout Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        CardLayout cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        JButton btn1 = new JButton("Card 1");
        JButton btn2 = new JButton("Card 2");
        JButton btn3 = new JButton("Card 3");

        panel.add(btn1, "1");
        panel.add(btn2, "2");
        panel.add(btn3, "3");

        JPanel buttonPanel = new JPanel();

        JButton nextButton = new JButton("Next");

        nextButton.addActionListener(e -> {
            cardLayout.next(panel);
        });

        buttonPanel.add(nextButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}