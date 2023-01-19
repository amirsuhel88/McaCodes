import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener {

  public MouseEventExample() {
    addMouseListener(this);
    setSize(300, 300);
    setTitle("Mouse Event Example");
    setVisible(true);
  }

  public void mouseClicked(MouseEvent e) {
    System.out.println("Mouse clicked at x: " + e.getX() + " y: " + e.getY());
  }

  public void mouseEntered(MouseEvent e) {
    System.out.println("Mouse entered the frame");
  }

  public void mouseExited(MouseEvent e) {
    System.out.println("Mouse exited the frame");
  }

  public void mousePressed(MouseEvent e) {
    System.out.println("Mouse pressed");
  }

  public void mouseReleased(MouseEvent e) {
    System.out.println("Mouse released");
  }

  public static void main(String[] args) {
    new MouseEventExample();
  }
}
