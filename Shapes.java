import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class Shapes extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;

        // Draw Line
        Line2D line = new Line2D.Double(
            leftX, topY,
            leftX + width, topY + height
        );

        graphics2D.draw(line);

        // Draw Ellipse
        Ellipse2D ellipse = new Ellipse2D.Double(
            leftX, topY, width, height
        );

        graphics2D.draw(ellipse);
        graphics2D.setPaint(Color.RED);
        graphics2D.drawString("Welcome!", 100, 100);
        graphics2D.setPaint(new Color(255, 0, 0));
    }
}