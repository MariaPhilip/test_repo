package com.exam;

import java.io.*;
import java.util.*;
import java.lang.Math;

class Prime implements Runnable
{
	int num;
	Prime(int n)
	{	
		num=n;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try 
		{
				FileWriter fw=new FileWriter("prime1.txt");
				fw.write(num);
				fw.close();
				
		}
		catch(Exception e) 
		{
			System.out.println(e);
			
		}
	}
}

class NotPrime implements Runnable
{
	int num;
	NotPrime(int n)
	{	
		num=n;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try 
		{
				FileWriter fw=new FileWriter("nprime.txt");
				fw.write(num);
				fw.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
			
		}
	}
}
public class ThreadFile 
{
	public static void main(String a[])
	{	int n,flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers:");
		String s=sc.nextLine();
		try 
		{
				FileWriter fw=new FileWriter("abc.txt");
				fw.write(s);
				fw.close();
				
				FileReader fr=new FileReader("abc.txt");
				while((n=fr.read())!=-1)
				{
					for(int i=2;i<=Math.sqrt(n);i++)
					{
						if(n%i==0)
						{
							flag=1;break;
						}
					}
					
					if(flag==0)
					{
						new Prime(n);
					}
					else
					{
						new NotPrime(n);
					}
				}
	
		System.out.println("Written Successfully");
	}
	catch(Exception e)
	{
			
	}
	}

}
