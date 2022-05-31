package com.lab;

import java.util.*;
import java.io.*;

public class CharFrequency 
{
	public static void main(String a[])
	{	
		int count=0; 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("Frequecy of"+ch+"="+count);
	
		
		
		
	}

}
