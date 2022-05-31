package com.exam;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ReverseText implements ActionListener
{
	JFrame jf;
	JButton b1;
	JTextField j1,j2;
	

	ReverseText()
	{	
		jf=new JFrame("Reverse Text");
		j1=new JTextField(15);
		j2=new JTextField(15);
		b1= new JButton("Click");
		
		
		jf.setSize(420,550);
		
		
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.add(j1);
		jf.add(j2);
		jf.add(b1);
		
		
		jf.setVisible(true);
		
		b1.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String str= j1.getText();
			j2.setText("");
			int length=str.length();
			for(int i=length-1;i>=0;i--)
			{
				j2.setText(j2.getText()+str.charAt(i));
			}
			
			
		}
		
	}
	
	public static void main(String a[])
	{
		new ReverseText();
	}
	
}
