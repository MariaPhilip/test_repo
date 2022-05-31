package com.exam;
import java.util.*;

public class CharFrequency 
{	public static void main(String a[])
	{
		String s,c;
		int count=0,len;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string:");
		s=sc.nextLine();
		System.out.println("Enter char:");
		c=sc.nextLine();
		
		len=s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)==c.charAt(0))
				count++;
		}
		
		System.out.println(count);
		
	}

}
