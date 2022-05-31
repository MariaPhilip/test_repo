package com.lab;

import java.util.*;
import java.io.*;

public class BinarySearch 
{	
	public static void main(String ar[])
	{	Scanner sc=new Scanner(System.in);
		int n;
		int a[]=new int[20];
		System.out.println("Enter number of elements:");
		n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter value to search");
		int value=sc.nextInt();
		
		int f=0,l=n,flag=0;
		int mid;
		while(f<=l)
		{	mid=((f+l)/2);
			if(a[mid]==value)
			{	flag=1;
				System.out.println(value+" found at "+(mid+1)+" position");
				break;
			}
			else if(a[mid]<value)
			{	f=mid+1;
			}
			else
			{	l=mid-1;
			}
		}
		if(flag==0)
		{	System.out.println(value+"not found");
		}
	}
	
}


