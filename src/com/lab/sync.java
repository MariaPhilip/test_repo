package com.lab;

import java.util.*;
import java.util.Scanner;

class Account
{
double balance,wamt;
Account(double b)
{
balance=b;
}

synchronized public double  withdraw(){
System.out.println("withdraw process started");
System.out.println("Balance before withdrawal:"+balance);
System.out.println("Enter withdrawal amount");
Scanner sc=new Scanner(System.in);
wamt=sc.nextDouble();
if(balance<wamt)
{
	System.out.println("Insufficient balance");
	try
	{
		wait();
	}
	catch(Exception e){}
}
balance=balance-wamt;
System.out.println("Balance after withdrawal"+balance);
return wamt;


}


synchronized public void deposit(double damt)
{
	System.out.println("deposit process started");
	System.out.println("Balance before deposit:"+balance);
	balance=balance+damt;
	System.out.println("Balance after deposit"+balance);
	this.notify();
}

}

class Thread1 implements Runnable
{
Account a;
Thread1(Account a)
{
	this.a=a;
	Thread t=new Thread(this);
	t.start();
}
public void run()
{
	a.withdraw();
}
}


class Thread2 implements Runnable{
Account a;

Thread2(Account a)
{
	this.a=a;
	Thread t=new Thread(this);
	t.start();
}
public void run()
{
	a.deposit(2000);
}
}
public class sync
{
	public static void main(String args[])
	{
		Account acc=new Account(10000);
		new Thread1(acc);
		new Thread2(acc);	
	}
}

