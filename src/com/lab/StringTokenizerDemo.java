package com.lab;
import java.util.*;
import java.io.*;

public class StringTokenizerDemo 
{
	public static void main(String a[])
	{	int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Intgers:");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		System.out.print("Numbers: ");
		while(st.hasMoreTokens())
		{
			String temp=st.nextToken();
			n=Integer.parseInt(temp);
			sum+=n;
			System.out.print(n+" ");
		}
		System.out.print("Sum: "+sum);
	}
	
}
