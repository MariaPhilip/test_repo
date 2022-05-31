package com.exam;


import java.util.Scanner;

public class Palindrome 
{
	public static void main(String a[])
	{
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		s= sc.nextLine();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)!=s.charAt(len-i-1))
			{
				System.out.println("Not Palindrome");
				return;
			}
			
		}
		System.out.println("Palindrome");
	}

}
