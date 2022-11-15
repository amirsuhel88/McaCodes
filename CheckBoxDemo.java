import java.awt.*;
import javax.swing.*;
public class CheckBoxDemo extends JFrame
{
	CheckBoxDemo()
	{
		JCheckBox c1 = new JCheckBox("GIMT");
		c1.setBounds(100,100,150,50);
		JCheckBox c2 = new JCheckBox("GIPS",true);
		c2.setBounds(100,150, 150,50);
		add(c1);
		add(c2);
		setTitle("CheckBox");
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		CheckBoxDemo ob =new CheckBoxDemo();
	}
}
