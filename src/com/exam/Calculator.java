package com.exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener
{
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons= new JButton[10];
	JButton[] functionButtons= new JButton[9];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	JPanel panel;
	
	Font myFont= new Font("Calibri",Font.BOLD,30);
	
	double num1=0, num2=0, result=0;
	char operator;
	
Calculator()
{
	frame= new JFrame("Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(420,550);
	frame.setLayout(null);
	
	textfield= new JTextField();
	textfield.setBounds(50,25,300,50);
	textfield.setFont(myFont);
	textfield.setEditable(false);
	
	functionButtons[0]=addButton= new JButton("+");
	functionButtons[1]=subButton= new JButton("-");
	functionButtons[2]=mulButton= new JButton("*");
	functionButtons[3]=divButton= new JButton("/");
	functionButtons[4]=decButton= new JButton(".");
	functionButtons[5]=equButton= new JButton("=");
	functionButtons[6]=delButton= new JButton("Del");
	functionButtons[7]=clrButton= new JButton("Clr");
	functionButtons[8]=negButton= new JButton("(-)");
	
	for(int i=0;i<9;i++)
	{
		functionButtons[i].addActionListener(this);
		functionButtons[i].setFont(myFont);
		
	}
	
	for(int i=0;i<10;i++)
	{
		numberButtons[i]=new JButton(String.valueOf(i));
		numberButtons[i].addActionListener(this);
		numberButtons[i].setFont(myFont);
		
	}
	
	negButton.setBounds(50,430,100,50);
	delButton.setBounds(150,430,100,50);
	clrButton.setBounds(250,430,100,50);
	
	panel=new JPanel();
	
	panel.setBounds(50,100,300,300);
	panel.setLayout(new GridLayout(4,4,10,10));
	
	panel.add(numberButtons[1]);
	panel.add(numberButtons[2]);
	panel.add(numberButtons[3]);
	panel.add(addButton);
	panel.add(numberButtons[4]);
	panel.add(numberButtons[5]);
	panel.add(numberButtons[6]);
	panel.add(subButton);
	panel.add(numberButtons[7]);
	panel.add(numberButtons[8]);
	panel.add(numberButtons[9]);
	panel.add(mulButton);
	panel.add(decButton);
	panel.add(numberButtons[0]);
	panel.add(equButton);
	panel.add(divButton);
	
	frame.add(panel);
	frame.add(negButton);
	frame.add(delButton);
	frame.add(clrButton);
	frame.add(textfield);
	frame.setVisible(true);
}
	
public static void main(String a[])
{
	 new Calculator();
}

public void actionPerformed(ActionEvent e)
{
	for(int i=0;i<10;i++)
	{
		if(e.getSource()==numberButtons[i])
		{
			textfield.setText(textfield.getText().concat(String.valueOf(i)));
			
		}
	}
	if(e.getSource()==decButton)
	{
		textfield.setText(textfield.getText().concat("."));
		
	}
	
	if(e.getSource()==addButton)
	{
		num1=Double.parseDouble(textfield.getText());
		textfield.setText("");
		operator='+';
	}
}
}
	


