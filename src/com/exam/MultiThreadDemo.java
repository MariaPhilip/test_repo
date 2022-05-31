package com.exam;

import java.util.*;
import java.io.*;

class Even extends Thread
{
	int x;
	Even(int e)
	{
		x=e;
	}
	public void run()
	{
		System.out.println("Square:"+(x*x));
	}
	
}

class Odd extends Thread
{
	int x;
	Odd(int o)
	{
		x=o;
	}
	public void run()
	{
		System.out.println("Cube:"+(x*x*x));
	}
	
}

class Number extends Thread
{	int r;
	public void run()
	{	Random random=new Random();
		for(int i=0;i<5;i++)
		{
			r=random.nextInt(100);
			System.out.println("Random Integer:"+r);
			
			if(r%2==0)
			{
				Even e=new Even(r);
				e.start();
			}
			else
			{
				Odd o=new Odd(r);
				o.start();
			}
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
			
		}
	}
}
public class MultiThreadDemo 
{
	public static void main(String a[])
	{
		Number n=new Number();
		n.start();
	}
}
