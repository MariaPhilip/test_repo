package com.lab;
import java.util.*;
import java.io.*;


public class Palindrome 
{	public static void main(String a[])
	{	int flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		s=s.toLowerCase();
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				System.out.println("Not a Palindrome");
				flag=0;
				break;
			}
				
		}
		if(flag==1)
		{	System.out.println("Palindrome");
		}
		
	}
		
		
}

	
	

