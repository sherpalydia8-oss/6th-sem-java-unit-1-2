import javax.swing.*;
public class MainClass{
    static void main() {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(250,250);
        MyComponent component=new MyComponent();
        frame.add(component);
    }
}