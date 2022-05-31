package com.exam;

import java.util.*;

public class StringTokenizerDemo 
{
		public static void main(String a[])
		{	
			String s;int n,sum=0;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter integers:");
			s=sc.nextLine();
			StringTokenizer st=new StringTokenizer(s," ");
			
			while(st.hasMoreTokens())
			{
				String temp=st.nextToken();
				n=Integer.parseInt(temp);
				sum+=n;
				System.out.println(n+" ");
			
			}
			System.out.println("Sum"+sum);
		}

}
