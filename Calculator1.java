import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator1 extends JFrame implements ActionListener {
    JButton plusb, b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,eq, minb, mulb, divb;
	JLabel l1,l2,l3;
	JTextField t1, t2, t3;
    int num1=0;
    char operator;
    Calculator1()
    {
        t1 = new JTextField();
        t1.setBounds(50,25,170,50);
        add(t1);
        t1.setEditable(false);

        plusb = new JButton("+");
        plusb.addActionListener(this);
        plusb.setBounds(50, 90,50,50);
        add(plusb);

        minb = new JButton("-");
        minb.addActionListener(this);
        minb.setBounds(170, 90,50,50);
        add(minb);

        mulb = new JButton("*");
        mulb.addActionListener(this);
        mulb.setBounds(170, 340,50,50);
        add(mulb);

        divb = new JButton("/");
        divb.addActionListener(this);
        divb.setBounds(50, 340,50,50);
        add(divb);


        eq = new JButton("=");
        eq.addActionListener(this);
        eq.setBounds(110, 90,50,50);
        add(eq);

        b1= new JButton(String.valueOf('1'));;
        b1.addActionListener(this);
        b1.setBounds(50, 160, 50,50);
        add(b1);



        b2= new JButton(String.valueOf('2'));;
        b2.addActionListener(this);
        b2.setBounds(110, 160, 50,50);
        add(b2);

        b3= new JButton(String.valueOf('3'));;
        b3.addActionListener(this);
        b3.setBounds(170, 160, 50,50);
        add(b3);

        b4= new JButton(String.valueOf('4'));;
        b4.addActionListener(this);
        b4.setBounds(50, 220, 50,50);
        add(b4);

        b5= new JButton(String.valueOf('5'));;
        b5.addActionListener(this);
        b5.setBounds(110, 220, 50,50);
        add(b5);

        b6= new JButton(String.valueOf('6'));;
        b6.addActionListener(this);
        b6.setBounds(170, 220, 50,50);
        add(b6);

        b7= new JButton(String.valueOf('7'));;
        b7.addActionListener(this);
        b7.setBounds(50, 280, 50,50);
        add(b7);

        b8= new JButton(String.valueOf('8'));;
        b8.addActionListener(this);
        b8.setBounds(110, 280, 50,50);
        add(b8);

        b9= new JButton(String.valueOf('9'));;
        b9.addActionListener(this);
        b9.setBounds(170, 280, 50,50);
        add(b9);

        b0= new JButton(String.valueOf('0'));;
        b0.addActionListener(this);
        b0.setBounds(110, 340, 50,50);
        add(b0);




        
        setLayout(null);
		setTitle("Calculator");
		setSize(270,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==b1)
        {
            t1.setText(t1.getText().concat(String.valueOf('1')));
        }




        if(e.getSource()==b2)
        {
            t1.setText(t1.getText().concat(String.valueOf('2')));
        }

        if(e.getSource()==b3)
        {
            t1.setText(t1.getText().concat(String.valueOf('3')));
        }

        if(e.getSource()==b4)
        {
            t1.setText(t1.getText().concat(String.valueOf('4')));
        }

        if(e.getSource()==b5)
        {
            t1.setText(t1.getText().concat(String.valueOf('5')));
        }

        if(e.getSource()==b6)
        {
            t1.setText(t1.getText().concat(String.valueOf('6')));
        }

        if(e.getSource()==b7)
        {
            t1.setText(t1.getText().concat(String.valueOf('7')));
        }

        if(e.getSource()==b8)
        {
            t1.setText(t1.getText().concat(String.valueOf('8')));
        }

        if(e.getSource()==b9)
        {
            t1.setText(t1.getText().concat(String.valueOf('9')));
        }

        if(e.getSource()==b0)
        {
            t1.setText(t1.getText().concat(String.valueOf('0')));
        }

        if(e.getSource()==plusb)
        {
            num1= Integer.parseInt(t1.getText());
            operator = '+';
            t1.setText("");
        }

        if(e.getSource()==minb)
        {
            num1= Integer.parseInt(t1.getText());
            operator = '-';
            t1.setText("");
        }

        if(e.getSource()==mulb)
        {
            num1= Integer.parseInt(t1.getText());
            operator = '*';
            t1.setText("");
        }

        if(e.getSource()==divb)
        {
            num1= Integer.parseInt(t1.getText());
            operator = '/';
            t1.setText("");
        }

        


        if(e.getSource()==eq)
        {
            int result=0;
            int num2= Integer.parseInt(t1.getText());
            switch(operator)
            {
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                    
        
            }
            t1.setText(String.valueOf(result));
        }
    }
    public static void main(String[] args)
    {
        Calculator1 ob = new Calculator1();
    }
}
