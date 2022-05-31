package com.exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class EmpForm implements ActionListener
{
	JFrame jf;
	JLabel namel, dobl;
	JTextField name,dob;
	JButton Submit, Calculate;
	
	EmpForm()
	{
		jf=new JFrame("Employee Form");
		namel=new JLabel("Name");
		dobl=new JLabel("DOB");
		name=new JTextField(15);
		dob=new JTextField(15);
		Submit=new JButton("Submit");
		Calculate=new JButton("Calculate");
		
		jf.setSize(400,400);
		jf.setLayout(new FlowLayout());
		
		jf.add(namel);
		jf.add(name);
		jf.add(dobl);
		jf.add(dob);
		jf.add(Calculate);
		jf.add(Submit);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		Submit.addActionListener(this);
		Calculate.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Submit)
		{
			String str=name.getText();
			try
			{
			FileWriter fw= new FileWriter("abc.txt");
			
			fw.write(str);
			fw.close();
			}
			catch(Exception a)
			{
				
			}
		}
		else if(e.getSource()==Calculate)
		{
			//Function write
		}
	}
	
	public static void main(String a[])
	{
		new EmpForm();
	}
}