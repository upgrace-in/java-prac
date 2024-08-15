import java.awt.*;
import javax.swing.*;

class circleInRectangle extends JPanel {
    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);

        // design the rectangle
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 200, 150);

        // design the circle
        g.setColor(Color.RED);
        int diameter = Math.min(200, 150);
        g.drawOval(diameter, diameter, diameter, diameter);
    }
}

public class awt {
    public static void main(String[] args) {
        JFrame Frame = new JFrame("Circle in Rectangle");
        circleInRectangle panel = new circleInRectangle();

        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(300, 250);
        Frame.add(panel);
        Frame.setVisible(true);
    }
}