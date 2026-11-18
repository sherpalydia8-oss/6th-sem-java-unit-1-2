import java.awt.*;
import javax.swing.*;
public class ImageDisplay extends JFrame{
    private Image image;
    public ImageDisplay(String filename){
        image = new ImageIcon(filename).getImage();
        setTitle("Image Display");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        }
        @Override
        public void paint(Graphics g){
            super.paint(g);
            if(image !=null){
             g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
    }
    public static void main(String[] args) {
        String filename="cat.jpg";
        new ImageDisplay(filename);
    }
    
}