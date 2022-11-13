import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
	JButton plusb, b1;
	JLabel l1,l2,l3;
	JTextField t1, t2, t3;
	Calculator()
	{
	 	l1 = new JLabel("First Number");
	 	l1.setBounds(10,50,150,30);
		add(l1);
		
		l2 = new JLabel("Second Number");
		l2.setBounds(10,90, 150, 30);
		add(l2);
		
		l3 = new JLabel("Result");
		l3.setBounds(10, 130, 150,30);
		add(l3);

		t1 = new JTextField();
	 	t1.setBounds(170, 50, 150,30);
		t1.addActionListener(this);
		add(t1);
		//t1.setEditable(false);
		
		t2 = new JTextField();
		t2.setBounds(170, 90,150,30);
		add(t2);
		
		t3= new JTextField();
		t3.setBounds(170, 130, 150,30);
		add(t3);

	 	plusb= new JButton("add");
		plusb.setBounds(170,250,150,30);
		plusb.addActionListener(this);
	 	add(plusb);
	 	
		b1 = new JButton(String.valueOf('1'));
		b1.setBounds(170,290,50,30);
		add(b1);
		b1.addActionListener(this);

	    
	 	setLayout(null);
		setTitle("Calculator");
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}   
	public void actionPerformed(ActionEvent e)
	{
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		int c;
		if(e.getSource()==plusb)
		{
			c=a+b;
			t3.setText(String.valueOf(c));
		} 

		if(e.getSource()==b1)
		{
			t1.setText(t1.getText().concat(String.valueOf('1')));
		}
	}
	 
	 
	public static void main(String[] args)
	{
		Calculator ob = new Calculator();
	}
}
