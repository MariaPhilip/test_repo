package com.lab;


class ThreadA implements Runnable
{	ThreadDemo d;
	ThreadA(ThreadDemo d)
	{
		this.d=d;
	}
	
	public void run()
	{
		for(int i=51;i<=100;i+=2)
		{
			d.printOdd(i);
		
		}
	}
}

class ThreadB implements Runnable
{	ThreadDemo d;
	ThreadB(ThreadDemo d)
	{
		this.d=d;
	}

	public void run()
	{
		for(int i=50;i<=100;i+=2)
		{
			d.printEven(i);
		}
	}
}
public class ThreadDemo 
{	boolean isEven=true;
	
	public void printEven(int i)
	{	synchronized (this) 
		{
			while(!isEven)
			{	try {
						wait();
					}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
		
		System.out.println("Even"+i);
		isEven=false;
		notify();
		}
	}
	
	public void printOdd(int i)
	{	 synchronized (this) 
		{
			while(isEven)
			{	try {
						wait();
					}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
			System.out.println("Odd"+i);
			isEven=true;
			notify();
		}
	}
	public static void main(String a[])
	{
	
	ThreadDemo d= new ThreadDemo();
	ThreadA m1=new ThreadA(d);
	ThreadB m2=new ThreadB(d);
	
	Thread t1=new Thread(m1);
	Thread t2=new Thread(m2);
	
	t1.start();
	t2.start();
	}
}
