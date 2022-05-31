package com.exam;
import java.util.*;

public class BinarySearchDemo 
{
	public static void main(String ar[])
	{
		int a[]=new int[5]; int mid,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter key to search");
		int key;
		key=sc.nextInt();
		int f=0, l=5;
		
		while(f<=l)
		{
			mid=(f+l)/2;
			
			if(a[mid]==key)
			{
				System.out.println("Key found");
				flag=1;
				break;
			}
			else if(a[mid]<key)
			{
				f=mid+1;
				
			}
			else
			{
				l=mid-1;
			}
		
		}
		if(flag==0)
		{
			System.out.println("Key not found");
		}
		
		
	}
}
