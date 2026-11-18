import java.awt.*; 
import javax.swing.*;
public class GridLayoutExample{
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,3));

        for(int i=1;i<=6;i++){
            frame.add(new JButton("Button"+i));
        }
        frame.setVisible(true);
    }
}