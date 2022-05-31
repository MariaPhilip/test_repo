package com.exam;

import java.util.Scanner;

class Employee
{
	int age,phone,salary;
	String name,address;
	
	Employee()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Address:");
		address=sc.nextLine();
		System.out.println("Enter Age:");
		age=sc.nextInt();
		System.out.println("Enter Phone:");
		phone=sc.nextInt();
		System.out.println("Enter Salary:");
		salary=sc.nextInt();
		
		
	}
	
	void display()
	{
		System.out.println("Name"+name);
		System.out.println("Address"+address);
		System.out.println("Age"+age);
		System.out.println("Phone"+phone);
		printSalary();
		
	}
	
	void printSalary()
	{
		System.out.println("Salary"+salary);
	}
}

class Manager extends Employee
{
	String Specialization;
	
	Manager()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Specialization:");
		Specialization=sc.nextLine();
		
		
	}
	void DisplayManager()
	{	display();
		System.out.println("Specialization"+Specialization);
	}
	
}

class Officer extends Employee
{
	String Department;
	
	Officer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department:");
		Department=sc.nextLine();
		
		
	}
	void DisplayOfficer()
	{	display();
		System.out.println("Department"+Department);
	}
	
}

public class EmpDemo 
{
		public static void main(String a[])
		{	System.out.println("Manager:");
			Manager m=new Manager();
			System.out.println("Officer:");
			Officer o=new Officer();
			
			System.out.println("Manager:");
			m.DisplayManager();
			System.out.println("Officer:");
			o.DisplayOfficer();
		}

}
