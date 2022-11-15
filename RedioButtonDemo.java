import java.awt.*;
import javax.swing.*;
public class RadioButtonDemo extends JFrame
{
	RadioButtonDemo()
	{
		JRadioButton rb1 = new JRadioButton("Easy", true);
		JRadioButton rb2 = new JRadioButton("Medium");
		JRadioButton rb3 = new JRadioButton("Hard");
		add(rb1);
		add(rb2);
		add(rb3);
		
		setTitile("Radio Button Demo");
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		RadioButtonDemo ob = new RadioButton();
	}
}
