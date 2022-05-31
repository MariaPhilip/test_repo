package com.exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EmployeeForm implements ActionListener
{
	JFrame jf;
	JLabel namel, dobl;
	JTextField name,dob,age;
	JButton b1,b2;
	
	EmployeeForm()
	{
		jf=new JFrame("Employee");
		namel=new JLabel("Name:");
		dobl=new JLabel("DOB:");
		name=new JTextField(15);
		dob=new JTextField(15);
		b1=new JButton("Submit");
		b2=new JButton("Calculate");
		age=new JTextField(20);
		
		jf.setSize(400,400);
		jf.setLayout(new FlowLayout());
		
		
		jf.add(namel);
		jf.add(name);
		jf.add(dobl);
		jf.add(dob);
		jf.add(b1);
		jf.add(b2);
		jf.add(age);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e)
	 {
		 if(e.getSource()==b1)
		 {
			 try
			 {
				 FileWriter fw =new FileWriter("abc.txt");
				 String str=name.getText();
				 fw.write(str);
				 
				 fw.write(dob.getText());
				 fw.close();
			
			 }
			 catch(Exception a)
			 {
				 
			 }
			 
		 }
		 else if(e.getSource()==b2)
		 {
			 int year=Integer.parseInt(dob.getText());
			 int agey=2022-year;
			 age.setText(agey+"");
			 
		 }
	 }

	public static void main(String a[])
	{
		new EmployeeForm();
	}
}

