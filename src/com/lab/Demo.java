package com.lab;

import java.util.*;
import java.io.*;

class Employee
{
	String Name;
	String Address;
	int Age;
	int Phone;
	int Salary;
	
	void printSalary()
	{
		System.out.println("Salary:"+Salary);	
	}
	
	Employee()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		Name=sc.nextLine();
		System.out.println("Enter Address:");
		Address=sc.nextLine();
		System.out.println("Enter Age:");
		Age=sc.nextInt();
		System.out.println("Enter Phone:");
		Phone=sc.nextInt();
		System.out.println("Enter Salary:");
		Salary=sc.nextInt();
	}
	
	void displayEmployee()
	{	
		System.out.println("Name:"+Name);
		System.out.println("Address:"+Address);
		System.out.println("Age:"+Age);
		System.out.println("Phone:"+Phone);
		printSalary();
	}
	
}

class Officer extends Employee
{
	String Specialization;	
	Officer()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter specialization:");
		Specialization=sc.nextLine();		
	}
	void displayOfficer()
	{	
		displayEmployee();
		System.out.println("Specialization:"+Specialization);
	}	
}

class Manager extends Employee
{
	String Department;
	Manager()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter department:");
		Department=sc.nextLine();	
	}
	void displayManager()
	{
		displayEmployee();
		System.out.println("Department:"+Department);
	}	
}

public class Demo 
{	public static void main(String a[])
	{
		Officer o=new Officer();
		Manager m=new Manager();
		System.out.println("---------------------------");
		o.displayOfficer();
		System.out.println("---------------------------");
		m.displayManager();
	}
}
