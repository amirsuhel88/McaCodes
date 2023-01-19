import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.CYAN); // Set background color
        
        // Draw a rectangle
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 150, 75);
        
        // Draw an oval
        g.setColor(Color.RED);
        g.fillOval(50, 50, 100, 90);
        
        // Draw a string
        g.setColor(Color.BLACK);
        g.drawString("Hello World!", 75, 60);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Shapes");
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Shapes shapes = new Shapes();
        frame.add(shapes);
        
        frame.setVisible(true);
    }
}
