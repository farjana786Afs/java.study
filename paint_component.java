import java.awt.*;
import javax.swing.*;

public class Applet7 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rectangle (Blue - Outline)
        g.setColor(Color.BLUE);
        g.drawRect(30, 30, 100, 50);

        // Filled Rectangle (Cyan)
        g.setColor(Color.CYAN);
        g.fillRect(150, 30, 100, 50);

        // Circle (Red - Outline)
        g.setColor(Color.RED);
        g.drawOval(30, 100, 60, 60);

        // Filled Circle (Pink)
        g.setColor(Color.PINK);
        g.fillOval(120, 100, 60, 60);

        // Line (Green)
        g.setColor(Color.GREEN);
        g.drawLine(30, 200, 200, 200);

        // Rounded Rectangle (Orange)
        g.setColor(Color.ORANGE);
        g.fillRoundRect(220, 100, 100, 60, 20, 20);

        // Text (Black)
        g.setColor(Color.BLACK);
        g.drawString("Different Shapes & Colors", 80, 230);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Shapes Demo");

        Applet7 panel = new Applet7();
        frame.add(panel);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}