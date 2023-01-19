import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyboardEventExample extends JFrame {
  private JTextField textField;

  public KeyboardEventExample() {
    super("Keyboard Event Example");
    setLayout(new FlowLayout());

    textField = new JTextField(10);
    textField.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());
      }

      public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + e.getKeyChar());
      }
    });

    add(textField);

    setSize(300, 300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new KeyboardEventExample();
  }
}
